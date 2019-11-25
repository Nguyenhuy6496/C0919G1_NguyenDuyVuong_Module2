package models;

public class Villa extends Building {
        private float poolArea;

    public Villa() {
    }

    public Villa(String id, String nameService, int numberOfFloors, float groundArea, float poolArea, int maxNumberOfTenants, String roomStandard, String rentalPeriod, float rentalCost, String description) {
        super(id, nameService, numberOfFloors, groundArea, maxNumberOfTenants, roomStandard, rentalPeriod, rentalCost, description);
        this.poolArea = poolArea;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public void showInfo() {
        System.out.println("All information:\n" +
                "1.Name service: " + getNameService() + ".\n" +
                "2.Number of floors: " + getNumberOfFloors() + " floors.\n" +
                "3.Ground area: " + getGroundArea() + " m2.\n" +
                "4.Pool area: " + getPoolArea() + " m2.\n" +
                "5.Maximum number of tenants: " + getMaxNumberOfTenants() + " people.\n" +
                "6.Room standard: " + getRoomStandard() + ".\n" +
                "7.Rental period: " + getRentalPeriod() + ".\n" +
                "8.Rental cost: " + getRentalCost() + "$.\n" +
                "9.Description: " + getDescription() + "."
        );
    }
    //    private float poolArea;
//    private int numberOfFloors;
//    private String roomStandard;
//    private String description;
//
//    public Villa() {
//    }
//
//    public Villa(String nameService, int numberOfFloors, float groundArea, float poolArea, int maxNumberOfTenants, String roomStandard, String rentalPeriod, float rentalCost, String description) {
//        super(nameService, groundArea, maxNumberOfTenants, rentalPeriod, rentalCost);
//        this.poolArea = poolArea;
//        this.numberOfFloors = numberOfFloors;
//        this.roomStandard = roomStandard;
//        this.description = description;
//    }
//
//    public float getPoolArea() {
//        return poolArea;
//    }
//
//    public void setPoolArea(float poolArea) {
//        this.poolArea = poolArea;
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
//                "4.Pool area: " + getPoolArea() + " m2.\n" +
//                "5.Maximum number of tenants: " + getMaxNumberOfTenants() + " người.\n" +
//                "6.Room standard: " + getRoomStandard() + ".\n" +
//                "7.Rental period: " + getRentalPeriod() + ".\n" +
//                "8.Rental cost: " + getRentalCost() + "$.\n" +
//                "9.Description: " + getDescription() + "."
//        );
//    }

}
