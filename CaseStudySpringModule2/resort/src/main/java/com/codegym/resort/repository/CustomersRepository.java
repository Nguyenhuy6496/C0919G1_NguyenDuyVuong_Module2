package com.codegym.resort.repository;

import com.codegym.resort.entity.FuramaCustomers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends CrudRepository<FuramaCustomers,Long> {
}
