package case_study.furama_resort.services.servicesImplement;

import case_study.furama_resort.entity.FuramaServices;
import case_study.furama_resort.repository.ServicesRepository;
import case_study.furama_resort.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicesImplement implements Services {
    @Autowired
    ServicesRepository servicesRepository;

    @Override
    public Iterable<FuramaServices> getAllService() {
        return servicesRepository.findAll();
    }

    @Override
    public Optional<FuramaServices> getService(Long idService) {
        return servicesRepository.findById(idService);
    }

    @Override
    public void saveService(FuramaServices service) {
        servicesRepository.save(service);
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
