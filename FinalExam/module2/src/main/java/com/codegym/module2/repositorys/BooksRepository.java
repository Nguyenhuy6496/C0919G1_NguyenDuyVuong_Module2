package com.codegym.module2.repositorys;

import com.codegym.module2.entitys.BooksEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends PagingAndSortingRepository<BooksEntity, Long> {
}
