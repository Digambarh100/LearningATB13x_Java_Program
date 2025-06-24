package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name = "Pramod"; // SCP
        name.toUpperCase();
        //String is the immutable, once string object is created, it cannot change but new string object is created
        // name = name.toUpperCase(); // PRAMOD
        System.out.println(name); // Pramod  - no change
    }
}
