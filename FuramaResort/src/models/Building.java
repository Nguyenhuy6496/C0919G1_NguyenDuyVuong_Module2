package models;

public abstract class Building extends Services {
    private int numberOfFloors;
    private String roomStandard;
    private String description;

    public Building() {
    }
    public Building(String id, String nameService, int numberOfFloors, float groundArea, int maxNumberOfTenants, String roomStandard, String rentalPeriod, float rentalCost, String description) {
        super(id, nameService, groundArea, maxNumberOfTenants, rentalPeriod, rentalCost);
        this.numberOfFloors = numberOfFloors;
        this.roomStandard = roomStandard;
        this.description = description;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
