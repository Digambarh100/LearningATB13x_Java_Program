package ex_09_Switch;

import java.util.Scanner;

public class IMP_Check_Vowel_Switch_other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        // Convert to lowercase for easier comparison
        char ch = scanner.next().toLowerCase().charAt(0);

        // Check if the input is a letter
        if (ch >= 'a' && ch <= 'z') {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");
                    break;
            }
        } else {
            System.out.println("Invalid input. Please enter a letter.");
        }

    }
}

