package Tasks.Task_23rd_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P3_Max_Of_3Nos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st Number (n1):");
        if (!scanner.hasNextInt()) {
            System.out.println("Enter only int!");
            return;
        }
        int n1 = scanner.nextInt();

        System.out.println("Enter 2nd Number (n2):");
        if (!scanner.hasNextInt()) {
            System.out.println("Enter only int!");
            return;
        }
        int n2 = scanner.nextInt();

        System.out.println("Enter 3rd Number (n3):");
        if (!scanner.hasNextInt()) {
            System.out.println("Enter only int!");
            return;
        }
        int n3 = scanner.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("Big Number: " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("Big Number: " + n2);
        } else {
            System.out.println("Big Number: " + n3);
        }

    }
}