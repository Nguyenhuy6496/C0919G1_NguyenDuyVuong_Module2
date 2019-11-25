package Exercise.E02_TimPhanTuLonNhatTrongMang2Chieu;

import java.util.Arrays;
import java.util.Scanner;

class TwoDimArr {
    static int[][] createTwoDimArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1-dimensional array length: ");
        int oneDimArrLength = scanner.nextInt();
        System.out.print("Enter 2-dimensional array length: ");
        int twoDimArrLength = scanner.nextInt();
        int[][] twoDimArr = new int[twoDimArrLength][oneDimArrLength];
        for (int i = 0; i < twoDimArrLength; i++) {
            for (int j = 0; j < oneDimArrLength; j++) {
                twoDimArr[i][j] = (int) (Math.random() * oneDimArrLength * twoDimArrLength);
            }
            System.out.println(Arrays.toString(twoDimArr[i]));
        }

        return twoDimArr;
    }
}
