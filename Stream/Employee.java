package Stream;

  // From a list of Employees, print the names of employees whose salary is greater than 50,000.
import java.util.Arrays;
import java.util.List;

public class Employee {

    String name;
    int salary;

    public Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getSalary() { return salary; }

    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList( 
            new Employee("Suraj", 60000),
            new Employee("Dhiraj", 45000),
            new Employee("Mahesh", 60000));


            emp.stream()
            .filter(e -> e.getSalary() > 50000)
            .map(e -> e.getName())
            .forEach(System.out::println);

    }
    
}
