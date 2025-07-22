package Tasks.Task_23rd_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P5_AgeToVote {
    public static void main(String[] args) {

        //Check if a Person is Eligible to Vote (Age Check)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age:");

        // Check if input contains only integrets
        if (!scanner.hasNextInt()) {
            System.out.println("Enter only int!");
            return;
        }

        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Minor! Not Eligible to Vote...");
        } else if ((age == 18) || (age < 65)) {
            System.out.println("Adult! Eligible to Vote...");
        } else {
            System.out.println("Senior Citizens! Eligible to Vote...");
        }


    }
}
