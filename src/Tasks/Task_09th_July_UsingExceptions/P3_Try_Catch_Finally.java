package Tasks.Task_09th_July_UsingExceptions;

public class P3_Try_Catch_Finally {
    public static void main(String[] args) {

        int a = 12;
        int b = 0;

        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException - can't divide by 0!!!");
        } finally {
            System.out.println("Finally block always executes!!!");
        }

    }
}
