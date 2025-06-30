package june25thTask;

import java.util.Scanner;

public class ElectricityBillCalculation {

    public static void main(String[] args) {
        System.out.println("Enter the number of units");
        int units = new Scanner(System.in).nextInt();
        double cost = 0;
//        int loop = 0;
//        while (units > 0) {
//            if (loop == 0) {
//                cost += (100 * 0.5);
//                units -= 100;
//                loop++;
//                continue;
//            }
//            if (loop == 1) {
//                cost += (100 * 0.75);
//                units -= 100;
//                loop++;
//                continue;
//            }
//            if (loop == 2) {
//                cost += (100 * 1.2);
//                units -= 100;
//                loop++;
//                continue;
//            }
//            if (loop == 3) {
//                cost += (units * 1.5);
//                break;
//            }
//        }

        if (units > 300) {
            units -= 300;
            cost = (100 * 0.5) + (100 * 0.75) + (100 * 1.2) + (units * 1.5);
        } else if (units > 200) {
            units -= 200;
            cost = (100 * 0.5) + (100 * 0.75) + (units * 1.2);
        } else if (units > 100) {
            units -= 100;
            cost = (100 * 0.5) + (units * 0.75);
        } else {
            cost = units * 0.5;
        }


        System.out.println(cost);
    }
}
