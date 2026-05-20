package com.hesias.repository;

import com.hesias.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Optionnel mais recommandé
public interface BookRepository extends JpaRepository<Book, Long> {
    // Spring Data JPA génère automatiquement les méthodes CRUD :
    // save(), findById(), findAll(), deleteById(), etc.
}
