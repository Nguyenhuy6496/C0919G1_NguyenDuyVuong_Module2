package com.codegym.resort.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.sql.Date;

@Entity
@Table(name = "customers")
public class FuramaCustomers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCustomer;

    @Column(name = "id_customer_type")
    private Long idCustomerType;

    @NotEmpty
    @Column(name = "customer_name")
    private String customerName;

    @NotNull(message = "Please choosing your birthday!")
    @Column(name = "birthday")
    private Date birthday;

    @NotEmpty
    @Pattern(regexp = "^[0-9]{9}|[0-9]{12}$", message = "identity card number must be 9 digits or 12 digits!")
    @Column(name = "identity_card_number")
    private String identityCardNumber;

    @NotEmpty
    @Column(name = "phone_number")
    private String phoneNumber;

    @NotEmpty
    @Pattern(regexp = "^(\\w{1,20})(@[a-zA-Z0-9]{2,8})(.(\\w{2,4})){1,3}$", message = "Invalid email")
    @Column(name = "email")
    private String email;

    @NotEmpty
    @Column(name = "address")
    private String address;

    public FuramaCustomers() {
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Long getIdCustomerType() {
        return idCustomerType;
    }

    public void setIdCustomerType(Long idCustomerType) {
        this.idCustomerType = idCustomerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
