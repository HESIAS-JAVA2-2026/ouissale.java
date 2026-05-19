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
        // Ajouter des livres
        Book book1 = new Book("Hesias");
        bookService.saveBook(book1);

        Book book2 = new Book("Hesias2");
        bookService.saveBook(book2);

        // Afficher tous les livres
        System.out.println("Tous les livres :");
        bookService.getAllBooks().forEach(System.out::println);

        // Supprimer un livre
        bookService.deleteBook(book2.getId());
        System.out.println("Après suppression :");
        bookService.getAllBooks().forEach(System.out::println);
    }
}
