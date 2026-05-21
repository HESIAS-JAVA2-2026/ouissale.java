package com.hesias.rest;

import com.hesias.entity.Book;
import com.hesias.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/library/{libraryId}")
    public List<Book> getBooksByLibrary(@PathVariable Long libraryId) {
        return bookService.getBooksByLibrary(libraryId);
    }

    @PostMapping("/library/{libraryId}")
    public Book addBookToLibrary(@PathVariable Long libraryId, @RequestBody Book book) {
        return bookService.addBookToLibrary(libraryId, book);
    }
}
