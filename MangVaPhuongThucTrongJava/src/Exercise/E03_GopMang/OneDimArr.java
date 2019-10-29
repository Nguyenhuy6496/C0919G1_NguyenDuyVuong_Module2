package Exercise.E03_GopMang;

class OneDimArr {
    int[] createArray(int arrLength) {
        int[] array = new int[arrLength];
        for (int i = 0; i < arrLength ; i++) {
            array[i]= (int) (Math.random() * arrLength);
        }
        return array;
    }
}
