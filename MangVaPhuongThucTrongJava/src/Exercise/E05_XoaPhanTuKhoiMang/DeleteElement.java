package Exercise.E05_XoaPhanTuKhoiMang;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    private static int[] createArray() {
        int[] array = new int[15];
        for (int i = 0; i < 11; i++) {
            array[i] = (int) (Math.random() * 50 - 25);
        }
        return array;
    }

    public static void main(String[] args) {
        boolean repeat = true;
        int value;
        int index = 0;
        int count = 0;
        int[] array = DeleteElement.createArray();
        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the number want to delete: ");
            value = scanner.nextInt();
            for (int i = 0; i < array.length; i++) {
                if (value == array[i]) {
                    index = i;
                    repeat = false;
                    break;
                }
            }
            if (repeat) {
                System.out.println("Can not find the number, Pls try again.");
            }
        } while (repeat);
        System.out.println("The position of number is: " + index);
        int[] arrayAfterDel = new int[15];
        for (int i = 0; i < arrayAfterDel.length; i++) {
            if (i != index) {
                arrayAfterDel[count] = array[i];
                count++;
            } else {
                arrayAfterDel[i] = array[i+1];
                i++;
                count ++;
            }
        }
        System.out.print(Arrays.toString(arrayAfterDel));
    }
}
