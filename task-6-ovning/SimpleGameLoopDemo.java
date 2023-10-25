import java.util.Scanner;

/**
 * En enkel klass för att demonstrera en spelloop.
 * 
 * @author Örn Segerstedt
 * @versio 2023-10-11
 */
public class SimpleGameLoopDemo {

    public static void main(String[] args) {
        // Skapa scannern
        Scanner scanner = new Scanner(System.in);

        // Skapa en konstant för ordet som ska gissas (final betyder att värdet inte kan ändras)
        final String SECRET_WORD = "JAVA";
        boolean hasGuessedCorrectly = false;

        // Förklara vad användaren ska göra
        System.out.println("Welcome to the Word Guessing Game!");
        System.out.println("Try to guess the secret word.");

        // Spelloop: kör så länge användaren inte har gissat rätt
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            // Läs ett ord och gör alla bokstäver och gör alla bokstäver till versaler (stora bokstäver)
            // Detta gör att till exempel "Java", "jaVA", "java" alla blir "JAVA"
            String userGuess = scanner.nextLine().toUpperCase(); 

            // Kolla om användaren har gissat rätt
            if (userGuess.equals(SECRET_WORD)) { // För att jämföra objekt använder vi equals() istället för ==
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the secret word.");
            } else {
                System.out.println("Wrong guess! Try again.");
            }
        }

        // Stäng scannern när vi är klara med inläsningen
        scanner.close();
    }
}
