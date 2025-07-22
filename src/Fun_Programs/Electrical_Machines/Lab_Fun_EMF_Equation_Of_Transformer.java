package Fun_Programs.Electrical_Machines;

import java.util.Scanner;

public class Lab_Fun_EMF_Equation_Of_Transformer {
    public static void main(String[] args) {
        int f = Integer.parseInt(args[0]);
        // frequency taken from Intellij CLI

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Speed 'N' in RPM Units:");
        long N = scanner.nextLong();

        System.out.println("Enter Flux 'ϕm' in Weber Units:");
        float ϕm = scanner.nextFloat();

        float E = (float) (4.44 * f * N * ϕm);
        System.out.println("E = " +E+ " volts");

    }
}
