package Practice.P05_TimGiaTriNhoNhatTrongMangDungPhuongThuc;

public class FindTheMinValue {
    private static int minValue(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 15, 7, 9, 6, 1, 8};
        int index = minValue(arr);
        System.out.println("The smallest in the array is: " + arr[index]);
    }
}
