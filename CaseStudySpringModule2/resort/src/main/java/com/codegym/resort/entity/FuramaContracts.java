package com.codegym.resort.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "contracts")
public class FuramaContracts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContract;

    @Column(name = "start_day")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date startDay;

    @Column(name = "end_day")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date endDay;

    @Column(name = "deposits")
    private int deposits;

    @Column(name = "total_pay")
    private int totalPay;

    @Column(name = "id_employee")
    private Long idEmployee;

    @Column(name = "id_customer")
    private Long idCustomer;

    @Column(name = "id_service")
    private Long idService;

    public FuramaContracts() {
    }

    public Long getIdContract() {
        return idContract;
    }

    public void setIdContract(Long idContract) {
        this.idContract = idContract;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    public int getDeposits() {
        return deposits;
    }

    public void setDeposits(int deposits) {
        this.deposits = deposits;
    }

    public int getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(int totalPay) {
        this.totalPay = totalPay;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Long getIdService() {
        return idService;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }
}
