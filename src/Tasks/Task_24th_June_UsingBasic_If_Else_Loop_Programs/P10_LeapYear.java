package Tasks.Task_24th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P10_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Year:");

        if(!scanner.hasNextInt()) {
            System.out.println("Enter valid year!!!");
            return;
        }

        int year = scanner.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Leap Year is " +year);
        } else {
            System.out.println("Not a Leap Year - " +year);
        }
    }
}
