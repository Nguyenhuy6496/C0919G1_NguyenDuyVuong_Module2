package com.codegym.module2.services;


import com.codegym.module2.entitys.BooksEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BooksService {
    Page<BooksEntity> findAll(Pageable pageable);

    Iterable<BooksEntity> getAllBooks();

    BooksEntity getBook(Long idBook);

    void saveBook(BooksEntity booksEntity);

    void deleteBook(Long idBook);
}
