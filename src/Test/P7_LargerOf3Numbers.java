package Test;

import java.util.Scanner;

public class P7_LargerOf3Numbers {
    public static void main(String[] args) {
        /*
        Create a program to find the largest of three numbers
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter 3rd number: ");
        int n3 = scanner.nextInt();

        int result = (n1 > n2) && (n1 > n3) ? n1 : (n2 > n3) ? n2 : n3;
        System.out.println("Largest of three numbers: " +result);
    }
}
