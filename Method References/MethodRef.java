import java.util.List;

class MathUtils {
    public static int square(int x) {
        return x * x;
    }
}

class Printer {
    public void print(String message) {
        System.out.println(message);
    }
}

class Student {
    String name;

    public Student(String name){
        this.name = name;
    }
}

public class MethodRef {

    public static void main(String[] args) {
        
        // static method reference use map in stream
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.stream()
                .map(MathUtils::square)
                .forEach(System.out::println);

        // instance method reference
        Printer obj = new Printer();
        List<String> msgs = List.of("Hello", "Java", "World");  
        msgs.stream()
            .forEach(obj::print);
         
        // instance method of a class
        msgs.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);

        // constructor reference
        List<String> names = List.of("Suraj", "Rahul", "Neha");

        names.stream()
             .map(Student::new)
             .forEach(s -> System.out.println("Student created: " + s.name));
    }
}
