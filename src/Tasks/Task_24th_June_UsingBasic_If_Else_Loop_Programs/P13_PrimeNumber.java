package Tasks.Task_24th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P13_PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // 1 and below are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a divisor other than 1 and itself
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }
    }
}
