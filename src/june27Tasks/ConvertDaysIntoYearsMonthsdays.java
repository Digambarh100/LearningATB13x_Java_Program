package june27Tasks;

import java.util.Scanner;

public class ConvertDaysIntoYearsMonthsdays {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter days to convert into days years months : ");

        int totalDays = scanner.nextInt();

        // Conversion logic
        int years = totalDays / 365; //
        int remainingDaysAfterYears = totalDays % 365;

        int months = remainingDaysAfterYears / 30;
        int days = remainingDaysAfterYears % 30;

        // Output result
        System.out.println(totalDays + " days = " + years + " years, " + months + " months, and " + days + " days.");


    }
}