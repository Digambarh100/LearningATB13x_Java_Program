package Tasks.Task_25th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P17_Number_is_a_Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word:");

        String word = scanner.next();

        if (!word.matches("[a-zA-Z]+")) {
            System.out.println("Invalid input! Enter alphabets only.");
            return;
        }

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equalsIgnoreCase(reverse)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is notvinay a Palindrome.");
        }

    }
}
