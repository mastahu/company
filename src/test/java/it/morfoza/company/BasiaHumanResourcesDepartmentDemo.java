package it.morfoza.company;


import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;

/**
 * Created by ahann on 03/08/2016.
 */
public class BasiaHumanResourcesDepartmentDemo {



    public static void main(String[] args) {
        test1();
        test2();

    }

    private static void test1(){
        HumanResourcesDepartment hr = new BasiaHumanResourcesDepartment();
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
        HumanResourcesDepartment hr = new BasiaHumanResourcesDepartment();

        Employee basiaEmployee = basiaEmployee();
        Employee nieBasiaEmployee = nieBasiaEmployee();
        List<Employee> candidatesForRise = asList(basiaEmployee, nieBasiaEmployee);

        List<Employee> approvedForRise = hr.getEmployeesForRise(candidatesForRise);

        assertTrue(approvedForRise.size() == 1);
        assertTrue(approvedForRise.contains(basiaEmployee));
        assertTrue(!approvedForRise.contains(nieBasiaEmployee));


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
