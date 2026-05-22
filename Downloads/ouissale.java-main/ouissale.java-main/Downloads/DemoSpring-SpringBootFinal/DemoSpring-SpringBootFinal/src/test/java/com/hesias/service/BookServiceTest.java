package com.hesias.service;

import com.hesias.entity.Book;
import com.hesias.entity.Library;
import com.hesias.repository.BookRepository;
import com.hesias.repository.LibraryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @Mock
    private LibraryRepository libraryRepository;

    @InjectMocks
    private BookService bookService;

    @Test
    void shouldAddBookToLibrary() {
        Long libraryId = 1L;

        Library library = new Library();
        library.setId(libraryId);

        Book book = new Book("Test Book");

        when(libraryRepository.findById(libraryId)).thenReturn(Optional.of(library));
        when(bookRepository.save(any(Book.class))).thenReturn(book);

        bookService.addBookToLibrary(libraryId, book);

        verify(bookRepository, times(1)).save(book);
    }
}
