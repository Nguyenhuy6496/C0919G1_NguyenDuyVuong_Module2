package E6_UngDungChuyenDoiTienTe;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        int vnd = 23000;
        int usd;
        System.out.print("Enter value USD: ");
        Scanner scanner = new Scanner(System.in);
        usd = scanner.nextInt();
        int result = usd * vnd;
        System.out.printf("Value VND is: %,d.", result);
    }
}
