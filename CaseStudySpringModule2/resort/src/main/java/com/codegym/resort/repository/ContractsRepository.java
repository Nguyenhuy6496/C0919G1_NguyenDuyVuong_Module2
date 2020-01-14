package com.codegym.resort.repository;

import com.codegym.resort.entity.FuramaContracts;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractsRepository extends PagingAndSortingRepository<FuramaContracts, Long> {
    Iterable<FuramaContracts> findAllByIdCustomer(Long idCustomer);
}
