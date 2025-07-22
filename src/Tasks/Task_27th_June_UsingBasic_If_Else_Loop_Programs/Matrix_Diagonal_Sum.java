package Tasks.Task_27th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter 9 numbers for a 3x3 matrix:");

        // Input 3x3 matrix values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < 3; i++) {
            primarySum += matrix[i][i];
            secondarySum += matrix[i][2 - i];
        }

        int total = primarySum + secondarySum - matrix[1][1]; // avoid double-counting center

        System.out.println("Primary Diagonal Sum: " + primarySum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
        System.out.println("Total Diagonal Sum: " + total);
    }
}
