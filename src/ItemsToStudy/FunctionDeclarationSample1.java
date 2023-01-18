package ItemsToStudy;

import java.util.Scanner;

public class FunctionDeclarationSample1 {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = scan.nextInt();
        System.out.println("Enter the second numer");
        b = scan.nextInt();
        function1();
        differenceOfNumbers(a,b);
        System.out.println("The product is: " + productOfNumbers());
        System.out.println("The dividend of " + a + " and " + b + " is: " + dividend(a, b));
    }

    /*
     * Without Parameter
     * Without Return
     * */
    private static void function1() {
        int a = 100, b = 200, sum;
        sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    /*
     * With Parameter
     * Without Return
     * */
    private static void differenceOfNumbers(int a, int b) {
        float difference;
        difference = a - b;
        System.out.println("The difference of " + a + " and " + b + " is: " + difference);
    }

    /*
     * Without Parameter
     * With Return
     * */
    public static int productOfNumbers() {
        int a = 100, b = 200, product;
        product = a + b;
        return product;
    }

    /*
     * With Parameter
     * With Return
     * */
    private static float dividend(int a, int b) {
        float dividend;
        dividend = a / b;
        return dividend;
    }

}
