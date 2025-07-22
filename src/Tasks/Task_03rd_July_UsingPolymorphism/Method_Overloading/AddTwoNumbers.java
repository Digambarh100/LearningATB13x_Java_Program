package Tasks.Task_03rd_July_UsingPolymorphism.Method_Overloading;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Calculator a1 = new Calculator();
        System.out.println(a1.add(5, 7));
        System.out.println(a1.add(4.98,7.90));
    }
}

class Calculator {

    int add (int a, int b) {
        return a + b;
    }

    double add (double a, double b) {
        return a + b;
    }
}
