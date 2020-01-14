package com.codegym.resort.repository;

import com.codegym.resort.entity.FuramaServices;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesRepository extends PagingAndSortingRepository<FuramaServices, Long> {
    Iterable<FuramaServices> findAllByRentalCostBetween(Integer fromPrice, Integer toPrice);
}
