package Tasks.Task_09th_July_UsingExceptions;

public class P9_TryBlock_WithoutException {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        try {
            int c = a/b;
            System.out.println("C value: " +c);
        } catch (Exception e) {
            System.out.println("This won't be printed - " + e.getMessage());
        } finally {
            System.out.println("finally still runs");
        }
    }
}
