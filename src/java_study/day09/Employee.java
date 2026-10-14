package java_study.day09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {

    private String name;
    private Position position;
    private double salary;
    private int yearsOfExperience;

    private static final List<Employee> employeeList = new ArrayList<>();

    public Employee(String name, Position position, double salary, int yearsOfExperience) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
        employeeList.add(this);
    }

    public static List<Employee> getEmployeeList() {
        return new ArrayList<>(employeeList);
    }

    public static Employee lowestPaid(Position position) {
        if (position == null) {
            throw new IllegalArgumentException("this position do not exist");
        }
        Employee result = null;
        for (Employee employee : employeeList) {
            if (employee.getPosition() == position && (result == null || employee.getSalary() < result.getSalary())) {
                result = employee;
            }
        }
        if (result == null) {
            throw new IllegalArgumentException("Do not exist employee on this position");
        }
        return result;
    }

    public static double averageExperience(Position position) {
        if (position == null) {
            throw new IllegalArgumentException("this position do not exist");
        }
        double sum = 0;
        int count = 0;
        for (Employee employee : employeeList) {
            if (employee.getPosition() == position) {
                sum += employee.getYearsOfExperience();
                count++;
            }
        }
        if (count == 0) {
            throw new IllegalArgumentException("Do not exist employee on this position");
        }
        return sum / count;
    }

    public static Employee firstAlphabetically() {
        employeeList.sort(Comparator.comparing(Employee::getName));
        return employeeList.getFirst();
    }


    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String toString() {
        return name + " " + position + " " + salary + " " + yearsOfExperience;
    }
}
