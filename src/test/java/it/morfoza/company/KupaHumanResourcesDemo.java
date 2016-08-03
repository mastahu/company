package it.morfoza.company;

import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static java.util.Arrays.asList;

/**
 * Created by Wojt on 2016-08-03.
 */
public class KupaHumanResourcesDemo {
    public static void main(String[] args) {
        HumanResourcesDepartment kupaHumanResources = new KupaHumanResourcesDepartment();

        List<Employee> drumpfEmployeesForRise = kupaHumanResources.getEmployeesForRise(asList(drumpfEmployee()));
        check(drumpfEmployeesForRise.size() == 1);

        List<Employee> nonDrumpfEmployeesForRise = kupaHumanResources.getEmployeesForRise(asList(nonDrumpfEmployee(),nonDrumpfEmployee1(),nonDrumpfEmployee2()));
        check(nonDrumpfEmployeesForRise.size() == 0);

    }
    private static Employee drumpfEmployee() {
        return createEmployeeWithLastNameFieldSetTo("Drumpf");
    }
    private static Employee nonDrumpfEmployee() {
        return createEmployeeWithLastNameFieldSetTo("Kowalski");
    }
    private static Employee nonDrumpfEmployee1() {
        return createEmployeeWithLastNameFieldSetTo("Trump");
    }
    private static Employee nonDrumpfEmployee2() {
        return createEmployeeWithLastNameFieldSetTo("drumpf");
    }


    private static Employee createEmployeeWithLastNameFieldSetTo(String lastName) {
        return new Employee("John", lastName, 1000.0, "", true ,Gender.FEMALE);
    }

}
