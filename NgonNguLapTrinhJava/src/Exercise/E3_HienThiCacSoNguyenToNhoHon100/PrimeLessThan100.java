package Exercise.E3_HienThiCacSoNguyenToNhoHon100;

public class PrimeLessThan100 {
    public static void main(String[] args) {
        System.out.println(2);
        System.out.println(3);
        for (int i = 5; i < 100; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                boolean check = i % j == 0;
                if(check){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.println(i);
            }
        }
    }
}
