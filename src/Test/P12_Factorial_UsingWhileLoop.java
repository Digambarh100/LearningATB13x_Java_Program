package Test;

import java.util.Scanner;

public class P12_Factorial_UsingWhileLoop {
    public static void main(String[] args) {
         /*
        Create a program to calculate factorial of a number using while loop.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = scanner.nextInt();

        int factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial = factorial*i;
            i++;
        }
        System.out.println("factorial of " +n+ " is " +factorial);
    }

}
