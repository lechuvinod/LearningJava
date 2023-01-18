package StudyMaterial;

import java.util.Scanner;

public class NumberofDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        System.out.print("Enter the number:");
        int a = scan.nextInt();
        int sct = String.valueOf(a).length();
        System.out.println("The result is: "+sct);

    }
}
