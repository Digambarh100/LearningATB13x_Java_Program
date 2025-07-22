package Test;

import java.util.Scanner;

public class P8_LeapYear {
    public static void main(String[] args) {
        /*
        Write a program to check if a year is a leap year.
        */

        //Taking input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        if ((year % 400 == 0) || (year % 4 ==0) && (year % 100 != 0)){
            System.out.println( + year + " is Leap Year");
        }else {
            System.out.println( + year + " is not a Leap Year");
        }
    }
}
