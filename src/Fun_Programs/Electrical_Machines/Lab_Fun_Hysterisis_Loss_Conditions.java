package Fun_Programs.Electrical_Machines;

import java.util.Scanner;

public class Lab_Fun_Hysterisis_Loss_Conditions {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        int f = 50;
        System.out.println("Frequency in India (f): " +f+ "Hz");
        // frequency taken from user from console using scanner class

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Voltage1 (V) value in Volts:");
        float V = scanner.nextFloat();
        // Voltage1 in Volts (V)

        System.out.println("Enter Steinmetz hysteresis coefficient (kh) value:");
        float kh = scanner.nextFloat();
        // Steinmetz hysteresis coefficient (kh)

        System.out.println("Enter Volume of the magnetic material (v) value in m^3:");
        float v = scanner.nextFloat();
        // Volume of core (v)

        System.out.println("Enter base value of Maximum flux density:");
        float base = scanner.nextFloat();
        float exponent = 1.6F;
        // Using Math.pow() to calculate power
        float Bmax = (float) Math.pow(base, exponent);
        System.out.println("Maximum flux density = " + base + " to the power of " + exponent + " = " + Bmax+ " Wb/m^2");
        // Flux Density (Bmax)

        System.out.println("Enter Eddy Current coefficient (ke) value:");
        float ke = scanner.nextFloat();

        System.out.println("Enter Thickness of lamination (t) value in m:");
        float t = scanner.nextFloat();

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        float Ph = (kh * Bmax * f * V);
        System.out.println("Hysteresis loss in a transformer (Ph = kh * Bmax^1.6 * f * v): " + Ph + " in Watts");
        // Hysteresis losses

        float a = 2 * (Bmax * f * t);
        float Pe = (ke * a * V);
        System.out.println("Hysteresis loss in a transformer (Pe = ke * Bmax^2 * f^2 * t^2 * v): " + Pe + " in Watts");
        //Eddy Current Losses

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        // float A = 0.54F;
        // float B = 0.76F;

        System.out.println("Enter Hysterisis loss constant (A):");
        float A = scanner.nextFloat();

        System.out.println("Enter Eddy Current loss constant (B):");
        float B = scanner.nextFloat();

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        // Case: 01 - V/f = constant
        System.out.println("Case: 01 - V/f = constant then Iron losses (Wi1 = [A * f] + [B * f^2]):");
        float Wh1 = A * f;
        float We1 = B * f * f;
        float Wi1 = (Wh1 + We1);
        System.out.println("Hysterisis Losses (Wh1):" +Wh1);
        System.out.println("Eddy Current Losses (We1):" +We1);
        System.out.println("Iron losses (Wi):" +Wi1);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        // Case: 02 - V/f != 0 && Bmax = constant
        System.out.println("Case:02 - V/f = constant && Bmax = constant then Iron losses (Wi2 = [A * V^1.6 * f^-0.6] + [B * V^2]):");
        float exponent1 = 1.6F;
        // Using Math.pow() to calculate power
        float v1 = (float) Math.pow(V, exponent1);
        System.out.println("Voltage = " + V + " to the power of " + exponent1 + " = " + v1);

        float exponent2 = -0.6F;
        // Using Math.pow() to calculate power
        float f1 = (float) Math.pow(f, exponent2);
        System.out.println("frequency = " + f + " to the power of " + exponent2 + " = " + f1);

        float Wh2 = A * v1 * f1;
        // equation Wh2 = A * V ^ 1.6 * f ^ - 0.6
        float We2 = B * V * V;
        float Wi2 = (Wh2 + We2);
        System.out.println("Hysterisis Losses (Wh2):" +Wh2);
        System.out.println("Eddy Current Losses (We2):" +We2);
        System.out.println("Iron losses (Wi2):" +Wi2);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        // Case: 03 - V/f != 0 && f = constant
        System.out.println("Case: 03 - V/f = constant then Iron losses (Wi3 = [A + B] * V^2):");
        float exponent3 = 2F;
        // Using Math.pow() to calculate power
        float v3 = (float) Math.pow(V, exponent3);
        System.out.println("volume of core = " + V + " to the power of " + exponent3 + " = " + v3);

        float Wh3 = A * v3;
        float We3 = B * v3;
        float Wi3 = (A + B) * v3;
        System.out.println("Hysterisis Losses (Wh3):" +Wh3);
        System.out.println("Eddy Current Losses (We3):" +We3);
        System.out.println("Iron losses (Wi3):" +Wi3);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        // Case: 04 - V/f != 0 && V = constant
        System.out.println("Case: 04 - V/f = constant then Iron losses (Wi3 = [A * f^-0.6):");
        float exponent4 = -0.6F;
        // Using Math.pow() to calculate power
        float v4 = (float) Math.pow(f, exponent4);
        System.out.println("volume of core = " +f + " to the power of " + exponent4 + " = " + v4);

        float Wh4 = A * v4;
        float Wi4 = Wh4;
        System.out.println("Hysterisis Losses (Wh4):" + Wh4);
        System.out.println("Eddy Current Losses (We4) = constant");
        System.out.println("Iron losses (Wi3):" +Wi4);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
    }
}
