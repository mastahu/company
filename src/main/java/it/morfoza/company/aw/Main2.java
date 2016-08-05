package it.morfoza.company.aw;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;
import it.morfoza.company.Employee;
import it.morfoza.company.Gender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahann on 05/08/2016.
 */
public class Main2 {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        double result = calculateTotalSalaries(employees);
        System.out.println(result);
        employees.add(new Employee("", "", 1000.0, "", false, Gender.BOTH));
        result = calculateTotalSalaries(employees);
        System.out.println(result);

    }

    private static double calculateTotalSalaries(List<Employee> employees) {
        double total = 0;
        for (Employee employee: employees) {
            total += employee.getSalary();
        }
        return total;
    }

}
