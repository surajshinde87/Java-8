package Stream;

import java.util.Arrays;
import java.util.List;

public class SortNumbers {

    public static void main(String[] args) {
        // Sort a list of numbers in ascending order using Stream API.

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        numbers.stream()
                .sorted()
                .forEach(n -> System.out.print(n + " "));

       // Sort the list in descending order
        System.out.println();
        numbers.stream()
                .sorted((a, b) -> b - a)
                .forEach(n -> System.out.print(n + " "));

    }

}
