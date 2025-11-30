// List<Integer> nums = Arrays.asList(10, 5, 20, 15, 30, 25);
// Using streams, find:
// all even numbers
// numbers greater than 15
// sum of all numbers
// max number
// min number

import java.util.Arrays;
import java.util.List;

public class Ques1 {
public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(10, 5, 20, 15, 30, 25);

    // all even numbers
    List<Integer> evenNumbers = nums.stream()
                                    .filter(n -> n % 2 == 0)
                                    .toList();
    System.out.println("Even Numbers: " + evenNumbers);

    // numbers greater than 15
    List<Integer> greaterThan15 = nums.stream()
                                        .filter(n -> n > 15)
                                        .toList();
    System.out.println("Numbers greater than 15: " + greaterThan15);

    // sum of all numbers
    int sum = nums.stream()
                  .mapToInt(Integer::intValue)
                  .sum();

    System.out.println("Sum of all numbers: " + sum);
    
    // max number
    int max = nums.stream()
                    .mapToInt(Integer::intValue)
                    .max()
                    .orElseThrow();
    
    System.out.println("Max number: " + max);

    // min number
    int min = nums.stream()
                    .mapToInt(Integer::intValue)
                    .min()
                    .orElseThrow();
                    
    System.out.println("Min number: " + min);


}
    
}
