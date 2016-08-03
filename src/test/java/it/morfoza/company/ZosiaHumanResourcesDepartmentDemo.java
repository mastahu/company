package it.morfoza.company;


import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static java.util.Arrays.asList;

/**
 * Created by ahann on 03/08/2016.
 */
public class ZosiaHumanResourcesDepartmentDemo {


    public static void main(String[] args) {
        HumanResourcesDepartment hr = new ZosiaHumanResourcesDepartment();

        List<Employee> zosiaEmployeesForRise = hr.getEmployeesForRise(asList(zosiaEmployee()));
        check(zosiaEmployeesForRise.size() == 1);

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


}
