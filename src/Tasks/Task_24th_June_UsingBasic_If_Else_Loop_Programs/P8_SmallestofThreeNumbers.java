package Tasks.Task_24th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P8_SmallestofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        if(!scanner.hasNextInt()) {
            System.out.println("Enter int only!");
            return;
        }
        int n1 = scanner.nextInt();

        System.out.println("Enter 2nd Number");
        if(!scanner.hasNextInt()) {
            System.out.println("Enter int only!");
            return;
        }
        int n2 = scanner.nextInt();

        System.out.println("Enter 3rd Number");
        if(!scanner.hasNextInt()) {
            System.out.println("Enter int only!");
            return;
        }
        int n3 = scanner.nextInt();

        if ((n1 < n2) && (n1 < n3)) {
            System.out.println("Smallest Number is " +n1);
        } else if ((n2 < n1) && (n2 < n3)) {
            System.out.println("Smallest Number is " +n2);
        } else {
            System.out.println("Smallest Number is " +n3);
        }
    }
}
