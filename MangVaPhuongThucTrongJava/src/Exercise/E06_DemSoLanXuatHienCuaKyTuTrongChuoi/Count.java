package Exercise.E06_DemSoLanXuatHienCuaKyTuTrongChuoi;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String string = "adsfkhqiwerqjhfalskjfadsw";
        System.out.println(string);
        System.out.print("Enter the character you want to count in the string: ");
        String word = scanner.nextLine();
        char character  = word.charAt(0);
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == character){
                count++;
            }
        }
        System.out.printf("The %s appears %d times", character, count);

    }
}
