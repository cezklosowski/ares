package com.cezklosowski.module.books;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "books")
public class BooksEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Author for books is required")
	private String author;

	@NotNull(message = "Title for book is required")
	private String title;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "details_id", referencedColumnName = "id")
	private BooksDetailsEntity details;

	public Long getId() {
		return id;
	}

	public BooksEntity setId(Long id) {
		this.id = id;
		return this;
	}

	public String getAuthor() {
		return author;
	}

	public BooksEntity setAuthor(String author) {
		this.author = author;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public BooksEntity setTitle(String title) {
		this.title = title;
		return this;
	}

	public BooksDetailsEntity getDetails() {
		return details;
	}

	public BooksEntity setDetails(BooksDetailsEntity details) {
		this.details = details;
		return this;
	}
}
