package ItemsToStudy;

import java.util.Scanner;

public class SimpleArrayProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strName = new String[]{"Lakshmi", "Vinod"};
        System.out.print("My name is :");
        for (int i = 0; i < strName.length; i++) {
            System.out.print(" ");
            System.out.print(strName[i]);
        }
    }
}
