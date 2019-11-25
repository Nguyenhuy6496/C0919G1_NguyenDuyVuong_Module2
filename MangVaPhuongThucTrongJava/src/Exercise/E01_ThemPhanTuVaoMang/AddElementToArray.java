package Exercise.E01_ThemPhanTuVaoMang;

import java.net.BindException;
import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int index;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayAfterAdd = new int[array.length + 1];
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(array));
        System.out.print("Enter the number: ");
        int value = scanner.nextInt();
        int count = 0;
        do {
            System.out.print("Enter the position: ");
            index = scanner.nextInt();
            if (index < 0 || index > 9) {
                System.out.println("Enter the wrong position.");
            } else {
                repeat = false;
            }
        } while (repeat);

        for (int i = 0; i < arrayAfterAdd.length; i++) {
            if (i == index) {
                arrayAfterAdd[index] = value;
            } else {
                arrayAfterAdd[i] = array[count];
                count++;
            }
        }
        System.out.println(Arrays.toString(arrayAfterAdd));
    }
}
