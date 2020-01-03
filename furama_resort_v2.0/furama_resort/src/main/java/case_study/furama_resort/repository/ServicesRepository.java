package case_study.furama_resort.repository;

import case_study.furama_resort.entity.FuramaServices;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesRepository extends PagingAndSortingRepository<FuramaServices,Long> {
    Iterable<FuramaServices> findAllByRentalCostBetween(Integer fromPrice, Integer toPrice);
    
}
