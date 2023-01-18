
package ItemsToStudy;

import java.util.Scanner;

public class PrintSumOfNNumbers {
    public static void main(String[] args) {
        int sum = 0, i;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
