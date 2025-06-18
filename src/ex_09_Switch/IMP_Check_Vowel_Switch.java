package ex_09_Switch;

import java.util.Scanner;

public class IMP_Check_Vowel_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        // Convert to lowercase for easier comparison
        char ch = scanner.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch + " is a vowel.");

            default -> System.out.println(ch + " is a consonant.");
        }


        }

    }



