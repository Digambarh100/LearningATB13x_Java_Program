package Fun_Programs.General.Array_Patterns;

public class Array_2D_RightAlignedTriangle {
    public static void main(String[] args) {
        RightTriangle r1 = new RightTriangle();
        r1.rightTriangle1();

        System.out.println();

        r1.rightTriangle2();
    }
}

class RightTriangle {

    void rightTriangle1() {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  "); // double space
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // star with space
            }
            System.out.println();
        }
    }

    void rightTriangle2() {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}