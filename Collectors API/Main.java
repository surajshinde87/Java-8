import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String dept;
    int salary;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " [" + dept + ", " + salary + "]";
    }
}

public class Main {
    public static void main(String[] args) {

        // Create employee list
        List<Employee> employees = List.of(
                new Employee("Suraj", "IT", 50000),
                new Employee("Rahul", "HR", 30000),
                new Employee("Amit", "IT", 45000),
                new Employee("Yash", "Finance", 55000),
                new Employee("Rushi", "HR", 35000),
                new Employee("Raj", "Finance", 60000)
        );

        // 1️ List of all employee names
        List<String> names = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("Employee Names: " + names);

        // 2️ Total salary of all employees
        int totalSalary = employees.stream()
                .collect(Collectors.summingInt(Employee::getSalary));
        System.out.println("Total Salary: " + totalSalary);

        // 3️ Group employees by department
        Map<String, List<Employee>> groupByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept));
        System.out.println("\nGrouped By Department:");
        groupByDept.forEach((dept, empList) -> 
            System.out.println(dept + " => " + empList)
        );

        // 4️ Average salary per department
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.averagingInt(Employee::getSalary)
                ));
        System.out.println("\nAverage Salary By Department:");
        avgSalaryByDept.forEach((dept, avg) ->
            System.out.println(dept + " => " + avg)
        );

        // 5️ Join all employee names into one string
        String allNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));
        System.out.println("\nJoined Employee Names: " + allNames);
    }
}
