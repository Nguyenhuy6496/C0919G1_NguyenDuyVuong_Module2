package com.codegym.module2.services.Implement;

import com.codegym.module2.entitys.BooksEntity;
import com.codegym.module2.repositorys.BooksRepository;
import com.codegym.module2.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BooksServiceImplement implements BooksService {

    @Autowired
    BooksRepository booksRepository;

    @Override
    public Page<BooksEntity> findAll(Pageable pageable) {
        return booksRepository.findAll(pageable);
    }

    @Override
    public Iterable<BooksEntity> getAllBooks() {
        return booksRepository.findAll();
    }

    @Override
    public BooksEntity getBook(Long idBook) {
        return booksRepository.findById(idBook).orElse(null);
    }

    @Override
    public void saveBook(BooksEntity booksEntity) {
        booksRepository.save(booksEntity);
    }

    @Override
    public void deleteBook(Long idBook) {
        booksRepository.deleteById(idBook);
    }
}
