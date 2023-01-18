package ItemsToStudy;

import java.util.Scanner;

public class ArraySortingAscending {
    public static void main(String[] args) {
        int i, j, k, limit, temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total limits");
        limit = scan.nextInt();
        int[] numbers = new int[limit];
        System.out.println("Enter the number list");
        for (k = 0; k < limit; k++) {
            numbers[k] = scan.nextInt();
        }
        System.out.println("The number in ascending order");
        for (i = 0; i < limit - 1; i++) {
            for (j = i + 1; j < limit; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }
        for (i = 0; i < limit; i++) {
            System.out.println(numbers[i]);
        }


    }
}
