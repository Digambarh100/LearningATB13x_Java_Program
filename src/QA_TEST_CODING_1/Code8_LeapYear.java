package QA_TEST_CODING_1;

import java.util.Scanner;
//8. Write a program to check if a year is a leap year.
public class Code8_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " " + "is leap year");
        } else {
            System.out.println(year + " " + "is not leap year");
        }


    }
}
