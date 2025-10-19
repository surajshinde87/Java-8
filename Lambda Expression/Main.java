import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        // Using a lambda expression to implement a functional interface
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Additions of a + b : " + addition.operate(10, 5));
        
        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("Substraction of a - b  : " + subtraction.operate(10, 5));
        

        // Predicate --> Functional interface (Boolean valued function)
      Predicate<Integer> isEven = x -> x % 2 == 0;
    //   System.out.println(isEven.test(8));

      Predicate<String> isStartWith = x -> x.toLowerCase().startsWith("a");
    //   System.out.println(isStartWith.test("Suraj"));

      Predicate<String> isEndsWith = x -> x.toLowerCase().endsWith("e");
      Predicate<String> and = isStartWith.and(isEndsWith);

       System.out.println(and.test("Apple"));


    }
    
}

public interface MathOperation {
 int operate(int a, int b);    
}