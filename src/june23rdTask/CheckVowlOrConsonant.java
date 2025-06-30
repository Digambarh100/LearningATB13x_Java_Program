package june23rdTask;

import java.util.Scanner;

public class CheckVowlOrConsonant {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        if(a.length()>1 || Character.isDigit(a.toCharArray()[0])){
            System.out.println("Enter single Alphabet only");
            return;
        }
        switch (a.toLowerCase()){
            case "a","e","i","o","u"->System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }
}
