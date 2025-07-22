package Fun_Programs.General;

public class Lab_Fun_MiniCalculator_WithAllTypesOfOperators {
    public static void main(String[] args) {
        // Define input values
        int a = 10;
        int b = 5;

        System.out.println("Mini Calculator with Arithmetic, Relational & Logical Operators:");
        System.out.println();
        // ----- Arithmetic Operations -----
        System.out.println("Arithmetic Operations:");
        System.out.println("Addition: " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
        System.out.println("Division: " + a + " / " + b + " = " + (a / b));
        System.out.println("Modulus: " + a + " % " + b + " = " + (a % b));
        System.out.println();

        // ----- Relational Operations -----
        System.out.println("Relational Operations:");
        System.out.println(a + " > " + b + " = " + (a > b));
        System.out.println(a + " < " + b + " = " + (a < b));
        System.out.println(a + " >= " + b + " = " + (a >= b));
        System.out.println(a + " <= " + b + " = " + (a <= b));
        System.out.println(a + " == " + b + " = " + (a == b));
        System.out.println(a + " != " + b + " = " + (a != b));
        System.out.println();

        // ----- Logical Operations -----
        boolean x = true;
        boolean y = false;

        System.out.println("Logical Operations:");
        System.out.println("true && false = " + (x && y));
        System.out.println("true || false = " + (x || y));
        System.out.println("!true = " + (!x));
        System.out.println("!(10 > 5) = " + !(a > b));
    }
}
