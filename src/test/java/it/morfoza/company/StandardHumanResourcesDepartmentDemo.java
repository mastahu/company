package it.morfoza.company;

import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static java.util.Arrays.asList;

public class StandardHumanResourcesDepartmentDemo {
    public static void main(String[] args) {
        HumanResourcesDepartment hr = new StandardHumanResourcesDepartment();

        List<Employee> employeesForRise;
        employeesForRise = hr.getEmployeesForRise(asList(hardWorkingEmployee()));
        check(employeesForRise.size() == 1);

        employeesForRise = hr.getEmployeesForRise(asList(lazyEmployee()));
        check(employeesForRise.size() == 0);



        Employee hardWorkingEmployee = hardWorkingEmployee();
        Employee lazyEmployee = lazyEmployee();

        employeesForRise = hr.getEmployeesForRise(asList(hardWorkingEmployee, lazyEmployee));
        check(employeesForRise.size() == 1);
        check(employeesForRise.contains(hardWorkingEmployee));
        check(!employeesForRise.contains(lazyEmployee));

    }

    private static Employee hardWorkingEmployee() {
        return createEmployeeWithHardWorkingFieldSetTo(true);
    }

    private static Employee lazyEmployee() {
        return createEmployeeWithHardWorkingFieldSetTo(false);
    }

    private static Employee createEmployeeWithHardWorkingFieldSetTo(boolean hardWorking) {
        return new Employee("John", "Doe", 1000.0, "", hardWorking,Gender.FEMALE);
    }

}
