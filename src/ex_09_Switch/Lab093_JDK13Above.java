package ex_09_Switch;

public class Lab093_JDK13Above {
    public static void main(String[] args) {
        // in JDK > 13
        //  No need of break keyword
        // one line supported.
        int itemCode = 002;
        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("004");
            default -> System.out.println("Default");

        }
    }
}
