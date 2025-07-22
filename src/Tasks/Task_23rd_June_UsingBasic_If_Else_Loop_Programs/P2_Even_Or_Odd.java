package Tasks.Task_23rd_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P2_Even_Or_Odd {
    public static void main(String[] args) {

        //Check if a Number is Even or Odd
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");

        if(!scanner.hasNextInt()) {
            System.out.println("Enter only Int!");
            return;
        }

        int n = scanner.nextInt();

        if (n%2 == 0) {
            System.out.println("Even Number: " +n);
        } else {
            System.out.println("Odd Number: " +n);
        }
    }
}
