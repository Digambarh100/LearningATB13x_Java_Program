package Test;

public class P3_Pre_and_Post_Increment {
    public static void main(String[] args) {
        /*
        Create a program to show the difference between ++i and i++.
        */

        int a = 1;
        System.out.println("Pre increment (a): " + ++a);
        // here a value is increased by 1 first and then printed (output = 2)

        int b = 1;
        System.out.println("Post increment (b): " + b++);
        // here b value is printed first and then increased by 1 (output = 1)
    }
}
