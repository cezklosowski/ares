package com.cezklosowski.module.books;

import com.cezklosowski.module.books.dto.BookDto;
import com.cezklosowski.module.books.dto.BookForm;
import com.cezklosowski.module.books.entity.BooksEntity;
import com.cezklosowski.module.books.mapper.BookFormMapper;
import com.cezklosowski.module.books.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BooksController {

	@Autowired
	private BooksRepository booksRepository;

	@GetMapping(value = "/api/books/{id}")
	public BookDto getBook(@PathVariable Long id) {
		return BookMapper.map(booksRepository.findById(id).get());
	}

	@GetMapping("/api/books")
	public List<BookDto> getBooks() {
		return BookMapper.map(booksRepository.findAll());
	}

	@PostMapping("/api/books")
	public BookDto newBooks(@Valid @RequestBody BookForm form) {
		BooksEntity booksEntity = BookFormMapper.map(form);
		return BookMapper.map(booksRepository.saveAndFlush(booksEntity));
	}

	@PutMapping("/api/books/{id}")
	public BookDto updateBooks(@PathVariable Long id,
	                               @RequestBody BooksEntity booksEntity) {
		return BookMapper.map(booksRepository.saveAndFlush(booksEntity.setId(id)));
	}

	@DeleteMapping("/api/books/{id}")
	public void deleteBooks(@PathVariable Long id) {
		booksRepository.deleteById(id);
	}
}
