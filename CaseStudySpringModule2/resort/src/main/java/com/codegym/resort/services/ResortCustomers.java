package com.codegym.resort.services;

import com.codegym.resort.entity.FuramaCustomers;

public interface ResortCustomers {
    public Iterable<FuramaCustomers> getAllCustomer();

    public FuramaCustomers getCustomer(Long idContract);

    public void saveCustomer(FuramaCustomers furamaCustomers);

    public void deleteCustomer(Long idContract);
}
