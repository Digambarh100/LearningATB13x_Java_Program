package ex_10_for_loop;

import java.util.Scanner;

public class HackerRank_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no ( N) = : ");
        int N = scanner.nextInt();

        // Loop to calculate and print the first 10 multiples of N
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }

    }

}

