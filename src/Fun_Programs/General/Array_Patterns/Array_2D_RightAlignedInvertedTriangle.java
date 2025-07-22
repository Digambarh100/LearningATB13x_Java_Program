package Fun_Programs.General.Array_Patterns;

public class Array_2D_RightAlignedInvertedTriangle {
    public static void main(String[] args) {

        InvertedRightTriangle i1 = new InvertedRightTriangle();
        i1.InvRigTri1();
        System.out.println();
        i1.InvRigTri2();
    }
}

class InvertedRightTriangle {

    void InvRigTri1() {

        int n = 5;

        for (int i = n; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // two spaces for alignment
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    void InvRigTri2() {

        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows; j++) {
                if (j <= rows - i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}

