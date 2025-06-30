package June24thTask;

public class SmallestOfThreeNumbers {

    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c=100;

        int min=a<b?(a<c?a:c):(b<c)?b:c;
        System.out.println(min);
    }
}
