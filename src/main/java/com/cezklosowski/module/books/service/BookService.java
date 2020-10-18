package com.cezklosowski.module.books.service;

import com.cezklosowski.module.books.entity.BooksEntity;
import com.cezklosowski.module.books.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BooksRepository booksRepository;
    public BooksEntity getOne(Long id) {  return booksRepository.getOne(id); }
    public List<BooksEntity> getAll() { return booksRepository.findAll(); }
    public BooksEntity create(BooksEntity entity) {
        return booksRepository.saveAndFlush(entity);
    }
    public BooksEntity update(BooksEntity entity, Long id) {
        return booksRepository.saveAndFlush(entity.setId(id));
    }
    public void delete(Long id) { booksRepository.deleteById(id); }
}
