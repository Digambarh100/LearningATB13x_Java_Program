package QA_TEST_CODING_1;

import java.util.Scanner;

public class Code6_CheckNum_Positie_Negative {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}

