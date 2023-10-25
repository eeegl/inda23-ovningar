import java.util.Scanner;

/**
 * En enkel klass för att demonstrera input med en Scanner.
 * 
 * @author Örn Segerstedt
 * @versio 2023-10-11
 */
public class UserInputDemo {

    public static void main(String[] args) {
        // Skapa en scanner som kan läsa input från terminalen
        Scanner scanner = new Scanner(System.in);

        // Förklara vad användaren ska göra
        System.out.println("Welcome to the User Input Demo!");
        System.out.print("Please enter a number: "); // Printa ingen ny rad

        // Läs ett tal från terminalen (pausar tills användaren har skrivit något och tryckt enter)
        int number = scanner.nextInt();
        System.out.println("You entered " + number + ". My favorite number!");

        // Stäng scannern eftersom vi inte ska läsa mer
        scanner.close();
    }
}
