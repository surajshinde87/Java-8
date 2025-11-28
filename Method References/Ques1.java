// Use a static method reference for:
// List<Integer> nums = List.of(2, 4, 6, 8);
// Map each number → square → print output.

import java.util.List;

public class Ques1 {
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 4, 6, 8);
        nums.stream()
            .map(Ques1::square)
            .forEach(System.out::println);
    }
    
}
