package Tasks.Task_09th_July_UsingExceptions;

public class P10_Try_With_MultipleStatements {
    public static void main(String[] args) {

        int a = 10;

        try {
            System.out.println("Division starts");
            int b = Integer.parseInt(args[0]);
            int c = a/b;
            System.out.println("c value = " + c);

            String s = null;
            System.out.println("Length = " + s.length());

            System.out.println("This won't run if exception occurs before");

        } catch (Exception e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        System.out.println("Execution Continues...");

    }
}
