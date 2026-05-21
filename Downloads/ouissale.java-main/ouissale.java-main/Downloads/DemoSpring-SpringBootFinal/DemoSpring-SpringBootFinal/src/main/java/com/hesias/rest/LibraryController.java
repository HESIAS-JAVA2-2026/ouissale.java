package com.hesias.rest;

import com.hesias.entity.Library;
import com.hesias.repository.LibraryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libraries")
public class LibraryController {

    private final LibraryRepository libraryRepository;

    public LibraryController(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @GetMapping
    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }

    @PostMapping
    public Library createLibrary(@RequestBody Library library) {
        return libraryRepository.save(library);
    }
}
