package com.cezklosowski.module.books.mapper;

import com.cezklosowski.module.books.dto.BookDetailsDto;
import com.cezklosowski.module.books.entity.BooksDetailsEntity;

public class BookDetailsMapper {

    public static BookDetailsDto map(BooksDetailsEntity details) {
        if(details == null) {
            return new BookDetailsDto();
        }
        return new BookDetailsDto()
                .setIsbn(details.getIsbn())
                .setLang(details.getLang());
    }
}
