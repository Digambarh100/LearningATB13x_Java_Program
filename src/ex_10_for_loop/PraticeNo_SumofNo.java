package ex_10_for_loop;

public class PraticeNo_SumofNo {
    static int s=0;
    public static void main(String[] args) {
        for (int x = 1; x <= 20; x++) {
           s = s + x;
        }
        System.out.println("Sum: " + s);
    }
}

