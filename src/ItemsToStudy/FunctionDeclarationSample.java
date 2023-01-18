package ItemsToStudy;

import java.util.Scanner;

public class FunctionDeclarationSample {
    public static void main(String[] args) {
        float a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = scan.nextFloat();
        System.out.println("Enter the second numer");
        b = scan.nextFloat();
        System.out.println("The sum of " + a + " and " + b + " is: " + sumOfNumbers(a, b));
        System.out.println("The difference of " + a + " and " + b + " is: " + differenceOfNumbers(a, b));
        System.out.println("The product of " + a + " and " + b + " is: " + productOfNumbers(a, b));
        System.out.println("The dividend of " + a + " and " + b + " is: " + dividend(a, b));
        System.out.println("The reminder of " + a + " and " + b + " is: " + reminder(a, b));
    }

    private static float sumOfNumbers(float a, float b) {
        float sum;
        sum = a + b;
        return sum;
    }

    private static float differenceOfNumbers(float a, float b) {
        float difference;
        difference = a - b;
        return difference;
    }

    public static float productOfNumbers(float a, float b) {
        float productValue;
        productValue = a * b;
        return productValue;
    }

    private static float dividend(float a, float b) {
        float dividend;
        dividend = a / b;
        return dividend;
    }

    private static float reminder(float a, float b) {
        float reminder;
        reminder = a % b;
        return reminder;

    }
}
