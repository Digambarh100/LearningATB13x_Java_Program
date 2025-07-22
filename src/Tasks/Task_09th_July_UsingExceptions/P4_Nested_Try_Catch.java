package Tasks.Task_09th_July_UsingExceptions;

import java.util.Scanner;

public class P4_Nested_Try_Catch {
    public static void main(String[] args) {

        int a = 10;

        try {
            int b = Integer.parseInt(args[0]);
            int c = a/b;
            try {
                int[] numbers = {1, 2, 3};
                System.out.println("Accessing index 5: " + numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e1.getMessage());
            }
        } catch (ArithmeticException e2) {
            System.out.println("ArithmeticException: " + e2.getMessage());
        } catch (NumberFormatException e3) {
            System.out.println("Invalid number format: " + e3.getMessage());
        } catch (ArrayIndexOutOfBoundsException e4) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e4.getMessage());
        }
    }
}
