package com.hesias.mapper;

import com.hesias.dto.BookDTO;
import com.hesias.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public BookDTO toDTO(Book book) {
        BookDTO dto = new BookDTO();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        return dto;
    }
}
