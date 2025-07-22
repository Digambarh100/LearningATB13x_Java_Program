package Tasks.Task_08th_July_UsingWrapper_Autoboxing_and_Unboxing;

public class P5_CompareWrapperObjects {

    // Compare two Integer objects using == and .equals() and print the results.
    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;

        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b: " + (a==b));
        System.out.println("c == d: " +(c==d));

        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("c.equals(d): " + c.equals(d));


    }
}
