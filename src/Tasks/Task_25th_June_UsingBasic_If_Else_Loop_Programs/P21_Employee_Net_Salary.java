package Tasks.Task_25th_June_UsingBasic_If_Else_Loop_Programs;

import java.util.Scanner;

public class P21_Employee_Net_Salary {
    public static void main(String[] args) {

        // Takes user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your basic pay:");

        // checking if input entered is only float datatype
        if(!scanner.hasNextFloat()) {
            System.out.println("Invalid! Enter only numeric value!!!");
            return;
        }

        float basicpay = scanner.nextFloat();

        // checking if input entered is only positive number
        if (basicpay <= 0) {
            System.out.println("Basic Pay cannot be zero or negative!!!");
            return;
        }

        // Logic for each salary components
        float da = (basicpay * 0.10f);
        float hra = (basicpay * 0.20f);
        float grosssalary = (basicpay + da + hra);
        float tax = (grosssalary * 0.10f);
        float netsalary = grosssalary - tax;

        // printing out all salary componenets
        System.out.println("---------------- Your Salary components are as follows ----------------");
        System.out.println("Basic Salary: " +basicpay+ " in rupees.");
        System.out.println("Dearness Allowance (DA - 10% of Basic Salary): " +da+ " in rupees.");
        System.out.println("House Rent Allowance (HRA - 20% of Basic Salary): " +hra+ " in rupees.");
        System.out.println("Gross Salary = (Basic pay + DA + HRA): " +grosssalary+ " in rupees.");
        System.out.println("Tax dedication (10% of Gross Salary): " +tax+ " in rupees.");
        System.out.println("Net Salary = (Gross Salary - Tax): " +netsalary+ " in rupees.");

        scanner.close();
    }
}
