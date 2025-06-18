package ex_08_If_Condition;

import java.util.Scanner;
/*
Create a program that determines whether a given year is a leap year.
 A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
 Use an if-else statement to make this determination.
 */
public class Leap_Year_IF_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " " + "is leap year");
        } else {
            System.out.println(year + " " + "is not leap year");
        }
        sc.close();

    }
}
