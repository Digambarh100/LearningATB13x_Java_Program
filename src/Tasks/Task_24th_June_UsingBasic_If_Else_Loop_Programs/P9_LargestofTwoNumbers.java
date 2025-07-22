package Tasks.Task_24th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P9_LargestofTwoNumbers {
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

        if(n1 > n2) {
            System.out.println("Largest Number is "+n1);
        } else {
            System.out.println("Largest Number is " +n2);
        }
    }
}
