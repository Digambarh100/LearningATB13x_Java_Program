package Tasks.Task_23rd_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P1_Positive_Or_Negative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");

        // Check BEFORE reading input
        if (!scanner.hasNextInt()) {
            System.out.println("Enter int only!");
            return;
        }

        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Number is Zero: " + number);
        } else if (number > 0) {
            System.out.println("Number is Positive: " + number);
        } else {
            System.out.println("Number is Negative: " + number);
        }

    }
}
