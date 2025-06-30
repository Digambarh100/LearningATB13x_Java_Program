package June24thTask;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Enter score");
        Scanner scanner = new Scanner(System.in);
        int score;
        if (scanner.hasNextInt()) {
            score = scanner.nextInt();
            if (score > 100 || score < 0) {
                System.out.println("enter input b/w 0-100");
                return;
            }
        } else {
            System.out.println("Enter score in number");
            return;
        }
//        String grade=90<=score &&score<=100?"A": (80<=score&&score<=89)?"B":(70<=score&&score<=79)?"C":(60<=score&&score<=69)?"D":"F";
        String grade = score > 89 ? "A" : score > 79 ? "B" : score > 69 ? "C" : score > 59 ? "D" : "F";
        System.out.println("Grade is: " + grade);
    }
}
