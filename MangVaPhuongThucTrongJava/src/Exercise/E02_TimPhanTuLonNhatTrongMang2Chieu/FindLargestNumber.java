package Exercise.E02_TimPhanTuLonNhatTrongMang2Chieu;

public class FindLargestNumber {
    public static void main(String[] args) {
        int[][] twoDimArr = TwoDimArr.createTwoDimArr();
        int max = twoDimArr[0][0];
        for (int[] ints : twoDimArr) {
            for (int anInts : ints) {
                if (anInts > max) {
                    max = anInts;
                }
            }
        }
        System.out.print(max);
    }
}
