package Tasks.Task_25th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P22_Travel_Based_on_VisaStatus_and_Age {

    public static boolean IsVisaValid (String status) {

        return status.equalsIgnoreCase("valid");

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");

        if(!scanner.hasNextInt()) {
            System.out.println("Invalid! Enter only intergers!!!");
            return;
        }

        int age = scanner.nextInt();

        if (age <= 0) {
            System.out.println("Invalid! Age cannot be zero or negative!!!");
            return;
        }

        System.out.println("Enter your Visa Status (ex:Valid or Invalid):");

        String Visastatus = scanner.next();


        boolean visavalid = IsVisaValid(Visastatus);

        System.out.println("------------------------ Travel Eligibility ------------------------");

        if (visavalid && age >= 18){
            System.out.println("You are eligibile to travel! Congratulations!!!");
        } else if (!visavalid && age >= 18) {
            System.out.println("You are not eligibile due to Visa validation!!!");
        } else if (visavalid && age < 18) {
            System.out.println("You are not eligibile due to Age requirement!!!");
        } else {
            System.out.println("You are not eligibile due to both Visa validation & Age requirement!!!");
        }

        scanner.close();

    }
}
