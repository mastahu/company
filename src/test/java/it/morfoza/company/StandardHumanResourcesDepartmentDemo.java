package it.morfoza.company;

import java.util.List;

import static it.morfoza.company.DemoUtil.checkCondition;
import static java.util.Arrays.asList;

public class StandardHumanResourcesDepartmentDemo {
    public static void main(String[] args) {
        HumanResourcesDepartment hr = new StandardHumanResourcesDepartment();

        List<Employee> hardWorkingEmployeesForRise = hr.getEmployeesForRise(asList(createEmployeeWithWorkAttitude(true)));
        checkCondition(hardWorkingEmployeesForRise.size() == 1);

        List<Employee> lazyEmployeesForRise = hr.getEmployeesForRise(asList(createEmployeeWithWorkAttitude(false)));
        checkCondition(lazyEmployeesForRise.size() == 0);
    }

    private static Employee createEmployeeWithWorkAttitude(boolean hardWorking) {
        return new Employee("John", "Doe", 1000.0, "", hardWorking,Gender.FEMALE);
    }

}
