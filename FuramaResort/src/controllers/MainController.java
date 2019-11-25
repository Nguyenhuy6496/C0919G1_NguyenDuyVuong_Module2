package controllers;

import commons.FunctionWriteFileCSV;
import models.Building;
import models.Services;
import models.Villa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static String selectValue;

    public static void displayMainMenu() {
        System.out.print("What do you want to do?" + "\n" +
                "1. Add new services." + "\n" +
                "2. Show services." + "\n" +
                "3. Add new customers." + "\n" +
                "4. Show information customers." + "\n" +
                "5. Add new booking resort." + "\n" +
                "6. Show booking resort." + "\n" +
                "7. Add new employees." + "\n" +
                "8. Show information employees." + "\n" +
                "9. Exit." + "\n" +
                "Please select an optional value: "
        );
        selectValue = scanner.nextLine();
        switch (selectValue) {
            case "1":
                addNewServices();
                break;
            case "2":
                showServices();
                break;
            case "3":
                addNewCustomers();
                break;
            case "4":
                showInfoCustomers();
                break;
            case "5":
                addNewBookingResort();
                break;
            case "6":
                showBookingResort();
                break;
            case "7":
                addNewEmployees();
                break;
            case "8":
                showInfoEmployees();
                break;
            case "9":
                exitTheSystem();
                displayMainMenu();
                break;
            default:
                System.out.println("\nError. Please try again!\n");
                displayMainMenu();
                break;
        }
    }

    private static void addNewServices() {
        System.out.print("\nWhat do you want to do?" + "\n" +
                "1. Add new Villa." + "\n" +
                "2. Add new House." + "\n" +
                "3. Add new Room." + "\n" +
                "4. Back to menu." + "\n" +
                "5. Exit." + "\n" +
                "Please select an optional value: "
        );
        selectValue = scanner.nextLine();
        switch (selectValue) {
            case "1":
                addNewVilla();
                break;
            case "2":
                addNewHouse();
                break;
            case "3":
                addNewRoom();
                break;
            case "4":
                backToMainMenu();
                addNewServices();
                break;
            case "5":
                exitTheSystem();
                addNewServices();
                break;
            default:
                System.out.println("\nError. Back to Add new service. Please try again!\n");
                addNewServices();
                break;
        }
    }

    private static Services addNewService(Services service) {
        service.setId(UUID.randomUUID().toString().replace("-", ""));

        System.out.println("Enter Name Services: ");
        service.setNameService(scanner.nextLine());

        System.out.println("Enter Ground Area: ");
        service.setGroundArea(scanner.nextDouble());

        System.out.println("Enter Max Number of Tenants: ");
        service.setMaxNumberOfTenants(scanner.nextInt());

        System.out.println("Enter Rental Period: ");
        service.setRentalPeriod(scanner.nextLine());

        System.out.println("Enter Rental Cost: ");
        service.setRentalCost(scanner.nextInt());

        return service;
    }
    private static void addNewVilla() {
        Services villa = new Villa();
        villa = addNewService(villa);

        System.out.println("Enter Pool Area:");
        ((Villa) villa).setPoolArea(scanner.nextFloat());

        System.out.println("Enter Number of Floors: ");
        ((Building) villa).setNumberOfFloors(scanner.nextInt());

        System.out.println("Enter Room Standard: ");
        ((Building) villa).setRoomStandard(scanner.nextLine());

        System.out.println("Enter Description: ");
        ((Building) villa).setDescription(scanner.nextLine());

        ArrayList<Villa> villaArrayList = new ArrayList<Villa>();
        villaArrayList.add((Villa) villa);
        FunctionWriteFileCSV.writeVillaToFileCSV(villaArrayList);
        System.out.println("\nAdd Villa: " + villa.getNameService() + " Successfully!!!");
        displayMainMenu();
    }

    private static void addNewHouse() {

    }

    private static void addNewRoom() {

    }

    private static void showServices() {
        System.out.print("\nWhat do you want to do?" + "\n" +
                "1. Show all Villa." + "\n" +
                "2. Show all House." + "\n" +
                "3. Show all Room." + "\n" +
                "4. Show all name Villa not Duplicate." + "\n" +
                "5. Show all name House not Duplicate." + "\n" +
                "6. Show all name Room not Duplicate." + "\n" +
                "7. Back to menu." + "\n" +
                "8. Exit." + "\n" +
                "Please select an optional value: "
        );
        selectValue = scanner.nextLine();
        switch (selectValue) {
            case "1":
                showAllVilla();
                break;
            case "2":
                showAllHouse();
                break;
            case "3":
                showAllRoom();
                break;
            case "4":
                showAllNameVillaNotDuplicate();
                break;
            case "5":
                showAllNameHouseNotDuplicate();
                break;
            case "6":
                showAllNameRoomNotDuplicate();
                break;
            case "7":
                backToMainMenu();
                showServices();
                break;
            case "8":
                exitTheSystem();
                showServices();
                break;
            default:
                System.out.println("\nError. Back to Show service. Please try again!\n");
                break;
        }
    }

    private static void showAllVilla() {

    }

    private static void showAllHouse() {

    }

    private static void showAllRoom() {

    }

    private static void showAllNameVillaNotDuplicate() {

    }

    private static void showAllNameHouseNotDuplicate() {

    }

    private static void showAllNameRoomNotDuplicate() {

    }

    private static void addNewCustomers() {

    }

    private static void showInfoCustomers() {

    }

    private static void addNewBookingResort() {
        System.out.print("\nWhat do you want to do?" + "\n" +
                "1. Booking Villa." + "\n" +
                "2. Booking House." + "\n" +
                "3. Booking Room." + "\n" +
                "4. Back to menu." + "\n" +
                "5. Exit." + "\n" +
                "Please select an optional value: "
        );
        selectValue = scanner.nextLine();
        switch (selectValue) {
            case "1":
                bookingVilla();
                break;
            case "2":
                bookingHouse();
                break;
            case "3":
                bookingRoom();
                break;
            case "4":
                backToMainMenu();
                addNewBookingResort();
                break;
            case "5":
                exitTheSystem();
                addNewBookingResort();
                break;
            default:
                System.out.println("\nError. Back to Booking service. Please try again!\n");
                addNewBookingResort();
                break;
        }
    }

    private static void bookingVilla() {

    }

    private static void bookingHouse() {

    }

    private static void bookingRoom() {

    }

    private static void showBookingResort() {

    }

    private static void addNewEmployees() {

    }

    private static void showInfoEmployees() {

    }

    private static void backToMainMenu() {
        System.out.print("\nAre you sure you want to back to the Main menu?" + "\n" +
                "1. Yes, I am." + "\n" +
                "2. No, I am not." + "\n" +
                "Please select an optional value: "
        );
        selectValue = scanner.nextLine();
        switch (selectValue) {
            case "1":
                System.out.println("\n------------------------------------------------\n");
                displayMainMenu();
            case "2":
                break;
            default:
                System.out.println("Enter the wrong number. please try again!");
                exitTheSystem();
                break;
        }

    }

    private static void exitTheSystem() {
        System.out.print("\nAre you sure you want to exit?" + "\n" +
                "1. Yes, I am." + "\n" +
                "2. No, I am not." + "\n" +
                "Please select an optional value: "
        );
        selectValue = scanner.nextLine();
        switch (selectValue) {
            case "1":
                System.out.println("Bye bye!");
                System.exit(0);
            case "2":
                break;
            default:
                System.out.println("Enter the wrong number. please try again!");
                exitTheSystem();
                break;
        }
    }
}
