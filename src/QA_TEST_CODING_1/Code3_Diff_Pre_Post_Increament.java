package QA_TEST_CODING_1;

public class Code3_Diff_Pre_Post_Increament {
    public static void main(String[] args) {
        int n = 15;
        //Post increment ----> n++
        System.out.println("Post-increment = n++ ");
        System.out.println("value of n before increment: " + n); //15
        System.out.println("Returned value: " + n++); //15
        System.out.println("Value after increment: " + n); //16

        System.out.println("===============================");
        n = 15;
        //Pre increment ----> ++n
        System.out.println("Pre-increment = ++n ");
        System.out.println("Value before increment: " + n); //15
        System.out.println("pre condition value: " + (++n)); // 16
        System.out.println("Value after increment: " + n); //16
    }

}

