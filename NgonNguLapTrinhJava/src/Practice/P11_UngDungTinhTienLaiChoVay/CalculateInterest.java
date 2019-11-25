package Practice.P11_UngDungTinhTienLaiChoVay;

import java.util.Scanner;
public class CalculateInterest {
    public static void main(String[] args){
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of months: ");
        month = scanner.nextInt();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest = money * (interestRate/100)/12 * 3;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
