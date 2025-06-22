package QA_TEST_CODING_1;

public class Code5_Operators {
    public static void main(String[] args) {
        int a = 15;
         int b= 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // Addition  20
        System.out.println("a - b = " + (a - b));  // Subtraction 10
        System.out.println("a / b = " + (a / b));  // Division  3
        System.out.println("a * b = " + (a * b));  // Multiplication  75
        System.out.println("a % b = " + (a % b));  // Modulus 0
        System.out.println("====================================");

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y));  // Logical AND   // f
        System.out.println("x || y: " + (x || y));  // Logical OR   //t
        System.out.println("!x: " + (!x));          // Logical NOT  // f
        System.out.println("!x: " + (!y));  // t
        System.out.println();
        System.out.println("====================================");

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));  // Equal to   //f
        System.out.println("a != b: " + (a != b));  // Not equal to  //t
        System.out.println("a > b: " + (a > b));    // Greater than //t
        System.out.println("a < b: " + (a < b));    // Less than // f
        System.out.println("a >= b: " + (a >= b));  // Greater than or equal to //t
        System.out.println("a <= b: " + (a <= b));  // Less than or equal to  //f
        System.out.println("====================================");


        // Assignment Operators
        System.out.println("Assignment Operators:");
        int c = a;       // simple assignment  a=15
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
        System.out.println("d = " + d);  //10
        System.out.println("++d = " + (++d));    // Pre-increment  //11
        System.out.println("d++ = " + (d++));    // Post-increment  //11
        System.out.println("d after post-increment = " + d); //12
        System.out.println("--d = " + (--d));    // Pre-decrement //11
        System.out.println("d-- = " + (d--));    // Post-decrement//11
        System.out.println("d after post-decrement = " + d); // 10
        System.out.println("====================================");

        // Ternary Operator
        System.out.println("Ternary Operator:");
        int num = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + num);
    }
    }

