package june25thTask;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println("Enter a valid number");
        int number = new Scanner(System.in).nextInt();
        int originalNumber = number;
        int length = String.valueOf(number).length();
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            sum += Math.pow(rem, length);
            number = number / 10;
        }
        if (originalNumber == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("not Armstrong number");
        }
    }
}
