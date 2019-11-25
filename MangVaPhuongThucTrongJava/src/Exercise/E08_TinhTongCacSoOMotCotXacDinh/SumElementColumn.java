package Exercise.E08_TinhTongCacSoOMotCotXacDinh;

import java.util.Arrays;
import java.util.Scanner;

class SumElementColumn {
    public static void main(String[] args) {
        int sumElement = 0;
        int[][] towDimArr = new int[10][10];
        for (int i = 0; i < towDimArr.length; i++) {
            for (int j = 0; j < towDimArr[i].length; j++) {
                towDimArr[i][j] = (int) (Math.random() * 10 - 5);
            }
            System.out.println(Arrays.toString(towDimArr[i]));
        }
        for (int i = 0; i < towDimArr.length; i++) {
            sumElement += towDimArr[i][i];
        }
        System.out.print("Sum Element is: " + sumElement);
    }
}
