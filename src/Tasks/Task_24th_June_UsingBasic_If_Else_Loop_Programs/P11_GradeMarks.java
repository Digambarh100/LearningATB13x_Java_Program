package Tasks.Task_24th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P11_GradeMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks:");

        if(!scanner.hasNextInt()) {
            System.out.println("Enter int only");
            return;
        }

        int marks = scanner.nextInt();

        if ((marks < 0) && (marks > 100)) {
            System.out.println("Invalid! Enter correct marks");
        } else {
            System.out.println("Valid! Yours marks is " +marks);
        }

        if ((marks >= 90) && (marks <= 100)) {
            System.out.println("Grade = A+");
        } else if ((marks >= 80) && (marks <= 89)) {
            System.out.println("Grade = A");
        } else if ((marks >= 70) && (marks <= 79)) {
            System.out.println("Grade = B");
        } else if ((marks >= 60) && (marks <= 69)) {
            System.out.println("Grade = C");
        } else if ((marks >= 50) && (marks <= 59)) {
            System.out.println("Grade = D");
        } else if ((marks >= 40) && (marks <= 49)) {
            System.out.println("Grade = E");
        } else {
            System.out.println("Grade = Fail");
        }

    }
}
