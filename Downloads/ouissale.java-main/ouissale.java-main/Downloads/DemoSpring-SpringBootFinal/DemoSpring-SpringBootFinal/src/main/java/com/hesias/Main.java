package com.hesias;

import com.hesias.entity.Book;
import com.hesias.service.BookService;
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

        Book book1 = new Book("Hesias");
        Book savedBook1 = bookService.save(book1);

        Book book2 = new Book("Hesias2");
        Book savedBook2 = bookService.save(book2);

        System.out.println("Tous les livres :");
        bookService.findAll().forEach(book ->
                System.out.println("ID: " + book.getId() + " | Title: " + book.getTitle())
        );

        bookService.deleteById(savedBook2.getId());

        System.out.println("Après suppression :");
        bookService.findAll().forEach(book ->
                System.out.println("ID: " + book.getId() + " | Title: " + book.getTitle())
        );
    }
}
