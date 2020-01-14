package com.codegym.resort.services;

import com.codegym.resort.entity.FuramaContracts;

public interface ResortContracts {

    public Iterable<FuramaContracts> getAllContract();

    public FuramaContracts getContract(Long idContract);

    public void saveContract(FuramaContracts furamaContracts);

    public void deleteContract(Long idContract);

    Iterable<FuramaContracts> findAllByIdCustomer(Long idCustomer);
}
