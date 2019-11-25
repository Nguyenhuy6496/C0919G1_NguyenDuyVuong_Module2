package models;

public abstract class Services {
    private String id;
    private String nameService;
    private double groundArea;
    private int maxNumberOfTenants;
    private String rentalPeriod;
    private float rentalCost;

    public Services() {
    }

    public Services(String id, String nameService, float groundArea, int maxNumberOfTenants, String rentalPeriod, float rentalCost) {
        this.id = id;
        this.nameService = nameService;
        this.groundArea = groundArea;
        this.maxNumberOfTenants = maxNumberOfTenants;
        this.rentalPeriod = rentalPeriod;
        this.rentalCost = rentalCost;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getGroundArea() {
        return groundArea;
    }

    public void setGroundArea(double groundArea) {
        this.groundArea = groundArea;
    }

    public int getMaxNumberOfTenants() {
        return maxNumberOfTenants;
    }

    public void setMaxNumberOfTenants(int maxNumberOfTenants) {
        this.maxNumberOfTenants = maxNumberOfTenants;
    }

    public String getRentalPeriod() {
        return rentalPeriod;
    }

    public void setRentalPeriod(String rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }

    public float getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(float rentalCost) {
        this.rentalCost = rentalCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    protected abstract void showInfo();
}
