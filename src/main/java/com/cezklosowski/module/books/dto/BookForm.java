package com.cezklosowski.module.books.dto;

import javax.validation.constraints.NotNull;
import java.util.List;

public class BookForm {

    @NotNull(message = "Author for books is required")
    private String author;

    @NotNull(message = "Title for book is required")
    private String title;

    @NotNull(message = "ISBN for book is required")
    private String isbn;

    private String lang;
    private List<String> tags;

    public String getAuthor() {
        return author;
    }

    public BookForm setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public BookForm setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getIsbn() {
        return isbn;
    }

    public BookForm setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public BookForm setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public List<String> getTags() {
        return tags;
    }

    public BookForm setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }
}
