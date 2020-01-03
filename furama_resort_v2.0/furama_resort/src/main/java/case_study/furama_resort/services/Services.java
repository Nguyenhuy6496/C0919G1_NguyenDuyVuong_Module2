package case_study.furama_resort.services;

import case_study.furama_resort.entity.FuramaServices;

import java.util.Optional;

public interface Services {

    public Iterable<FuramaServices> getAllService();

    public Optional<FuramaServices> getService(Long idService);

    public void saveService(FuramaServices service);

    public void deleteService(Long idService);

    public Iterable<FuramaServices> findAllByRentalCostBetween(Integer fromPrice, Integer toPrice);
}
