package Fun_Programs.General.Array_Patterns;

public class Array_2D_Triangle_Patterns {
    public static void main(String[] args) {

        LeftAligned l1 = new LeftAligned();
        l1.left();

        LeftAlignedInverted l2 = new LeftAlignedInverted();
        l2.leftInverted();

        RightAligned r1 = new RightAligned();
        r1.right();

        RightAlignedInverted r2 = new RightAlignedInverted();
        r2.rightInverted();

    }
}

class LeftAligned {

    void left() {

        System.out.println();

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class LeftAlignedInverted {

    void leftInverted() {

        System.out.println();

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class RightAligned {

    void right() {

        System.out.println();

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

class RightAlignedInverted {

    void rightInverted() {

        System.out.println();

        int n = 5;
        for (int i = n; i >= 1; i--) {
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
