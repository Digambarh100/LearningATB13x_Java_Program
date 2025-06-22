package QA_TEST_CODING_1;

//1. Write a Java program to declare variables of all primitive data types and print their default values.
public class Code1_Print_Default_Value {
    //primitive data types
        static byte byte1;
        static short short1;
        static int int1;
        static long long1;
        static float float1;
        static double double1;
        static char char1;
        static boolean boolean1;
   // non-primitive data type
    static String string ;


        public static void main(String[] args) {

            System.out.println("Default value of byte: " + byte1);
            System.out.println("Default value of short: " + short1);
            System.out.println("Default value of int: " + int1);
            System.out.println("Default value of long: " + long1);
            System.out.println("Default value of float: " + float1);
            System.out.println("Default value of double: " + double1);
            System.out.println("Default value of char: '" + char1 +"'");
            System.out.println("Default value of boolean: " + boolean1);

            System.out.println("Default value of String: " + string);
        }
    }