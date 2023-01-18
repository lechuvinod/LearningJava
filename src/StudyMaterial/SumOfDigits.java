package StudyMaterial;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int i;
        int sum =0,digits;
        System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
        System.out.print("the count is: " + String.valueOf(number).length());
        for (i = number; i > 0; i++) {
            digits = number % 10;
            sum = sum + digits;
            number = number/10;
        }
        System.out.print("The result is: "+sum);

    }
}
