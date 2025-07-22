package Tasks.Task_08th_July_UsingWrapper_Autoboxing_and_Unboxing;

public class P1_Autoboxing_and_Unboxing {
    public static void main(String[] args) {

        int a = 50;
        Integer b = a;
        int c = b;

        System.out.println("Primitive: " +a);
        System.out.println("Wrapper: " +b);
        System.out.println("Unboxed again: " +c);

    }
}
