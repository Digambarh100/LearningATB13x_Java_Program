package june27Tasks;

public class CalculateMatrixDiagonalSum {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5},
                {4, 5, 6, 7, 8},
                {7, 8, 9, 10, 11},
                {12,13,14,15,16},
                {1,1,1,1,1}};
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i==j){
                    System.out.printf("value of i:%d value ofj:%d %n",i,j);
                    System.out.printf("matrix value:%d%n",matrix[i][j]);
                    sum+=matrix[i][j];
                }
            }
        }
//        printMatrix(matrix);
        System.out.printf("sum=%d",sum);
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
