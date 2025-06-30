package june27Tasks;

import java.util.Scanner;

public class PatternPrinter {

    //    *   print following pattern based on user input
    //   ***
    //  *****

    public static void main(String[] args) {
        System.out.println("Enter a positive integer");
        int n = new Scanner(System.in).nextInt();
        int test = ((n + 1) / 2);

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 1; j <= n; j++) {
                if(j>=test-(i/2) && j<=test+(i/2)){
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println("");
        }


        main1();
    }

    //alternate cheat trick
    public static void main1() {
        int n=5;
        for(int i=0;i<n;i++){
            System.out.println(" ".repeat(n-i-1)+"*".repeat(2*i+1));
        }
    }
}
