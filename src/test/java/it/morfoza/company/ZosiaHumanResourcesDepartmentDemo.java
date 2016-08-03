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

    public static void test1(){
        HumanResourcesDepartment hr = new ZosiaHumanResourcesDepartment();

        List<Employee> candidatesForRise;
        candidatesForRise = hr.getEmployeesForRise(asList(zosiaEmployee()));


        check(candidatesForRise.size() == 1);

        List<Employee> nieZosiaEmployeesForRise = hr.getEmployeesForRise(asList(nieZosiaEmployee()));
        check(nieZosiaEmployeesForRise.size() == 0);
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


    public static void test2() {
        HumanResourcesDepartment hr = new ZosiaHumanResourcesDepartment();
        Employee zosiaEmployee = zosiaEmployee();
        Employee nieZosiaEmployee = nieZosiaEmployee();
        List<Employee> candidatesForRise = asList(zosiaEmployee, nieZosiaEmployee);

        List<Employee> approvedForRise = hr.getEmployeesForRise(candidatesForRise);

        check(approvedForRise.size() == 1);
        check(approvedForRise.contains(zosiaEmployee));
        check(!approvedForRise.contains(nieZosiaEmployee));


    }




}
