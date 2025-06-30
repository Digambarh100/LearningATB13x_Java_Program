package june23rdTask;

import java.util.Scanner;

public class checkPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value");
        String input = scanner.nextLine();
        System.out.println(input);
        String output = reverse(input);
        System.out.println(output);
        if (input.equals(output)) {
            System.out.println("Palindrome");
            return;
        }
        System.out.println("not a palindrome");
    }

    public static String reverse(String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }
}
