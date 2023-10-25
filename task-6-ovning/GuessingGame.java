import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Higher or Lower game!");
        System.out.println("I've selected a number between 1 and 100. Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please guess a number between 1 and 100.");
            } else if (userGuess < numberToGuess) {
                System.out.println("The number is higher! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("The number is lower! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}
