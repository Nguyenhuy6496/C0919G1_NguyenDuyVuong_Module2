package com.codegym.resort.services.resortImplement;

import com.codegym.resort.entity.FuramaContracts;
import com.codegym.resort.repository.ContractsRepository;
import com.codegym.resort.services.ResortContracts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractsImplement implements ResortContracts {

    @Autowired
    ContractsRepository contractsRepository;

    @Override
    public Iterable<FuramaContracts> getAllContract() {
        return contractsRepository.findAll();
    }

    @Override
    public FuramaContracts getContract(Long idContract) {
        return contractsRepository.findById(idContract).orElse(null);
    }

    @Override
    public void saveContract(FuramaContracts furamaContracts) {
        contractsRepository.save(furamaContracts);
    }

    @Override
    public void deleteContract(Long idContract) {
        contractsRepository.deleteById(idContract);
    }

    @Override
    public Iterable<FuramaContracts> findAllByIdCustomer(Long idCustomer) {
        return contractsRepository.findAllByIdCustomer(idCustomer);
    }
}
