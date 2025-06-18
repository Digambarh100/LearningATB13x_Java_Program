package ex_09_Switch;

/*
Write a program that calculates and displays the letter grade for a given numerical
score (e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
 */
import java.util.Scanner;

public class Switch_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score (0-100): ");
        int score = scanner.nextInt();

        char grade;
        switch (score / 10) {
            case 10, 9 -> grade = 'A';
            case 8 -> grade = 'B';
            case 7 -> grade = 'C';
            case 6 -> grade = 'D';
            default -> grade = score >= 0 && score <= 59 ? 'F' : 'X';

        }


        System.out.println(grade == 'X' ? "Invalid score" : "Grade: " + grade);

        scanner.close();
    }
}
