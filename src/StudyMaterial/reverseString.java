package StudyMaterial;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scan.next();
        System.out.println("The reverse name is: ");
        for (int i = name.length(); i > 0; i--) {
            System.out.print(name.charAt(i-1));
        }

    }
}
