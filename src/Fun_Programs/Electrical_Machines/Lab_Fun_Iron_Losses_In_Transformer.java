package Fun_Programs.Electrical_Machines;

import java.util.Scanner;

public class Lab_Fun_Iron_Losses_In_Transformer {
    public static void main(String[] args) {

        int f = Integer.parseInt(args[0]);
        // Taking frequency from Intellij CLI
        System.out.println("Frequency in India is 50 Hz (Standard)!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Steinmetz hysteresis coefficient (kh) value:");
        float kh = scanner.nextFloat();

        System.out.println("Enter base value of Maximum flux density:");
        float base = scanner.nextFloat();
        float exponent = 1.6F;

        // Using Math.pow() to calculate power
        float Bmax = (float) Math.pow(base, exponent);
        System.out.println("Maximum flux density = " + base + " to the power of " + exponent + " = " + Bmax+ " Wb/m^2");

        System.out.println("Enter Volume of the magnetic material value in m^3:");
        float V = scanner.nextFloat();

        float Ph = (kh * Bmax * f * V);
        System.out.println("Hysteresis loss (Ph) in a transformer is: " + Ph + " in Watts");
        // Hysteresis losses

        System.out.println("Enter Eddy Current coefficient (ke) value:");
        float ke = scanner.nextFloat();

        System.out.println("Enter Thickness of lamination (t) value in m:");
        float t = scanner.nextFloat();

        float a = 2 * (Bmax * f * t);
        float Pe = (ke * a * V);
        System.out.println("Hysteresis loss (Ph) in a transformer is: " + Pe + " in Watts");
        //Eddy Current Losses

        System.out.println("Hysteresis Losses: " +Ph+ " Watts");
        System.out.println("Eddy Current Losses: " +Pe+ " Watts");
        // Hysteresis & Eddy Current losses in Watts

        System.out.println("Hysteresis Losses: " +(Ph/1000)+ " Kilo - Watts");
        System.out.println("Eddy Current Losses: " +(Pe/1000)+ " Kilo - Watts");
        //Hysteresis & Eddy Current losses in Kilo - Watts

        float Pi = (Ph + Pe);
        System.out.println("Iron Losses in Transformer: " +Pi+ " Watts");
        // Iron Losses in Watts

        System.out.println("Iron Losses in Transformer: " +(Pi/1000)+ " Kilo - Watts");
        //Iron Losses in Kilo - Watts


    }
}
