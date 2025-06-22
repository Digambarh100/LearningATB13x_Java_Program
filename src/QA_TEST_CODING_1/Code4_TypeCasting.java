package QA_TEST_CODING_1;

public class Code4_TypeCasting {
    public static void main(String[] args) {
        // Implicit Casting (Widening) - smaller to larger data type
        int int_Value = 355;
        double double_Value = int_Value;  // int automatically converted to double
        System.out.println("Implicit Casting:");
        System.out.println("Value of int: " + int_Value); //355
        System.out.println("Double value after implicit casting): " + double_Value); //355.0

        System.out.println();

        // Explicit Casting (Narrowing) - larger to smaller data type
        double double_Value_2 = 25.908;
        int int_Value_2 = (int) double_Value_2;  // double manually converted to int
        System.out.println("Explicit Casting:");
        System.out.println("double value: " + double_Value_2); //
        System.out.println("int value after explicit casting): " + int_Value_2);
    }
}

