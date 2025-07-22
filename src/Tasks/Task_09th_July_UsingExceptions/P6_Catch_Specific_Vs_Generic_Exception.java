package Tasks.Task_09th_July_UsingExceptions;

public class P6_Catch_Specific_Vs_Generic_Exception {
    public static void main(String[] args) {
        System.out.println("Using generic catch (Exception):");
        CatchException a = new CatchException();
        a.Ex();

        System.out.println("\nUsing specific catch (NullPointerException):");
        CatchNullPointerException b = new CatchNullPointerException();
        b.Nu();
    }
}

class CatchException {

    void Ex () {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e){
            System.out.println("Caught (generic): " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}

class CatchNullPointerException {

   void Nu () {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e){
            System.out.println("Caught (specific): " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
