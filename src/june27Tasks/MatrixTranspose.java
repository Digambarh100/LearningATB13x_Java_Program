package june27Tasks;

import java.util.Arrays;

public class MatrixTranspose {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 10},{12,13,14,15}};
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
//        printMatrix(newMatrix);
        printMatrix(matrix);

//        the below works for 3X3 matrix only
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < i; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }


        //Below code for works if have same column count for any number of rows
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        printMatrix(newMatrix);
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " | ");
            }
            System.out.printf("%n");
        }
    }
}
