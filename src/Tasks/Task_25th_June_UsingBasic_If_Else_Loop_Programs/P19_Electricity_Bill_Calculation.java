package Tasks.Task_25th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P19_Electricity_Bill_Calculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of units:");

        if(!scanner.hasNextInt()) {
            System.out.println("Enter only numbers!!!");
            return;
        }

        int units = scanner.nextInt();

        if (units < 0) {
            System.out.println("Units cannot be negative!!!");
            return;
        }

        double TotalCost = 0;

        if (units <= 100){
            TotalCost = (units * 0.50);
        } else if (units <= 200){
            TotalCost = (100 * 0.50) + ((units - 100) * 0.75);
        } else if (units <= 300) {
            TotalCost = (100 * 0.50) + ((units - 100) * 0.75) + ((units - 200) * 1.20);
        } else {
            TotalCost = (100 * 0.50) + ((units - 100) * 0.75) + ((units - 200) * 1.20) + ((units - 300) * 1.50);
        }

        System.out.println("Total bill cost = " +TotalCost+ " rupees for " +units+ " units.");

    }
}
