// Create a functional interface Calculator with a method int calc(int a, int b)
// Write lambdas for:
// addition
// subtraction
// multiplication
// division

@FunctionalInterface
interface Calculator {
    int calc(int a, int b);
}

public class CalculatorExample {

    public static void main(String[] args) {
        // Lambda for addition
        Calculator addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.calc(10, 5));

        // Lambda for subtraction
        Calculator subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.calc(10, 5));

        // Lambda for multiplication
        Calculator multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.calc(10, 5));

        // Lambda for division
        Calculator division = (a, b) -> a / b;
        System.out.println("Division: " + division.calc(10, 5));
    }
    
}
