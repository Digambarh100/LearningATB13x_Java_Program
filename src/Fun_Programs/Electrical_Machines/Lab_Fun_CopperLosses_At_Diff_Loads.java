package Fun_Programs.Electrical_Machines;

import java.util.Scanner;

public class Lab_Fun_CopperLosses_At_Diff_Loads {
    public static void main(String[] args) {
        System.out.println("Finding Copper losses at different loads i.e., (1/4, 1/2, 3/4 & 7/8) loads:");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numerator of load:");
        int a = scanner.nextInt();

        System.out.println("Enter denominator of load:");
        int b = scanner.nextInt();

        float x = ((float) a / b);
        System.out.println("Load (x): " + x);

        System.out.println("Enter the full load cu losses in Watts (W1): //ex:2500");
        float W1 = scanner.nextFloat();

        //float W1 = 4900;
        //System.out.println("Copper loss at full load (W1): " + W1);

        // Calculate copper loss at given load
        float Wcu = W1 * (x * x);
        System.out.println("Copper Loss at " + x + " load = (Wcu full load * x^2) = " + Wcu+ " in Watts");

        // Optional: validate if x matches expected fractions
        if (x == 0.25f) {
            System.out.println("Load is 1/4" );
        } else if (x == 0.5f) {
            System.out.println("Load is 1/2");
        } else if (x == 0.75f) {
            System.out.println("Load is 3/4");
        } else if (x == 0.875f) {
            System.out.println("Load is 7/8");
        } else {
            System.out.println("Note: The entered load fraction is custom.");
        }

        }

    }
