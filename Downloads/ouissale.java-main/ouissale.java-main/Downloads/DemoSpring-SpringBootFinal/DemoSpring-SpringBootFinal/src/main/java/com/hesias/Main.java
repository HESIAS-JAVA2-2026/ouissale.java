package com.hesias;

import com.hesias.entity.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    private final BookService bookService;

    public Main(BookService bookService) {
        this.bookService = bookService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {

        Long libraryId = 1L;

        try {
            Book book1 = new Book("Hesias");
            Book book2 = new Book("Hesias2");

            bookService.addBookToLibrary(libraryId, book1);
            bookService.addBookToLibrary(libraryId, book2);

            System.out.println("Livres de la bibliothèque :");

            bookService.getBooksByLibrary(libraryId)
                    .forEach(book -> System.out.println(
                            "ID: " + book.getId() +
                                    " | Title: " + book.getTitle()
                    ));

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
