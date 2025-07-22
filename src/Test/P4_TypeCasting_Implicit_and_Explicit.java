package Test;

public class P4_TypeCasting_Implicit_and_Explicit {
    public static void main(String[] args) {
        /*
        Write a program to demonstrate type casting (both implicit and explicit).
        */

        byte b = 5;
        int i = 120;
        float f = 7867.987F;
        double d = 65688.765786;

        // Type Casting Widening (Implicit)
        short s1 = b;
        System.out.println("Type Casting Widening (Implicit): " +b);

        // Type Casting Widening (Explicit)
        long l1 = (long) i;
        System.out.println("Type Casting Widening (Explicit): " +i);

        // Type Casting Narrowing (Implicit)
        short s2 = (short) f;
        System.out.println("Type Casting Narrowing (Implicit): " +f);
        // short s2 = f; (Invalid will get complier error)

        // Type Casting Narrowing (Explicit)
        long l2 = (long) d;
        System.out.println("Type Casting Narrowing (Explicit): " +d);
    }
}
