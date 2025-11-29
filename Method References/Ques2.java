// Use instance method reference on an object:
// Printer p = new Printer();
// List<String> list = List.of("Java", "Python", "C++");
// Print each string using p::print.

import java.util.List;

public class Ques2 {
    
    static class Printer {
        public void print(String s) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        List<String> list = List.of("Java", "Python", "C++", "JavaScript");
        list.stream()
            .forEach(p::print);
    }

}
