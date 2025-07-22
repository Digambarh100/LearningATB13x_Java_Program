package Fun_Programs.General;

import java.util.Random;
import java.util.Scanner;

public class Lab_Fun_Rock_Paper_Scissors_Game {
    public static void main(String[] args) {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Player input
            System.out.print("Enter player choice (Rock, Paper, Scissors) or 'exit' to quit: ");
            String playerChoice = scanner.next();

            if (playerChoice.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Normalize input
            playerChoice = playerChoice.substring(0, 1).toUpperCase() + playerChoice.substring(1).toLowerCase();

            // Computer choice
            String randomChoice = choices[random.nextInt(choices.length)];
            System.out.println("Computer chose: " + randomChoice);

            // Determine result
            if (playerChoice.equals(randomChoice)) {
                System.out.println("Draw!");
            } else if (playerChoice.equals("Rock") && randomChoice.equals("Scissors")
                    || playerChoice.equals("Paper") && randomChoice.equals("Rock")
                    || playerChoice.equals("Scissors") && randomChoice.equals("Paper")) {
                System.out.println(playerChoice + " beats " + randomChoice + ". You win!");
            } else if (playerChoice.equals("Rock") && randomChoice.equals("Paper")
                    || playerChoice.equals("Paper") && randomChoice.equals("Scissors")
                    || playerChoice.equals("Scissors") && randomChoice.equals("Rock")) {
                System.out.println(randomChoice + " beats " + playerChoice + ". Computer wins!");
            } else {
                System.out.println("Invalid input! Please enter Rock, Paper, or Scissors.");
            }

            System.out.println();
        }

    }
}
