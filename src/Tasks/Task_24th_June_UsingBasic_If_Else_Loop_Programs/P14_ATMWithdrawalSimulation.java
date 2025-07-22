package Tasks.Task_24th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P14_ATMWithdrawalSimulation {
    public static void main(String[] args) {
        int AccBal = 10000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to withdraw (amount)");

        if (!scanner.hasNextInt()){
            System.out.println("Enter int only");
            return;
        }

        int amount = scanner.nextInt();

        if ((amount <= 0)) {
            System.out.println("Amount entered is invalid, enter the proper amount!");
        } else if (amount % 100 != 0) {
            System.out.println("Enter Amount in multiple of 100");
        } else if (amount>AccBal) {
            System.out.println("Amount entered exceed the account balance");
        }  else {
            int CurAccBal = (AccBal - amount);
            System.out.println("Remaining balance is " +CurAccBal);
        }
    }
}
