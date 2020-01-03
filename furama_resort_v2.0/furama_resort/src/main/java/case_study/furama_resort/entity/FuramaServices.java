package case_study.furama_resort.entity;

import javax.persistence.*;


@Entity
@Table(name = "services")
public class FuramaServices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idService;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "area")
    private int area;

    @Column(name = "number_of_floor")
    private int numberOfFloor;

    @Column(name = "max_number_of_people")
    private int maxNumberOfPeople;

    @Column(name = "rental_cost")
    private int rentalCost;

    @Column(name = "id_rental_type")
    private int idRentalType;

    @Column(name = "availability")
    private String availability;

    @ManyToOne
    @JoinColumn(name = "id_service_type")
    private FuramaServicesType furamaServicesType;

    public FuramaServices() {
    }

    public Long getIdService() {
        return idService;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getIdRentalType() {
        return idRentalType;
    }

    public void setIdRentalType(int idRentalType) {
        this.idRentalType = idRentalType;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public FuramaServicesType getFuramaServicesType() {
        return furamaServicesType;
    }

    public void setFuramaServicesType(FuramaServicesType furamaServicesType) {
        this.furamaServicesType = furamaServicesType;
    }
}