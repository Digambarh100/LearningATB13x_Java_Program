package QA_TEST_CODING_1;

public class Code5_Operators {
    public static void main(String[] args) {
        int a = 15;
         int b= 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a % b = " + (a % b));  // Modulus
        System.out.println("====================================");

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y));  // Logical AND
        System.out.println("x || y: " + (x || y));  // Logical OR
        System.out.println("!x: " + (!x));          // Logical NOT
        System.out.println();
        System.out.println("====================================");

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));  // Equal to
        System.out.println("a != b: " + (a != b));  // Not equal to
        System.out.println("a > b: " + (a > b));    // Greater than
        System.out.println("a < b: " + (a < b));    // Less than
        System.out.println("a >= b: " + (a >= b));  // Greater than or equal to
        System.out.println("a <= b: " + (a <= b));  // Less than or equal to
        System.out.println("====================================");


        // Assignment Operators
        System.out.println("Assignment Operators:");
        int c = a;       // simple assignment
        System.out.println("c = " + c);
        c += b;          // c = c + b
        System.out.println("c += b: " + c);
        c -= b;          // c = c - b
        System.out.println("c -= b: " + c);
        c *= b;          // c = c * b
        System.out.println("c *= b: " + c);
        c /= b;          // c = c / b
        System.out.println("c /= b: " + c);
        c %= b;          // c = c % b
        System.out.println("c %= b: " + c);
        System.out.println("====================================");

        // Unary Operators
        System.out.println("Unary Operators:");
        int d = 10;
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d));    // Pre-increment
        System.out.println("d++ = " + (d++));    // Post-increment
        System.out.println("d after post-increment = " + d);
        System.out.println("--d = " + (--d));    // Pre-decrement
        System.out.println("d-- = " + (d--));    // Post-decrement
        System.out.println("d after post-decrement = " + d);
        System.out.println("====================================");

        // Ternary Operator
        System.out.println("Ternary Operator:");
        int num = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + num);
    }
    }

