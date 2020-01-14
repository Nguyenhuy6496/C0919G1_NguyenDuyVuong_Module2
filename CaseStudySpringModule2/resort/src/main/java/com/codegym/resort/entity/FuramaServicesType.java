package com.codegym.resort.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "service_type")
public class FuramaServicesType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServiceType;

    @Column(name = "service_type_name")
    private String serviceTypeName;

    @Column(name = "cost")
    private int cost;

    @OneToMany(targetEntity = FuramaServices.class)
    private List<FuramaServices> furamaServices;

    public FuramaServicesType() {
    }

    public Long getIdServiceType() {
        return idServiceType;
    }

    public void setIdServiceType(Long idServiceType) {
        this.idServiceType = idServiceType;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public List<FuramaServices> getFuramaServices() {
        return furamaServices;
    }

    public void setFuramaServices(List<FuramaServices> furamaServices) {
        this.furamaServices = furamaServices;
    }
}
