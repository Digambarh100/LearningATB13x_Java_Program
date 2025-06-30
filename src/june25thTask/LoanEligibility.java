package june25thTask;

import java.util.Scanner;

public class LoanEligibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = scanner.nextInt();
        System.out.println("Enter Salary");
        double salary = scanner.nextDouble();
        System.out.println("Enter Credit score");
        int creditScore = scanner.nextInt();
        scanner.close();
        boolean validAge = age >= 18 && age <= 80;
        boolean validSalary = salary >= 30000;
        boolean validCreditScore = creditScore >= 650 && creditScore <= 850;

        if (validAge && validSalary && validCreditScore) {
            System.out.println("Eligible for loan");
        } else {
            System.out.println("not eligible for loan");
        }
    }
}
