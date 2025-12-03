// Convert a list of strings to uppercase using method reference.
// Input: ["suraj", "rahul", "neha"]

import java.util.List;

public class UpperList {
public static void main(String[] args) {

  List<String> names = List.of("suraj", "rahul", "rushi");

            names.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    
}
    
}