package ex_04_Operators;

public class Lab038_Unary_Operator {
    public static void main(String[] args) {
        // Unary Operator
        int a = +10;
//        int a = 10; optional
        int a1 = -110;
        int result = a+a1; //10-110
        System.out.println(a);
        System.out.println(a1);
        System.out.println(result);


        int b = -1;
        b = b+1;
        System.out.println(b); //0
    }
}
