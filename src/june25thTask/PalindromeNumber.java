package june25thTask;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("Enter a number to check for palindrome");
        String number = new Scanner(System.in).nextLine();
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length()-1 - i)) {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("number is palindrome");
    }
}
