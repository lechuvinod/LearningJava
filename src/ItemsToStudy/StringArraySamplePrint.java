package ItemsToStudy;

import java.util.Scanner;

public class StringArraySamplePrint {
    public static void main(String[] args) {
        int i, j, limit;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the limit:");
        limit = scan.nextInt();
        String[] names = new String[limit];
        System.out.println("Enter the members name");
        for (i = 0; i < limit; i++) {
            names[i] = scan.next();
        }
        System.out.println("The list are: ");
        for (j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }
    }
}
