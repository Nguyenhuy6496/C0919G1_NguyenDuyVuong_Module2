package Practice.P02_TimGiaTriTrongMang;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name student:");
        String inputName = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(inputName)) {
                System.out.println("Position of the student in the list" + inputName + " is: " + (i + 1));
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Not found" + inputName + " in the list.");
        }
    }


}
