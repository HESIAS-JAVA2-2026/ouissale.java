package com.hesias.dto;

public class BookDTO {

    private Long id;
    private String title;
    private Long libraryId;

    // GETTERS
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Long getLibraryId() {
        return libraryId;
    }

    // SETTERS
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLibraryId(Long libraryId) {
        this.libraryId = libraryId;
    }
}
