package Tasks.Task_27th_June_UsingBasic_If_Else_Loop_Programs;

public class SimplePyramid {
    public static void main(String[] args) {
        int rows = 5;  

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
