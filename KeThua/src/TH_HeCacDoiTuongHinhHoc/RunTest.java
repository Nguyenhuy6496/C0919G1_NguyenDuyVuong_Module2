package TH_HeCacDoiTuongHinhHoc;

public class RunTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow", false, 5.6);
        System.out.println(square);
    }
}
