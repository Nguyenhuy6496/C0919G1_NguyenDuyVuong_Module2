package Exercise.E5_HienThiCacLoaiHinh;

import java.util.Scanner;

public class TypeOfGeometry {
     private void rectangle(int width, int height){
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= width; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


    public  void main(String[] args){
        System.out.println("1. Print the rectangle.");
        System.out.println("2. Print the triangle.(The corner is square at Top-Left)");
        System.out.println("3. Print the triangle.(The corner is square at Top-Right)");
        System.out.println("4. Print the triangle.(The corner is square at Bottom-Left)");
        System.out.println("5. Print the triangle.(The corner is square at Bottom-Right)");
        System.out.println("6. Print isosceles triangle.");
        System.out.println("7. Exit.");
        System.out.print("Enter your choose:");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                System.out.print("Enter width:");
                int width = scanner.nextInt();
                System.out.print("Enter height:");
                int height = scanner.nextInt();
                rectangle(width, height);
                break;
            case 2:
//                System.out.print("Enter squared angle:");
//                int squaredAngleTL = scanner.nextInt();
//                for(int i = 0; i < squaredAngleTL; i++){
//                    for(int j = 1; j <= squaredAngleTL; j++){
//                        System.out.print(" ");
//                    }
//                    System.out.println(" ");
//                }
                break;
            case 3:
//                System.out.print("Enter squared angle:");
//                int squaredAngleTR = scanner.nextInt();
//                for(int i = 0; i < squaredAngleTR; i++){
//                    for(int j = 1; j <= squaredAngleTR; j++){
//                        if(i>=j){
//                            System.out.print(" ");
//                        }else {
//                            System.out.print("*");
//                        }
//                    }
//                    System.out.println(" ");
//                }
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
    }
}
