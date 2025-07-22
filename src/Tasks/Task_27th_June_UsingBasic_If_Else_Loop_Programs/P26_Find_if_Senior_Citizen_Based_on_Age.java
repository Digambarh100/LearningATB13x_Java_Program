package Tasks.Task_27th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P26_Find_if_Senior_Citizen_Based_on_Age {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age:");

        if (!scanner.hasNextInt()) {
            System.out.println("Enter only numeric values!!!");
            return;
        }

        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Invalid Age! Age cannot be negative!!!");
            return;
        }

        if (age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 64) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior Citizen");
        }
    }
}
