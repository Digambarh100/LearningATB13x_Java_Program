package Tasks.Task_24th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P12_CharacterIsAnAlphabet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character: ");

        if (!scanner.hasNext()) {
            System.out.println("Enter char only!!!");
            return;
        }

        char value = scanner.next().charAt(0);

        if ((value >= 'A' && value <= 'Z') || (value >= 'a' && value <= 'z')) {
            System.out.println("Character is an Alphabet");
        } else {
            System.out.println("Character is NOT an Alphabet");
        }
    }
}
