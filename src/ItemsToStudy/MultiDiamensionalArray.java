package ItemsToStudy;

import java.util.Scanner;

public class MultiDiamensionalArray {
    public static void main(String[] args) {
        int i, j, limit;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        limit = scan.nextInt();
        int[][] values = new int[limit][limit];
        System.out.println("The numbers are");
        for (i = 0; i < limit; i++) {
            for (j = 0; j < limit; j++) {
                values[i][j] = scan.nextInt();
            }
        }
        System.out.println("The output is");
        for (i = 0; i < limit; i++) {
            for (j = 0; j < limit; j++) {
                System.out.print(values[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
