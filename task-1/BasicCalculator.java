/**
 * The BasicCalculator class provides basic arithmetic operations such as addition,
 * subtraction, multiplication, and division on integer values.
 */
public class BasicCalculator {
    public int add(int a, int b) {
        // Your code here
    }
    
    public int subtract(int a, int b) {
        // Your code here
    }
    
    public int multiply(int a, int b) {
        // Your code here
    }
    
    public int divide(int a, int b) {
        // Your code here
    }

    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();

        int num1 = 10;
        int num2 = 5;

        System.out.println("Testing BasicCalculator methods:");

        int sum = calculator.add(num1, num2);
        System.out.println("Sum: " + sum);

        int difference = calculator.subtract(num1, num2);
        System.out.println("Difference: " + difference);

        int product = calculator.multiply(num1, num2);
        System.out.println("Product: " + product);

        int quotient = calculator.divide(num1, num2);
        System.out.println("Quotient: " + quotient);
    }
}