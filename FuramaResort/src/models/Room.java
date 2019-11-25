package models;

public class Room extends Services implements FreeServiceIncluded {
    public Room() {
    }

    public Room(String id, String nameService, float groundArea, int maxNumberOfTenants, String rentalPeriod, float rentalCost) {
        super(id, nameService, groundArea, maxNumberOfTenants, rentalPeriod, rentalCost);
    }

    @Override
    protected void showInfo() {
        System.out.println("All information:\n" +
                "1.Name service: " + getNameService() + ".\n" +
                "2.Ground area: " + getGroundArea() + " m2.\n" +
                "3.Rental period: " + getRentalPeriod() + ".\n" +
                "4.Rental cost: " + getRentalCost() + "$.\n" +
                "5.Free service included: -" + laundry + "\n" +
                "\t\t\t\t\t\t -" + breakfast + "\n" +
                "\t\t\t\t\t\t -" + cleanTheRoom + "\n" +
                "\t\t\t\t\t\t -" + wifi + "\n" +
                "6.The phone number for reception: " + phoneNumberForReception);
    }
//    private String freeServiceIncluded;
//
//    public Room() {
//    }
//
//    public Room(String nameService, float groundArea, int maxNumberOfTenants, String rentalPeriod, float rentalCost, String freeServiceIncluded) {
//        super(nameService, groundArea, maxNumberOfTenants, rentalPeriod, rentalCost);
//        this.freeServiceIncluded = freeServiceIncluded;
//    }
//
//    public String getFreeServiceIncluded() {
//        return freeServiceIncluded;
//    }
//
//    public void setFreeServiceIncluded(String freeServiceIncluded) {
//        this.freeServiceIncluded = freeServiceIncluded;
//    }
//
//    @Override
//    public void showInfo() {
//        System.out.println("All information:\n" +
//                "1.Name service: " + getNameService() + ".\n" +
//                "2.Ground area: " + getGroundArea() + " m2.\n" +
//                "3.Rental period: " + getRentalPeriod() + ".\n" +
//                "4.Rental cost: " + getRentalCost() + "$.\n" +
//                "5.Free service included: " + getFreeServiceIncluded() +".");
//    }
}
