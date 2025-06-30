package june12thTask;

public class TernaryOperator {

    public static void main(String[] args) {
        // Description: compare 3 numbers using ternary operator;

        int n1 = 100;
        int n2 = -11;
        int n3 = 1;
        int max = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println(max);

        //alternate
        int max2=n1>n2? n1:n2;
        max2=max2>n3?max2:n3;
        System.out.println(max2);
    }
}
