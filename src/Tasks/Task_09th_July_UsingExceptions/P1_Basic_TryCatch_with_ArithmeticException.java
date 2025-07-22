package Tasks.Task_09th_July_UsingExceptions;

import java.util.Scanner;

public class P1_Basic_TryCatch_with_ArithmeticException {
    public static void main(String[] args) {

        int a = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter b value: ");
        int b = scanner.nextInt();

        try {
            int c = (a / b);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException - can't divide by 0!!!");

            scanner.close();
        }
    }
}
