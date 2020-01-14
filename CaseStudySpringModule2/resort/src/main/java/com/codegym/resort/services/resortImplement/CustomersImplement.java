package com.codegym.resort.services.resortImplement;

import com.codegym.resort.entity.FuramaCustomers;
import com.codegym.resort.repository.CustomersRepository;
import com.codegym.resort.services.ResortCustomers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersImplement implements ResortCustomers {

    @Autowired
    CustomersRepository customersRepository;

    @Override
    public Iterable<FuramaCustomers> getAllCustomer() {
        return customersRepository.findAll();
    }

    @Override
    public FuramaCustomers getCustomer(Long idContract) {
        return customersRepository.findById(idContract).orElse(null);
    }

    @Override
    public void saveCustomer(FuramaCustomers furamaCustomers) {
        customersRepository.save(furamaCustomers);
    }

    @Override
    public void deleteCustomer(Long idContract) {
        customersRepository.deleteById(idContract);
    }
}
