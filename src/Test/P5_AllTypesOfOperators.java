package Test;

public class P5_AllTypesOfOperators {
    public static void main(String[] args) {
        /*
        Create a program to demonstrate all types of operators
        */

        int a = 15;
        int b = 10;

        //Arthimatic Operators
        System.out.println("Arthimatic Operators:");
        System.out.println(a + b); //Addition
        System.out.println(a - b); //Subtration
        System.out.println(a * b); //Multiplcation
        System.out.println(a / b); //Division
        System.out.println(a % b); //Modulus (Remainder as output)

        //Comparation (Relational) Operators
        System.out.println("\nComparation (Relational) Operators:");
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == 15);
        System.out.println(a != b);
        System.out.println(b <= 10);
        System.out.println(b >= 8);

        //Assignment Operators
        System.out.println("\nAssignment Operators:");
        float f = 65457.875F;
        System.out.println(f);

        //Logical Operators - AND
        System.out.println("\nLogical Operators - AND:");
        if ((a < 20) && (b > 9)){
            System.out.println("AND Operation, Success");
        }else {
            System.out.println("AND Operation, Fail");
        }

        //Logical Operators - OR
        System.out.println("\nLogical Operators - OR:");
        if ((a < 20) || (b > 9)){
            System.out.println("OR Operation, Success");
        }else {
            System.out.println("OR Operation, Fail");
        }

        // Unary Operator
        System.out.println("\nUnary Operator:");
        int x = 7;
        int y = -9;
        System.out.println(x+y);

        //Ternary Operator
        System.out.println("\nTernary Operator:");
        boolean z = (x > y) ? true: false;
        System.out.println(z);

        //Increment & Decrement
        System.out.println("\nIncrement & Decrement:");
        System.out.println(a++);
        System.out.println(++b);
        System.out.println(x--);
        System.out.println(--y);

    }
}
