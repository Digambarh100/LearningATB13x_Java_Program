package Test;

import java.util.Scanner;

public class P10_SimpleCalculator_UsingSwitchStatement {
    public static void main(String[] args) {
        /*
        Write a program to create a simple calculator using switch statement
        */

        //Taking input
        Scanner scanner = new Scanner(System.in);
        System.out.println("What Arithematic Operation do you want to perform: \nAddition = 1\nSubtraction = 2\nMultiplcation = 3\nDivision = 4\nModulus = 5\nPower = 6\nexample: 1,2,3,4,5,6");
        int Operation = scanner.nextInt();

        System.out.println("Enter value of (a):");
        int a = scanner.nextInt();

        System.out.println("Enter value of (b):");
        int b = scanner.nextInt();


        switch (Operation) {
            case 1: {
                double result = (a + b);
                System.out.println("Addition of (a+b) = " + a + "+" + b + "=" + result);
                break;
            }
            case 2: {
                double result = (a - b);
                System.out.println("Subtraction of (a-b) = " + a + "-" + b + "=" + result);
                break;
            }
            case 3: {
                double result = (a * b);
                System.out.println("Multiplication of (a*b) = " + a + "*" + b + "=" + result);
                break;
            }
            case 4: {
                double result = (a / b);
                System.out.println("Divison of (a/b) = " + a + "/" + b + "=" + result);
                break;
            }
            case 5: {
                double result = (a % b);
                System.out.println("Modulus of (a%b) = " + a + "%" + b + "=" + result);
                break;
            }
            case 6: {
                double result = Math.pow(a, b);
                System.out.println("Power = " + a + "^" + b + "=" + result);
                break;
            }

        }
    }
}
