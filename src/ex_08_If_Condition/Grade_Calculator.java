package ex_08_If_Condition;

import java.util.Scanner;

/*
Write a program that calculates and displays the letter grade for a given numerical
score (e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
*/
public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your numerical score (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is: A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Your grade is: B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Your grade is: C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Your grade is: D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("Your grade is: F");
        } else {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        }

        scanner.close();
    }
}


