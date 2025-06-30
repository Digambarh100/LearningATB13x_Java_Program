package June24thTask;

import java.util.Scanner;

public class isPrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isPrime(number));
    }

    public static boolean isPrime(int number) {
        int counter = 0;
        int count = 0;
        for (int i = 2; i <=Math.sqrt(number); i++) {
            counter++;
            if (number % i == 0) {
                count++;
            }
            if (count > 0) {
                return false;

            }
        }
        System.out.println(counter+"counter");
        return true;
    }
}
