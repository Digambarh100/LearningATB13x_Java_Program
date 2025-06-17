package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {

        // Initialize random number generator and game variables
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100

        int attempts = 0;

        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Display game instructions
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        // Main game loop
        while (true) {
            // Validate input
            if (!scanner.hasNextInt()) {
                System.out.println("Error: Please enter a valid integer.");
                scanner.next(); // Clear invalid input
                continue;
            }

            // Get user guess
            int guess = scanner.nextInt();
            attempts++;

            // Check guess and provide feedback
            if (guess < numberToGuess) {
                System.out.println("Too low, try again:");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again:");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempt(s)");
                break;
            }
        }

        // Close scanner
        scanner.close();
    }
}


//
//
//        // Guess a number between 1 and 100
//        // Random =>  1 to 100
//        Random random = new Random();
//        int numberToGuess = random.nextInt(100)+1; // 0 to 100
//
////        System.out.println(numberToGuess);
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number!");
//
//        int guess;
//        int attempts = 0;
//
//        while (true){
//            guess = scanner.nextInt();
//            attempts++;
//
//            if(guess < numberToGuess){
//                System.out.println("Too low, try again");
//            } else if( guess > numberToGuess){
//                System.out.println("Too high, try again");
//            }else{
//                System.out.println("Correct! You guessed it in " + attempts + " attempts");
//                break;
//            }
//
//
//
//
//        }
//
//
//
//
//    }
//}
