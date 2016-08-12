package it.morfoza.company.KS;

import it.morfoza.company.Employee;
import it.morfoza.company.Gender;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        double result = calculateTotalSalaries(employees);
        System.out.println(result);
        employees.add(new Employee("", "", 1000.0, "", false, Gender.FEMALE));
        result = calculateTotalSalaries(employees);
        System.out.println(result);
    }

    public static double calculateTotalSalaries(List<Employee> employees) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;

    }

}
