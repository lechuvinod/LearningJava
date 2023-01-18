package ItemsToStudy;

import java.util.Scanner;

public class ArrayProgramSumOfNumbers {
    public static void main(String[] args) {
        int i, j, n;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the  total count of numbers given");
        n = scan.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the numbers");
        for (i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }
        System.out.println("The total is");
        for (j = 0; j < numbers.length; j++) {
            sum = sum + numbers[j];
        }
        System.out.println(sum);
    }
}
