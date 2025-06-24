package ex_14_Strings;

import java.util.Scanner;

public class InterviewCoding {
    public static void main(String[] args) {
        //  Palindrome
        //  madam ->  reverse(madam) -> madam ==
        //  s1 = madam
        // s1_reverse = madam
        //  s1 == s1_reverse
        // G
/*Create a program that checks whether a given string is a palindrome.
        A palindrome is a word or phrase that reads the same backward as forward
        (ignoring spaces, punctuation, and capitalization). Use an if-else statement
        to determine if the string is a palindrome*/

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String original = scanner.nextLine();


        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not palindrome.");
        }

        scanner.close();
    }
}
