package Fun_Programs.General;

import java.util.Scanner;

public class Lab_StringOrCharIsAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character or string: ");
        String input = scanner.next();

        boolean allAlphabets = true;
        String nonAlphabetChars = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isLetter(ch)) {
                allAlphabets = false;
                nonAlphabetChars += ch + " ";
            }
        }

        if (allAlphabets) {
            System.out.println(input.length() == 1 ? "Character is an Alphabet" : "All characters are Alphabets");
        } else {
            System.out.println("Non-alphabetic characters found: " + nonAlphabetChars.trim());
            System.out.println(input.length() == 1 ? "Character is NOT an Alphabet" : "String has non-alphabet characters");
        }
    }
}
