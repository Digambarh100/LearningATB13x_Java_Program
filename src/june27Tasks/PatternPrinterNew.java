package june27Tasks;

import java.util.Scanner;

public class PatternPrinterNew {

    public static void main(String[] args) {
        System.out.println("Enter a positive integer");
        int n = new Scanner(System.in).nextInt();
        n*=2;
        int test = ((n + 1) / 2);


        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 1; j <= n; j++) {
                if (j >= test - (i / 2) && j <= test + (i / 2)) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
