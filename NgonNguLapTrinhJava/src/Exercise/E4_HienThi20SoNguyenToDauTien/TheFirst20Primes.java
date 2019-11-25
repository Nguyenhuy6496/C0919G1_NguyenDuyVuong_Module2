package Exercise.E4_HienThi20SoNguyenToDauTien;

public class TheFirst20Primes {
    public static void main(String[] args) {
        System.out.println(2);
        System.out.println(3);
        int i = 5;
        for (int count = 3; count <= 20;) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                boolean check = i % j == 0;
                if (check) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
