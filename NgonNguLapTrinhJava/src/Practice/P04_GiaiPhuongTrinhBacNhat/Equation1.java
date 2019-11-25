package Practice.P04_GiaiPhuongTrinhBacNhat;

import java.util.Scanner;

public class Equation1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.format("The solution is: \n%f!", solution);
        } else {
            System.out.println("No solution!");
        }

    }
}
