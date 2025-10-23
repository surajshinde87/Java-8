package Stream;

import java.util.Optional;
import java.util.Arrays;
import java.util.List;

public class FirstEven {
    
    public static void main(String[] args) {
        // find the first even number from a list of integers using Stream API.
        List<Integer> numbers = Arrays.asList(3, 7, 2, 9, 4, 6);

        Optional<Integer> firstEven = numbers.stream()
                                        .filter(n -> n % 2 == 0)
                                        .findFirst();
        if (firstEven.isPresent()) {
            System.out.println("First even number: " + firstEven.get());
        } else {
            System.out.println("No even number found");
        }                              


    }

}
