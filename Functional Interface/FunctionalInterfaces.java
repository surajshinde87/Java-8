import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaces {
    public static void main(String[] args) {

          // 1. Predicate --> Functional interface (Boolean valued function)
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(8));
        Predicate<String> isStartWith = x -> x.toLowerCase().startsWith("a");
        // System.out.println(isStartWith.test("Suraj"));
        Predicate<String> isEndsWith = x -> x.toLowerCase().endsWith("e");
        Predicate<String> and = isStartWith.and(isEndsWith);
        System.out.println(and.test("Apple"));

        // 2. Function --> work for you takes input, returns output
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        // System.out.println(doubleIt.apply(5));
        
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(10));
        System.out.println(tripleIt.andThen(doubleIt).apply(5));  // same
        System.out.println(doubleIt.andThen(tripleIt).apply(5));  // same

        Function<Integer, Integer> identity = Function.identity();
        Integer res  = identity.apply(10);
        System.out.println(res);

        // 3. Consumer --> takes input, no return
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(40);

        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
              System.out.println(i);
            }
        };

    printList.accept(list);

    // 4. Supplier --> no input, returns value
     Supplier<String> giveHello = () -> "Hello World";
     System.out.println(giveHello.get());

     // combined example
     Predicate<Integer> predicate = x -> x % 2 != 0;
     Function<Integer, Integer> function = x -> x * x;
     Consumer<Integer> consumer2 = x -> System.out.println(x);
     Supplier<Integer> supplier = () -> 101;

     if (predicate.test(supplier.get())) {
        consumer2.accept(function.apply(supplier.get()));
     }

     // BiPredicate, BiConsumer, BiFunction
     BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
     System.out.println(isSumEven.test(5, 15));
     BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
        System.out.println("x : " + x + " y : " + y);
     };
     biConsumer.accept(10, 5);

     BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
     System.out.println(biFunction.apply("a", "bc"));

     // UnaryOperator, BinaryOperator
     UnaryOperator<Integer> a = x -> 2 * x;
     BinaryOperator<Integer> b = (x, y) -> x + y;


    }
}
