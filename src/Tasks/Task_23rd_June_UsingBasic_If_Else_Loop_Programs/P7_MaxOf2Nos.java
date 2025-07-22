package Tasks.Task_23rd_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P7_MaxOf2Nos {
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

        if (n1 > n2) {
            System.out.println("Biggest No is: " +n1);
        } else {
            System.out.println("Biggest No is: " +n2);
        }
    }
}
