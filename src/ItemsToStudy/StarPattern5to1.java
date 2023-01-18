package ItemsToStudy;

import java.util.Scanner;

public class StarPattern5to1 {
    public static void main(String[] args) {
        int i, j, limit;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        limit = scan.nextInt();
        for (i = limit; i > 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
