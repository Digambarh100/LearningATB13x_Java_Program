package Tasks.Task_09th_July_UsingExceptions;

import java.util.Scanner;

public class P2_TryCatch_with_Multiple_Catch_Blocks {
    public static void main(String[] args) {
        int a = 10;

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter b value: ");
        int b = Integer.parseInt(args[0]);

        try{
            int c = (a / b);
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException - can't divide by 0!!!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //scanner.close();
    }
}
