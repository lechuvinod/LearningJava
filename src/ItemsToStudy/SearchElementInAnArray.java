package ItemsToStudy;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElementInAnArray {
    public static void main(String[] args) {
        int i, j, searchNumber, total;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total number in an Array");
        total = scan.nextInt();
        int[] numbers = new int[total];
        System.out.println("Enter the numbers");
        for (i = 0; i < total; i++) {
            numbers[i] = scan.nextInt();
        }
        System.out.print("Enter the number need to search: ");
        searchNumber = scan.nextInt();
        for (j = 0; j < numbers.length; j++) {
            if (searchNumber == numbers[j]) {
                flag = false;
                break;
            }

        }
        if (flag == false) {
            System.out.println("The position of the number " + searchNumber + " is " + (j + 1));
        } else {
            System.out.println("Value not found");
        }

    }
}
