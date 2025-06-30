package june25thTask;

import java.util.Scanner;

public class CanTravel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter visa status(True/False)");
        String visaStatus = scanner.nextLine();
        boolean status = Boolean.parseBoolean(visaStatus.toLowerCase());

        if (age >= 18 && status) {
            System.out.println("Person can travel");
        } else {
            System.out.println("Person cannot travel");
        }

    }
}
