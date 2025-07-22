package Fun_Programs.General.Array_Patterns;

public class Array_2D_Diamond_Patterns {
    public static void main(String[] args) {

        DiamondPattern d1 = new DiamondPattern();
        d1.diamond();
    }
}

class DiamondPattern {

    void diamond () {

        int n = 6; // middle row has 2*rows - 1 = 11 stars

        // Upper Half (including middle row)
        for (int i = 1; i < n; i++) { // Here i < n to make the pointy edges on sides
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) { // here j < n to make the pointy edges on top
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower Half (exclude middle row to avoid duplicate)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) { // here j < n to make the pointy edges on below
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}