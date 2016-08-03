package it.morfoza.company;

import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static it.morfoza.company.Gender.*;
import static java.util.Arrays.asList;

public class GreedyHumanResourcesDepartmentDemo {

    public static void main(String[] args) {
        HumanResourcesDepartment hr = new GreedyHumanResourcesDepartment();
        List<Employee> employeesForRise = hr.getEmployeesForRise(asList(
                new Employee("aaaa", "", 123, "", true, FEMALE),
                new Employee("aaaa", "", 123, "", true, BOTH),
                new Employee("aaaa", "", 123, "Cleaner", true, NEITHER),
                new Employee("Anna", "Kowalska", 123, "", true, MALE),
                new Employee("Bożydar", "Nowak", 12323231, "", true, BOTH),
                new Employee("aaaa", "", 0, "CEO", true, FEMALE),
                new Employee("aaaa", "", 123, "", true, FEMALE)
        ));

        check(employeesForRise.size() == 0);

    }
}
