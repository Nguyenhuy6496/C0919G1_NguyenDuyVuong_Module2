package Practice.P08_SuDungLopArrayIndexOutOfBoundsExceptionAssignment;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    private Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List of array: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arrExample = new ArrayIndexOutOfBoundsException();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}

