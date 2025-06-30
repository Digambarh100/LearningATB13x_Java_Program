package june17thtask;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("enter a string to check if it is palindrome");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        //using String builder
        StringBuilder sb=new StringBuilder(input.trim());
        if(sb.reverse().toString().equals(input.trim())){
            System.out.println(input+" is a palindrome");
        }
        else{
            System.out.println(input+" is not a palindrome");
        }

    }
}
