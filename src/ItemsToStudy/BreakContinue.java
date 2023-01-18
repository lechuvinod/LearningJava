package ItemsToStudy;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = scan.nextInt();
        printbreak(limit);
        System.out.println("######################################");
        printContinue(limit);

    }

    private static void printbreak(int limit) {
        for (int i = 0; i < limit; i++) {
            System.out.println("Hi ");
            if (i == 5) {
                break;
            }
            System.out.println("GOOD MORNING ");
        }
        System.out.println("BREAK STATEMENT APPLIED ");
    }

    private static void printContinue(int limit) {
        for (int i = 0; i < limit; i++) {
            System.out.println("Hii ");
            if (i == 5) {
                continue;
            }
            System.out.println("GOD BLESS YOU ");
        }
        System.out.println("CONTINUE STATEMENT ");
    }

}
