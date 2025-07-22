package Tasks.Task_23rd_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P4_Vowel_Or_Consonant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");

        String input = scanner.next();

        // Check if input contains only letters
        if (!input.matches("[a-zA-Z]+")) {
            System.out.println("Invalid input! Enter a word with letters only.");
            return;
        }

        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);

        scanner.close();
    }
}
