package com.hesias;

import com.hesias.entity.Library;
import com.hesias.repository.LibraryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }

    public Optional<Library> getLibraryById(Long id) {
        return libraryRepository.findById(id);
    }

    public Library addLibrary(String name) {
        Library library = new Library();
        library.setName(name);
        return libraryRepository.save(library);
    }

    public Library updateLibraryName(Long id, String newName) {
        Library library = libraryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Librairie introuvable avec l'id: " + id));
        library.setName(newName);
        return libraryRepository.save(library);
    }

    public void deleteLibrary(Long id) {
        if (!libraryRepository.existsById(id)) {
            throw new RuntimeException("Librairie introuvable avec l'id: " + id);
        }
        libraryRepository.deleteById(id);
    }
}