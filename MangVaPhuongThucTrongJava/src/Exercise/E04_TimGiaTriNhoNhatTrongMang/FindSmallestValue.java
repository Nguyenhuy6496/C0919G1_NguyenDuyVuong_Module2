package Exercise.E04_TimGiaTriNhoNhatTrongMang;

import java.util.Arrays;
import java.util.Scanner;

public class FindSmallestValue {
    private static int[] createArray(int arrLength) {
        int[] array = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            array[i] = (int) (Math.random() * arrLength * 9);
        }
        return  array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrLength = scanner.nextInt();
        int[] array = FindSmallestValue.createArray(arrLength);
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        System.out.printf("Min value is: %d", min);
    }
}
