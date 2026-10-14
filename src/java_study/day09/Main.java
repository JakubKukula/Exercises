package java_study.day09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        new Employee("Anna", Position.SENIOR, 21000.00, 12);
        new Employee("Ala", Position.MID, 15000.00, 5);
        new Employee("Bartek", Position.JUNIOR, 6500.00, 1);
        new Employee("Celina", Position.MID, 12000.00, 4);
        new Employee("Damian", Position.JUNIOR, 7200.00, 3);
        new Employee("Ewa", Position.MID, 13500.00, 5);
        new Employee("Filip", Position.SENIOR, 18500.00, 9);
        new Employee("Gosia", Position.MID, 13500.00, 6);
        new Employee("Hubert", Position.JUNIOR, 5800.00, 0);

        System.out.println(Employee.getEmployeeList());

        System.out.println(Employee.averageExperience(Position.SENIOR));

        System.out.println(Employee.lowestPaid(Position.MID));

        System.out.println(Employee.firstAlphabetically());
    }
}
