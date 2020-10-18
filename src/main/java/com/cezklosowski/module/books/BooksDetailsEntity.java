package com.cezklosowski.module.books;

import javax.persistence.*;

@Entity
@Table(name = "books_details")
public class BooksDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String isbn;
    private String lang;
    private String publisher;

    public Long getId() {
        return id;
    }

    public BooksDetailsEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getIsbn() {
        return isbn;
    }

    public BooksDetailsEntity setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public BooksDetailsEntity setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public BooksDetailsEntity setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }
}
