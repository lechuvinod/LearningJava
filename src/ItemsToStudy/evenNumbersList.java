package ItemsToStudy;

import java.util.Scanner;

public class evenNumbersList {
    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (i = 2; i <= n; i++) {
            if (i%2 == 0){
                System.out.println(i);
            }
        }

    }
}
