package ex_08_If_Condition;

import java.util.Scanner;

public class Practice_001 {
    public static void main(String[] args) {
        //TriangleClassifier
        /*
        Triangle Classifier:Write a program that classifies a triangle based
        on its side lengths. Given three input values representing the lengths of the sides,
        determine if the triangle is equilateral (all sides are equal),
        isosceles (exactly two sides are equal), or scalene (no sides are equal).
        Use an if-else statement to classify the triangle.
         */


        Scanner scanner = new Scanner(System.in);

        // Input side lengths
        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();
        // Check if the sides form a valid triangle
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 ||
                side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            System.out.println("Invalid triangle: Side lengths must be positive and satisfy the triangle inequality.");
        } else {
            // Classify the triangle
            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral triangle");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }
        }

        scanner.close();
    }
}


