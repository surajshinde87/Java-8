package Stream;

import java.util.Arrays;
import java.util.List;

public class Basic {

    public static void main(String[] args) {

        // 1. Print all even numbers from a list using Stream.

        List<Integer> list = Arrays.asList(1, 2, 4, 5, 7, 8, 12, 18);

        list.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        // 2️. Print all unique elements from a list.
        list.stream()
        .distinct()
        .forEach(System.out::println);

        // 3️. Find the sum of all numbers greater than 10 using reduce().
        int sum = list.stream()
                  .filter( num -> num > 10)
                  .reduce(0, (a, b) -> a + b);

            System.out.println("The sum of numbers greater than 10 is : " + sum);      

        // 4️. From a list of strings, filter all names that start with the letter “S”.
        List<String> names = Arrays.asList("Suraj", "Dhiraj", "Ram", "Swapnil");

        names.stream()
        .filter(name -> name.startsWith("S"))
        .forEach(System.out::println);

        // 5. Square of each number of list
        list.stream()
        .map(n -> n * n)
        .forEach(n -> System.out.print(n + " "));
         
        

    }

}
