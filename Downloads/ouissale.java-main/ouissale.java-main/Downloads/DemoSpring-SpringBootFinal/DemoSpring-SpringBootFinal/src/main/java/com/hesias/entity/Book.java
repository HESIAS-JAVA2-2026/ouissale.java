package com.hesias.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

    public Book() {}

    public Book(String title) {
        this.title = title;
    }

    // GETTERS / SETTERS

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Library getLibrary() {
        return library;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return id != null && id.equals(book.id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Book{id=" + id + ", title='" + title + "'}";
    }
}
