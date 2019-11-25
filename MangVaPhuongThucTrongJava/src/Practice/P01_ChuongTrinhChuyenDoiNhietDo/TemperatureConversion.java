package Practice.P01_ChuongTrinhChuyenDoiNhietDo;

import java.util.Scanner;

public class TemperatureConversion {
    private static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;

        do{
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to celsius");
            System.out.println("2. Celsius to fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choose: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }
}
