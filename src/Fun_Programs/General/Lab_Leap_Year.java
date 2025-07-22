package Fun_Programs.General;

import java.util.Scanner;

public class Lab_Leap_Year {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Checking whether given years is Leap years or not:");
                System.out.println("Enter year:");
                long year = scanner.nextLong();

                if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
                    System.out.println(year+ " is Leap Year!");
                } else {
                    System.out.println(year+ " is not Leap Year!");
                }
    }
}
