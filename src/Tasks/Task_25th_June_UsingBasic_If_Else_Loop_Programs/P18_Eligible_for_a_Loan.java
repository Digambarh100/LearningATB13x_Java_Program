package Tasks.Task_25th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P18_Eligible_for_a_Loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Age:");

        if(!scanner.hasNextInt()) {
            System.out.println("Enter only numbers!!!");
            return;
        }
        int age = scanner.nextInt();
        if (age < 0) {
            System.out.println("Age cannot be negative!");
            return;
        }


        System.out.println("Enter your Salary:");
        if(!scanner.hasNextFloat()) {
            System.out.println("Enter only numbers!!!");
            return;
        }
        float salary = scanner.nextFloat();
        if (salary < 0) {
            System.out.println("Salary cannot be negative!");
            return;
        }

        System.out.println("Enter your Credit Score:");
        if(!scanner.hasNextInt()) {
            System.out.println("Enter only numbers!!!");
            return;
        }
        int cs = scanner.nextInt();
        if (cs < 0) {
            System.out.println("Credit Score cannot be negative!");
            return;
        }

        boolean eligible = true;

        if (age < 18 || age > 80) {
            System.out.println("Not eligible: Age must be between 18 and 80.");
            eligible = false;
        }

        if (salary < 30000) {
            System.out.println("Not eligible: Salary must be at least 30000 rupees.");
            eligible = false;
        }

        if (cs < 650 || cs > 850) {
            System.out.println("Not eligible: Credit Score must be between 650 and 850.");
            eligible = false;
        }

        if (eligible) {
            System.out.println("You're eligible for a loan! Congratulations!!!");
        }

    }
}
