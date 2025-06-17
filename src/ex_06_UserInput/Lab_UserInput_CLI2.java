package ex_06_UserInput;

public class Lab_UserInput_CLI2 {
    public static void main(String[] args) {
        System.out.println(args[0]); // java.lang.ArrayIndexOutOfBoundsException
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[10]); // java.lang.ArrayIndexOutOfBoundsException
    }
}
