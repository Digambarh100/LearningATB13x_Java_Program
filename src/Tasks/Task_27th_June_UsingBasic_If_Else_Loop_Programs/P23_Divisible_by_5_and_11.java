package Tasks.Task_27th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P23_Divisible_by_5_and_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");

        if(!scanner.hasNextInt()) {
            System.out.println("Enter only int!!!");
            return;
        }

        int num = scanner.nextInt();

        if(num <= 0) {
            System.out.println("Number cannot be zero or negative!!!");
            return;
        }

        if ((num % 5 == 0) && (num % 11 == 0)) {
            System.out.println("Number is Divisible by 5 and 11");
        } else {
            System.out.println("Number is not Divisible by 5 and 11");
        }
    }
}
