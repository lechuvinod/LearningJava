package ItemsToStudy;

import java.util.Scanner;

public class ArrayProgramByGivenNameByUser {
    public static void main(String[] args) {
        int i, j, n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of family members: ");
        n = scan.nextInt();
        String[] strArray = new String[n];
        System.out.println("Enter Your Family Members Name: ");
        for (i = 0; i < n; i++) {
            strArray[i] = scan.next();
        }
        System.out.print("My Family Members Are ");
        for (i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i]);
            System.out.print(" , ");
        }
    }
}



