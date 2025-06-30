package june23rdTask;

import java.util.Scanner;

public class FindMinOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a =scanner.nextInt();
        int b=scanner.nextInt();

        int min=a<b?a:b;
        System.out.println(min );
    }
}
