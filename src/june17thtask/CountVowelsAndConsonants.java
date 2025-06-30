package june17thtask;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int vowel=0;
        int consonant=0;
        for(char c:input.toCharArray()){
            switch (c){
                case 'a','e','i','o','u'-> vowel++;
                default -> consonant++;
            }
        }
        System.out.println("Vowel count: "+vowel);
        System.out.println("Consonant count: "+consonant);

    }
}
