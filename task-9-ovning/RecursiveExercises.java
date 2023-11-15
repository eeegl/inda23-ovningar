/**
 * Övningsklass för olika rekursionsproblem.
 * 
 * @author Örn Segerstedt + Chat GPT
 * @version 2023-11-15
 */
public class RecursiveExercises {
    /**
     * Beräknar fakultetfunktionen n! för icke-negativa heltal.
     * 
     * @param n talet som ska beräknas
     * @return n * (n-1) * (n-2) * ... * 2 * 1
     */
    public static int factorial(int n) {
        // Skriv din kod här!
        return -1;
    }

    /**
     * Breräknar summan av alla icke-negativa heltal upp till och med n.
     * 
     * @param n talet som ska beräknas
     * @return n + (n-1) + (n-2) + ... + 2 + 1
     */
    public static int sum(int n) {
        // Skriv din kod här!
        return -1;
    }

    /**
     * Beräknar fibonaccitalet för det icke-netagiva heltalet n.
     * 
     * @param n talet som ska beräknas
     * @return fibonaccitalet för n
     */
    public static int fibonacci(int n) {
        // Skriv din kod här!
        return -1;
    }

    /**
     * Beräknar en positiv heltalspotens.
     * 
     * @param base potensens bas
     * @param exponent potensens exponent
     * @return base^exponent
     */
    public static int power(int base, int exponent) {
        // Skriv din kod här!
        return -1;
    }

    /**
     * Avgör om en sträng är ett palindrom, dvs. om det är likadant baklänges som framlänges.
     * 
     * @param str strängen som ska kontrolleras
     * @return true om det är ett palindrom, false annars
     */
    public static boolean isPalindrome(String str) {
        // Skriv din kod här!
        return false;
    }

    // Fultestning
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Fibonacci of 5: " + fibonacci(5));
        System.out.println("Sum of digits in 10: " + sum(10));
        System.out.println("2 raised to the power of 4: " + power(2, 4));
        System.out.println("Is 'racecar' a palindrome? " + isPalindrome("racecar"));
    }
}
