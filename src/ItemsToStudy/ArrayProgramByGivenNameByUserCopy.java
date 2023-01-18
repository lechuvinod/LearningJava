package ItemsToStudy;

import java.util.Scanner;

public class ArrayProgramByGivenNameByUserCopy {
    public static void main(String[] args) {
        int i, j, n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Family members : ");
        n = scan.nextInt();
        String[] newArray = new String[n];
        System.out.println("Enter the family members first name");
        for(i=0; i<n; i++){

            newArray[i] = scan.next();
        }
        System.out.println("The members are: ");
        for(j=0;j<i;j++) {
            System.out.print(newArray[j]+" , ");

        }

    }
}



