package Test;

public class P2_StringConcatenation {
    public static void main(String[] args) {
        /*
        Write a program to demonstrate string concatenation with numbers
        */

        int a = 10;
        int b = 26;
        String name = "Lipi";
        String surname = "Dubbaka";

        System.out.println(a + b + surname + name);
        // here output will be 36DubbakaLipi

        System.out.println(surname + name + a + b);
        // here output will be DubbakaLipi1026

        System.out.println("My name is " + surname + name + "\nMy age is " +b);
    }
}
