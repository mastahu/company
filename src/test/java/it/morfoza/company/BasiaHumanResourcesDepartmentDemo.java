package it.morfoza.company;


import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static java.util.Arrays.asList;

/**
 * Created by ahann on 03/08/2016.
 */
public class BasiaHumanResourcesDepartmentDemo {



    public static void main(String[] args) {
        test1();
        test2();

    }

    private static void test1(){
        HumanResourcesDepartment hr = null;
        basiaShouldGetRise(hr);
        nieBasiaShouldNotGetRise(hr);
    }

    private static void nieBasiaShouldNotGetRise(HumanResourcesDepartment hr) {
        // Given
        List<Employee> candidatesForRise = asList(nieBasiaEmployee());
        // When
        List<Employee> approvedForRise = hr.getEmployeesForRise(candidatesForRise);
        // Then
        check(approvedForRise.size() == 0);
    }

    private static void basiaShouldGetRise(HumanResourcesDepartment hr) {
        // Given
        List<Employee> candidatesForRise = asList(basiaEmployee());

        // When
        List<Employee> approvedForRise = hr.getEmployeesForRise(candidatesForRise);

        // Then
        check(approvedForRise.size() == 1);
    }


    private static void test2() {
        HumanResourcesDepartment hr = null;

        Employee basiaEmployee = basiaEmployee();
        Employee nieBasiaEmployee = nieBasiaEmployee();
        List<Employee> candidatesForRise = asList(basiaEmployee, nieBasiaEmployee);

        List<Employee> approvedForRise = hr.getEmployeesForRise(candidatesForRise);

        check(approvedForRise.size() == 1);
        check(approvedForRise.contains(basiaEmployee));
        check(!approvedForRise.contains(nieBasiaEmployee));


    }


    private static Employee basiaEmployee() {
        return createEmployeeWithFirstNameFieldSetTo("Basia");
    }

    private static Employee nieBasiaEmployee() {
        return createEmployeeWithFirstNameFieldSetTo("Zosia");
    }

    private static Employee createEmployeeWithFirstNameFieldSetTo(String firstName) {
        return new Employee(firstName, "Doe", 1000.0, "", true, Gender.FEMALE);

    }

}
