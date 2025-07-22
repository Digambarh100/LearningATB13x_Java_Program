package Fun_Programs.General.Array_Patterns;

public class Array_2D_Pyramid_Patterns {
    public static void main(String[] args) {
        RightAlignedPyramid r1 = new RightAlignedPyramid();
        r1.rightPyramid();

        InvertedRightAlignedPyramid r2 = new InvertedRightAlignedPyramid();
        r2.invertedRightPyramid();
    }
}

class RightAlignedPyramid {

    void rightPyramid() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class InvertedRightAlignedPyramid {

    void invertedRightPyramid () {

        System.out.println();

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
