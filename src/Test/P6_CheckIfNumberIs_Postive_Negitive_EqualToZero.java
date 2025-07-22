package Test;

import java.util.Scanner;

public class P6_CheckIfNumberIs_Postive_Negitive_EqualToZero {
    public static void main(String[] args) {
        /*
        Write a program to check if a number is positive, negative, or zero
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Number is negative number");
        } else if (number == 0) {
            System.out.println("Number is equal to zero");
        } else {
            System.out.println("Number is positive number");
        }
    }
}
