package Fun_Programs.Electrical_Machines;

import java.util.Scanner;

public class Lab_Fun_Turns_Ratio_Transformers {
    public static void main(String[] args) {
        int f = Integer.parseInt(args[0]);
        // frequency taken from Intellij CLI

        System.out.println("Frequency in India = 50 Hz (Standard)!!!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Speed 'N1' in RPM Units:");
        long N1 = scanner.nextLong();

        System.out.println("Enter Flux 'ϕm' in Weber Units:");
        float ϕm = scanner.nextFloat();

        System.out.println("Enter Speed 'N2' in RPM Units:");
        long N2 = scanner.nextLong();

        float E1 = (float) (4.44 * f * N1 * ϕm);
        System.out.println("E1 = " +E1+ " volts");

        float E2 = (float) (4.44 * f * N2 * ϕm);
        System.out.println("E2 = " +E2+ " volts");

        float k = (float) (E1/E2);
        System.out.println("Turns Ratio of Transformer (k) = " +E1/E2);


    }
}
