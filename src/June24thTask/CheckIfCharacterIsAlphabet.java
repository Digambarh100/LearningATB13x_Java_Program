package June24thTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CheckIfCharacterIsAlphabet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() > 1) {
            System.out.println("Enter single character only");
            return;
        }
        char a=input.charAt(0);
//        if(Character.isAlphabetic(input.charAt(0))){
//            System.out.println("Entered character is alphabet");
//        }
//        else {
//            System.out.println("Entered character is not alphabet");
//        }
        if((a>=65 && a<=90) ||(a>=97 && a<=122)){
            System.out.println("Entered character is alphabet");
        }
        else {
            System.out.println("Entered character is not alphabet");
        }
    }
}
