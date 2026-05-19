package com.hesias.service;

import com.hesias.entity.Book;
import com.hesias.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indique que c'est un service Spring
public class BookService {

    private final BookRepository bookRepository;

    // Injection de dépendance (constructor injection)
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Méthodes CRUD personnalisées (exemple)
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
