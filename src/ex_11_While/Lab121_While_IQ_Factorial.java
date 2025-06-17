package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ_Factorial {
    public static void main(String[] args) {
        // Factorial Program
        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Welcome to the Factorial Program");
        System.out.print("Enter a number: ");

        // Validate input is an integer
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            scanner.close();
            return;
        }

        // Get the number
        int number = scanner.nextInt();

        // Validate number is non-negative
        if (number < 0) {
            System.out.println("Error: Negative factorial is not allowed.");
            scanner.close();
            return;
        }

        // Calculate factorial using while loop
        long factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }

        // Output the result
        System.out.println("Factorial of " + number + " is: " + factorial);

        // Close scanner
        scanner.close();
    }
}


     /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\nEnter the number! :  ");
        if(!scanner.hasNextInt()){
            System.out.println("Enter only Int Data type value");
            return;
        }

        int number = scanner.nextInt();

        long factorial = 1;



        if(number < 0){
            System.out.println("Negative Factorial is not allowed!");
            return;
        }


        if(number <=0){
            System.out.println(factorial);
        }else{
            // Calculate the factorial
            for (int i = 1; i <= number ; i++) {
                factorial = factorial*i;
            }
        }

        System.out.println("Factorial is -> " + factorial); // Print the calculated factorial



    }
}
*/