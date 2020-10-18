package com.cezklosowski.module.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {

	@Autowired
	private BooksRepository booksRepository;

	@GetMapping(value = "/api/books/{id}")
	public BooksEntity getBook(@PathVariable Long id) {
		return booksRepository.findById(id).get();
	}

	@GetMapping("/api/books")
	public List<BooksEntity> getBooks() {
		return booksRepository.findAll();
	}

	@PostMapping("/api/books")
	public BooksEntity newBooks(@RequestBody BooksEntity booksEntity) {
		return booksRepository.saveAndFlush(booksEntity);
	}

	@PutMapping("/api/books/{id}")
	public BooksEntity updateBooks(@PathVariable Long id,
	                               @RequestBody BooksEntity booksEntity) {
		return booksRepository.saveAndFlush(booksEntity.setId(id));
	}

	@DeleteMapping("/api/books/{id}")
	public void deleteBooks(@PathVariable Long id) {
		booksRepository.deleteById(id);
	}
}
