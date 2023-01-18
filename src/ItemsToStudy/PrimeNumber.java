package ItemsToStudy;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int i;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int n = scan.nextInt();
        for (i = 2; i < n/2 ; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Its a Prime Number");
        } else {
            System.out.println("Its not a Prime Number");
        }


    }
}
