package it.morfoza.company;

import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static java.util.Arrays.asList;

public class StandardHumanResourcesDepartmentDemo {
    public static void main(String[] args) {
        HumanResourcesDepartment hr = new StandardHumanResourcesDepartment();

        List<Employee> hardWorkingEmployeesForRise = hr.getEmployeesForRise(asList(hardWorkingEmployee()));
        check(hardWorkingEmployeesForRise.size() == 1);

        List<Employee> lazyEmployeesForRise = hr.getEmployeesForRise(asList(lazyEmployee()));
        check(lazyEmployeesForRise.size() == 0);
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
