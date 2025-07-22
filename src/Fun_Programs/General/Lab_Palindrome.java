package Fun_Programs.General;

import java.util.Scanner;

public class Lab_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Word to check if it is a Palindrome:");
        String word = scanner.next();

        //Input validation
        if (!word.matches("[a-zA-Z]+")) {
            System.out.println("Please enter a valid word (letters only).");
            return;
        }

        String word1 = word.toLowerCase();
        String reversed = reverse(word1);

        if (word1.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
