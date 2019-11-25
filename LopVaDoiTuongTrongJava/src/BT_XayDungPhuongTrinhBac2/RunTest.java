package BT_XayDungPhuongTrinhBac2;

import java.util.Scanner;

public class RunTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (a == 0 & b == 0 & c == 0) {
            System.out.println("The equation has countless roots");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("The equation has no real roots");
        } else if (a == 0 && b != 0 && c != 0) {
            System.out.println("The equation has one root " + quadraticEquation.getC() / quadraticEquation.getB());
        }

        if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one root " + quadraticEquation.getRoot1());
        } else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("The equation has two roots " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no real roots");
        }
    }
}
