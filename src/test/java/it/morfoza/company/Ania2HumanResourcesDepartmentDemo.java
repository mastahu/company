package it.morfoza.company;

import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static java.util.Arrays.asList;

/**
 * Created by Anna Kacprzak on 2016-08-03.
 */
public class Ania2HumanResourcesDepartmentDemo {
    public static void main(String[] args) {
        HumanResourcesDepartment hr = null;

        List<Employee> employeesForRise;
        employeesForRise = hr.getEmployeesForRise(asList(annaName()));
        check(employeesForRise.size() == 1);

        employeesForRise = hr.getEmployeesForRise(asList(otherName()));
        check(employeesForRise.size() == 0);

    }


    private static Employee annaName() {
            return employeeWithName("Anna");
        }

    private static Employee otherName() {
        return employeeWithName("Bożena");
    }

    private static Employee employeeWithName(String name) {
        return new Employee(name, "Pazera", 5000, "JAVA programmer", false, Gender.FEMALE);
    }
}
