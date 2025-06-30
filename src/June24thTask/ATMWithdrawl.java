package June24thTask;

import java.util.Scanner;

public class ATMWithdrawl {

    public static void main(String[] args) {
        int balance = 10000;
        int amountToWithdraw = new Scanner(System.in).nextInt();
        if (amountToWithdraw > balance || amountToWithdraw <= 0 || amountToWithdraw % 100 != 0) {
            System.out.println("Cannot proceed");
            System.out.println("Please enter amount less than balance, do not enter negative value or zero, enter amount in multiples of 100 only");
            return;
        }
        balance -= amountToWithdraw;
        System.out.printf("new balance is %d",balance);
    }
}
