package june25thTask;

import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
        System.out.println("Enter salary");
        Scanner scanner=new Scanner(System.in);
        int salary=scanner.nextInt();
        System.out.println("Enter year of joining");
        int yearOfJoining=scanner.nextInt();
        scanner.close();
        if(2025-yearOfJoining>6){
            System.out.printf("Bonus salary is 15%% : %10.2f %n",salary*0.15);
            return;
        }
        if(2025-yearOfJoining>4){
            System.out.printf("Bonus salary is 10%% : %10.2f %n",salary*0.10);
            return;
        }
        if(2025-yearOfJoining>1){
            System.out.printf("Bonus salary is 5%% : %10.2f %n",salary*0.05);
            return;
        }

        System.out.println("No bonus");
    }
}
