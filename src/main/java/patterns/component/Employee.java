package patterns.component;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final String name;
    private final String dept;
    private final int salary;

    List<Employee> subOrdinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subOrdinates = new ArrayList<>();
    }

    public List<Employee> getSubOrdinates() {
        return subOrdinates;
    }

    public void add(Employee employee) {
        subOrdinates.add(employee);
    }

    @Override
    public String toString() {
        return "Employee: [ name: " + name +
                ", dept: " + dept +
                ", salary: " + salary + "]";
    }
}
