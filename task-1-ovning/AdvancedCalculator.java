/**
 * The AdvancedCalculator class provides methods for advanced mathematical operations.
 * It includes the ability to calculate the power of a number and the factorial of a non-negative integer.
 */
public class AdvancedCalculator {
    public int power(int base, int exponent) {
        // Your code here
    }

    public int factorial(int n) {
        // Your code here
    }

    public static void main(String[] args) {
        AdvancedCalculator calculator = new AdvancedCalculator();
        
        System.out.println("Testing AdvancedCalculator methods:");

        int base = 2;
        int exponent = 3;
        System.out.println(base + " ^ " + exponent + " = " + calculator.power(base, exponent));
        
        int factorialNumber = 5;
        System.out.println("Factorial of " + factorialNumber + " = " + calculator.factorial(factorialNumber));
    }
}
