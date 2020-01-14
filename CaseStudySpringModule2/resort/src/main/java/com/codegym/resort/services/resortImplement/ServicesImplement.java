package com.codegym.resort.services.resortImplement;

import com.codegym.resort.entity.FuramaServices;
import com.codegym.resort.repository.ServicesRepository;
import com.codegym.resort.services.ResortServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicesImplement implements ResortServices {

    @Autowired
    ServicesRepository servicesRepository;

    @Override
    public Iterable<FuramaServices> getAllService() {
        return servicesRepository.findAll();
    }

    @Override
    public FuramaServices getService(Long idService) {
        return servicesRepository.findById(idService).orElse(null);
    }

    @Override
    public void saveService(FuramaServices furamaServices) {
        servicesRepository.save(furamaServices);
    }

    @Override
    public void deleteService(Long idService) {
        servicesRepository.deleteById(idService);
    }

    @Override
    public Iterable<FuramaServices> findAllByRentalCostBetween(Integer fromPrice, Integer toPrice) {
        return servicesRepository.findAllByRentalCostBetween(fromPrice, toPrice);
    }
}
