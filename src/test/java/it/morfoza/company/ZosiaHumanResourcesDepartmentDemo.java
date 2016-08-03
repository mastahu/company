package it.morfoza.company;


import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static java.util.Arrays.asList;

/**
 * Created by ahann on 03/08/2016.
 */
public class ZosiaHumanResourcesDepartmentDemo {



    public static void main(String[] args) {


        test1();
        test2();

    }

    private static void test1(){
        HumanResourcesDepartment hr = new ZosiaHumanResourcesDepartment();
        zosiaShouldGetRise(hr);
        nieZosiaShouldNotGetRise(hr);
    }

    private static void nieZosiaShouldNotGetRise(HumanResourcesDepartment hr) {
        // Given
        List<Employee> candidatesForRise = asList(nieZosiaEmployee());
        // When
        List<Employee> approvedForRise = hr.getEmployeesForRise(candidatesForRise);
        // Then
        check(approvedForRise.size() == 0);
    }

    private static void zosiaShouldGetRise(HumanResourcesDepartment hr) {
        // Given
        List<Employee> candidatesForRise = asList(zosiaEmployee());

        // When
        List<Employee> approvedForRise = hr.getEmployeesForRise(candidatesForRise);

        // Then
        check(approvedForRise.size() == 1);
    }


    private static void test2() {
        HumanResourcesDepartment hr = new ZosiaHumanResourcesDepartment();

        Employee zosiaEmployee = zosiaEmployee();
        Employee nieZosiaEmployee = nieZosiaEmployee();
        List<Employee> candidatesForRise = asList(zosiaEmployee, nieZosiaEmployee);

        List<Employee> approvedForRise = hr.getEmployeesForRise(candidatesForRise);

        check(approvedForRise.size() == 1);
        check(approvedForRise.contains(zosiaEmployee));
        check(!approvedForRise.contains(nieZosiaEmployee));


    }


    private static Employee zosiaEmployee() {
        return createEmployeeWithFirstNameFieldSetTo("Zosia");
    }

    private static Employee nieZosiaEmployee() {
        return createEmployeeWithFirstNameFieldSetTo("nie Zosia");
    }

    private static Employee createEmployeeWithFirstNameFieldSetTo(String firstName) {
        return new Employee(firstName, "Doe", 1000.0, "", true, Gender.FEMALE);

    }

}
