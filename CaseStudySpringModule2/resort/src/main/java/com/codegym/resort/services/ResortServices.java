package com.codegym.resort.services;

import com.codegym.resort.entity.FuramaServices;

public interface ResortServices {

    public Iterable<FuramaServices> getAllService();

    public FuramaServices getService(Long idService);

    public void saveService(FuramaServices furamaServices);

    public void deleteService(Long idService);

    public Iterable<FuramaServices> findAllByRentalCostBetween(Integer fromPrice, Integer toPrice);
}
