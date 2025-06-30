package june23rdTask;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Please enter a valid integer");
        Scanner scanner=new Scanner(System.in);
        int input;
        if(scanner.hasNextInt()){
            input=scanner.nextInt();
        }
        else{
            System.out.println("Please enter a valid integer");
            return;
        }
        String type=input%2==0?"Even":"odd";
        System.out.println(type);
    }
}
