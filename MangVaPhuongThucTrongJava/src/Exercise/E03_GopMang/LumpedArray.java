package Exercise.E03_GopMang;

import java.util.Arrays;
import java.util.Scanner;

public class LumpedArray {
    public static void main(String[] args) {
        OneDimArr array = new OneDimArr();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int arrLength = scanner.nextInt();

        int[] arr1 = array.createArray(arrLength);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = array.createArray(arrLength);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[arrLength * 2];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr3.length - arr1.length);
        System.out.println(Arrays.toString(arr3));
    }
}
