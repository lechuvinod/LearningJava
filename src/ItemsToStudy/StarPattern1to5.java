package ItemsToStudy;

import java.util.Scanner;

public class StarPattern1to5 {
    public static void main(String[] args) {
        int limit, i, j;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        limit = scan.nextInt();
        for (i = 1; i <= limit; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}


