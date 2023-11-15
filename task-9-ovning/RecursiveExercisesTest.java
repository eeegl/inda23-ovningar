import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursiveExercisesTest {

    // Tests for factorial method
    @Test
    public void factorialIsOneForZero() {
        assertEquals(1, RecursiveExercises.factorial(0));
    }

    @Test
    public void factorialIsOneForOne() {
        assertEquals(1, RecursiveExercises.factorial(1));
    }

    @Test
    public void factorialCalculatesCorrectlyForPositiveNumbers() {
        assertEquals(120, RecursiveExercises.factorial(5));
    }

    // Tests for sum method
    @Test
    public void sumIsZeroForZero() {
        assertEquals(0, RecursiveExercises.sum(0));
    }

    @Test
    public void sumCalculatesCorrectlyForPositiveNumber() {
        assertEquals(55, RecursiveExercises.sum(10));
    }

    // Tests for fibonacci method
    @Test
    public void fibonacciIsZeroForZero() {
        assertEquals(0, RecursiveExercises.fibonacci(0));
    }

    @Test
    public void fibonacciIsOneForOne() {
        assertEquals(1, RecursiveExercises.fibonacci(1));
    }

    @Test
    public void fibonacciCalculatesCorrectlyForPositiveNumber() {
        assertEquals(5, RecursiveExercises.fibonacci(5));
    }

    // Tests for power method
    @Test
    public void powerIsOneForZeroExponent() {
        assertEquals(1, RecursiveExercises.power(2, 0));
    }

    @Test
    public void powerCalculatesCorrectlyForPositiveExponent() {
        assertEquals(16, RecursiveExercises.power(2, 4));
    }

    // Tests for isPalindrome method
    @Test
    public void isPalindromeReturnsTrueForEmptyString() {
        assertEquals(true, RecursiveExercises.isPalindrome(""));
    }

    @Test
    public void isPalindromeReturnsTrueForPalindrome() {
        assertEquals(true, RecursiveExercises.isPalindrome("racecar"));
    }

    @Test
    public void isPalindromeReturnsFalseForNonPalindrome() {
        assertEquals(false, RecursiveExercises.isPalindrome("hello"));
    }
}
