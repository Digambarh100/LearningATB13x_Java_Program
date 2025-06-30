package june27Tasks;

import java.util.Scanner;

public class ClassifyPersonBasedOnAge {

    public static void main(String[] args) {
        System.out.println("Enter age : ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        // Check for valid age input
        if (age < 0) {
            System.out.println("Invalid age. Please enter a non-negative number.");
        } else if (age <= 12) {
            System.out.println("You are a Child.");
        } else if (age <= 19) {
            System.out.println("You are a Teenager.");
        } else if (age <= 64) {
            System.out.println("You are an Adult.");
        } else {
            System.out.println("You are a Senior Citizen.");
        }

    }}