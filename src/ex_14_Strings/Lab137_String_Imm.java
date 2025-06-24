package ex_14_Strings;

public class Lab137_String_Imm {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2= s1.concat("world"); // Concat, basically add the value or merge the value in the end.
        //The original string s1 remains unchanged, and the new string s2 is assigned the concatenated value.
        // This demonstrates the immutability of strings in Java.
        System.out.println(s1); //hello
        System.out.println(s2); //helloworld
    }
}
