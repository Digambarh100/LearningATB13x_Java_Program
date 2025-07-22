package Tasks.Task_24th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P15_TriangleIsValid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a in cm:");

        if(!scanner.hasNextFloat()) {
            System.out.println("Enter float only!");
            return;
        }

        float a = scanner.nextFloat();

        System.out.println("Enter side b in cm:");

        if(!scanner.hasNextFloat()) {
            System.out.println("Enter float only!");
            return;
        }

        float b = scanner.nextFloat();

        System.out.println("Enter side c in cm:");

        if(!scanner.hasNextFloat()) {
            System.out.println("Enter float only!");
            return;
        }

        float c = scanner.nextFloat();

        if  ((a + b > c) && (b + c > a) && (c + a > b)) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }

    }
}
