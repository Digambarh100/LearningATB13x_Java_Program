package Tasks.Task_09th_July_UsingExceptions;

public class P8_ThrowException_and_CatchIt {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            if( b == 0 )  {
                throw new ArithmeticException("Cannot divide by zero");
            }

            int c = a / b;
            System.out.println("c value: " +c);

        } catch (ArithmeticException e) {
            System.out.println("Caught: " +e.getClass().getSimpleName() + " - " +e.getMessage());
        }
        System.out.println("Even after Exception code execution continues...");
    }
}
