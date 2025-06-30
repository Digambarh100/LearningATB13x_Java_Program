package june23rdTask;

import java.util.Scanner;

public class CheckNumberPositiveOrNegative {
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
        if(input==0){
            System.out.println("Please enter a valid integer other than zero");
            return;
        }
        String output=input>0?"Positive":"Negative";
        System.out.println(output);
    }

}
