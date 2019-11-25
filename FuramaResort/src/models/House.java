package models;

public class House extends Building{
    public House() {
    }

    public House(String id, String nameService, int numberOfFloors, float groundArea, int maxNumberOfTenants, String roomStandard, String rentalPeriod, float rentalCost, String description) {
        super(id, nameService, numberOfFloors, groundArea, maxNumberOfTenants, roomStandard, rentalPeriod, rentalCost, description);
    }

    @Override
    public void showInfo() {
        System.out.println("All information:\n" +
                "1.Name service: " + getNameService() + ".\n" +
                "2.Number of floors: " + getNumberOfFloors() + " floors.\n" +
                "3.Ground area: " + getGroundArea() + " m2.\n" +
                "4.Maximum number of tenants: " + getMaxNumberOfTenants() + " people.\n" +
                "5.Room standard: " + getRoomStandard() + ".\n" +
                "6.Rental period: " + getRentalPeriod() + ".\n" +
                "7.Rental cost: " + getRentalCost() + "$.\n" +
                "8.Description: " + getDescription() + "."
        );
    }
    //    private int numberOfFloors;
//    private String roomStandard;
//    private String description;
//
//    public House() {
//    }
//
//    public House(String nameService, int numberOfFloors, float groundArea, int maxNumberOfTenants, String roomStandard, String rentalPeriod, float rentalCost, String description) {
//        super(nameService, groundArea, maxNumberOfTenants, rentalPeriod, rentalCost);
//        this.numberOfFloors = numberOfFloors;
//        this.roomStandard = roomStandard;
//        this.description = description;
//    }
//
//    public int getNumberOfFloors() {
//        return numberOfFloors;
//    }
//
//    public void setNumberOfFloors(int numberOfFloors) {
//        this.numberOfFloors = numberOfFloors;
//    }
//
//    public String getRoomStandard() {
//        return roomStandard;
//    }
//
//    public void setRoomStandard(String roomStandard) {
//        this.roomStandard = roomStandard;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    @Override
//    public void showInfo() {
//        System.out.println("All information:\n" +
//                "1.Name service: " + getNameService() + ".\n" +
//                "2.Number of floors: " + getNumberOfFloors() + " tầng.\n" +
//                "3.Ground area: " + getGroundArea() + " m2.\n" +
//                "4.Maximum number of tenants: " + getMaxNumberOfTenants() + " người.\n" +
//                "5.Room standard: " + getRoomStandard() + ".\n" +
//                "6.Rental period: " + getRentalPeriod() + ".\n" +
//                "7.Rental cost: " + getRentalCost() + "$.\n" +
//                "8.Description: " + getDescription() + "."
//        );
//    }
}
