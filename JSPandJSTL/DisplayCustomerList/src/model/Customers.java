package model;

public class Customers {
    private int customerId;
    private String name;
    private String address;
    private String email;

    public Customers() {
    }

    public Customers(int customerId, String name, String address, String email) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
