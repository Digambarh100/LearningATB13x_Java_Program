package Tasks.Task_25th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P16_ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-digit number:");

        if (!scanner.hasNextInt()) {
            System.out.println("Enter only integers!!!");
            return;
        }

        int num = scanner.nextInt();

        int digits = String.valueOf(num).length();

        if (isArmstrong(num, digits)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        scanner.close();
    }

    public static boolean isArmstrong(int num, int digits) {
        int sum = 0;
        int originalNumber = num;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + (int) Math.pow(digit, digits);  // Cast to int
            num = num / 10;
        }

        return sum == originalNumber;
    }
}
