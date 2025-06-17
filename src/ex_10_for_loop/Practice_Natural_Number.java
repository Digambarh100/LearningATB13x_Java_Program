package ex_10_for_loop;

import java.util.Scanner;

public class Practice_Natural_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Starting Number : ");
        int starting_Number =input.nextInt();
        System.out.print("Enter The Ending Number : ");
        int end_Number =input.nextInt();
        while(starting_Number <= end_Number)
        {
            System.out.println(starting_Number);
            starting_Number++;
        }
    }
}