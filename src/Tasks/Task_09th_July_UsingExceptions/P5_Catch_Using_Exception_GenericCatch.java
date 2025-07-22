package Tasks.Task_09th_July_UsingExceptions;

public class P5_Catch_Using_Exception_GenericCatch {
    public static void main(String[] args) {

        try {
            if(args[0].equals("null")) {
                String str = null;
                System.out.println(str.length());
            } else {
                int a = 10;
                int b = Integer.parseInt(args[0]);  // Pass 0 to trigger ArithmeticException
                int c = a / b;
                System.out.println("Result: " + c);
            }
        } catch (ArithmeticException  | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
        System.out.println("Program continues after generic catch...");
    }
}
