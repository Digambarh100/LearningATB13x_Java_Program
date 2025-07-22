package Tasks.Task_27th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P24_Convert_Days_into_Years_Months_and_Days {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of days:");

        if(!scanner.hasNextLong()) {
            System.out.println("Enter only numeric value!!!");
            return;
        }

        long NoOfDays = scanner.nextLong();

        if(NoOfDays <= 0) {
            System.out.println("Number of days cannot be zero or negative!!!");
            return;
        }

        long years = (NoOfDays / 365);
        long remainingDaysAfterYears = (NoOfDays % 365);
        long months = (remainingDaysAfterYears / 30);
        long remainingDaysAfterMonths = (remainingDaysAfterYears % 30);


        System.out.println("Years: " +years+ "; Months: " +months+ "; Days: " +remainingDaysAfterMonths);
    }
}
