package june25thTask;

public class FindSecondMaxInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int max = Integer.MIN_VALUE;
        for (int a : numbers) {
            max = max < a ? a : max;
        }

        int max2 = Integer.MIN_VALUE;

        for (int a : numbers) {
            if (a > max2 && a < max) {
                max2 = a;
                System.out.println(max2);
            }
        }
        System.out.printf("Max value is %d %n", max);
        System.out.printf("2nd Max value is %d %n", max2);
    }
}
