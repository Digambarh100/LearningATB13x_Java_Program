package Test;

import java.util.Scanner;

public class P9_DayOfTheWeek {
    public static void main(String[] args) {
        /*
        Create a program using switch statement to display day of the week
        */

        //Taking input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of the week: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wedesday");
                break;
            }
            case 4: {
                System.out.println("Thursday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }
            case 7: {
                System.out.println("Sunday");
                break;
            }
        }
    }
}
