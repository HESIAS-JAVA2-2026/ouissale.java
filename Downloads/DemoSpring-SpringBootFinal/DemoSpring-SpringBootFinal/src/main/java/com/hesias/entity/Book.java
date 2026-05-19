package com.hesias.entity;

import jakarta.persistence.*; // Pour Spring Boot 3.x (Jakarta EE 9+)

@Entity
@Table(name = "books") // Nom de la table en BDD
public class Book {

    @Id // Clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrément
    private Long id;

    @Column(name = "title")
    private String title;

    // Constructeurs (obligatoires pour JPA)
    public Book() {} // Constructeur par défaut

    public Book(String title) {
        this.title = title;
    }

    // Getters et Setters (obligatoires pour JPA)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{id=" + id + ", title='" + title + "'}";
    }
}

