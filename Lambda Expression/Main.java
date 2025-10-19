
public class Main {

    public static void main(String[] args) {

        // Using a lambda expression to implement a functional interface
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Additions of a + b : " + addition.operate(10, 5));

        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("Substraction of a - b  : " + subtraction.operate(10, 5));

        MathOperation multiply = (a, b) -> a * b;
        System.out.println("Multiplication of a * b : " + multiply.operate(10, 5));

        MathOperation divide = (a, b) -> a / b;
        System.out.println("Division of a / b  : " + divide.operate(10, 5));

    }

}
