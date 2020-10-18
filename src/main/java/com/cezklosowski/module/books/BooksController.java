package com.cezklosowski.module.books;

import com.cezklosowski.module.books.dto.BookDto;
import com.cezklosowski.module.books.dto.BookForm;
import com.cezklosowski.module.books.entity.BooksEntity;
import com.cezklosowski.module.books.mapper.BookFormMapper;
import com.cezklosowski.module.books.mapper.BookMapper;
import com.cezklosowski.module.books.repository.BooksRepository;
import com.cezklosowski.module.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BooksController {
	@Autowired
	private BookService bookService;
	@GetMapping(value = "/api/books/{id}")
	public BookDto getBook(@PathVariable Long id) {
		return BookMapper.map(bookService.getOne(id));
	}
	@GetMapping("/api/books")
	public List<BookDto> getBooks() {
		return BookMapper.map(bookService.getAll());
	}
	@PostMapping("/api/books")
	public BookDto newBooks(@Valid @RequestBody BookForm form) {
		return BookMapper.map(bookService.create(BookFormMapper.map(form)));
	}
	@PutMapping("/api/books/{id}")
	public BookDto updateBooks(@PathVariable Long id, @RequestBody BooksEntity booksEntity) {
		return BookMapper.map(bookService.update(booksEntity, id));
	}
	@DeleteMapping("/api/books/{id}")
	public void deleteBooks(@PathVariable Long id) {
		bookService.delete(id);
	}
}