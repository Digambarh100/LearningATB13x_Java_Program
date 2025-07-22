package Tasks.Task_25th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P20_Bonus_Calculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Salary:");

        if (!scanner.hasNextLong()) {
            System.out.println("Enter only numbers for salary!!!");
            return;
        }

        long salary = scanner.nextLong();

        if (salary < 0) {
            System.out.println("Salary can't be negative!!!");
            return;
        }

        System.out.println("Enter your experience in years (e.g., 2.5):");

        if (!scanner.hasNextFloat()) {
            System.out.println("Enter valid decimal value for experience!!!");
            return;
        }

        float years = scanner.nextFloat();

        if (years < 0) {
            System.out.println("Experience can't be negative!!!");
            return;
        }

        float bonus = 0;
        float totalSalary;

        if (years < 1) {
            System.out.println("No Bonus - Experience is less than 1 year.");
        } else if (years >= 1 && years <= 3) {
            bonus = salary * 0.05f;
        } else if (years > 3 && years <= 6) {
            bonus = salary * 0.10f;
        } else {
            bonus = salary * 0.15f;
        }

        if (years >= 1) {
            totalSalary = salary + bonus;
            System.out.println("Bonus Amount: " + bonus+ " rupees");
            System.out.println("Total Salary after bonus included = " + totalSalary+ " rupees");
        }

        scanner.close();
    }
}
