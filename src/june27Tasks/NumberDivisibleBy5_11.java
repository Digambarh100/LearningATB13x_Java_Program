package june27Tasks;

import java.util.Scanner;

public class NumberDivisibleBy5_11 {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        int number=new Scanner(System.in).nextInt();
        if(number%5==0 && number%11==0){
            System.out.println("Number is divisible by 5 an 11");
        }
        else{
            System.out.println("Number is not divisible by 5 an 11");
        }
    }
}
