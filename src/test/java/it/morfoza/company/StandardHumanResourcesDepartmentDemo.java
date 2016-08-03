package it.morfoza.company;

import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static java.util.Arrays.asList;

public class StandardHumanResourcesDepartmentDemo {
    public static void main(String[] args) {

        HumanResourcesDepartment sut = new StandardHumanResourcesDepartment();

        should_give_rise_to_hard_working_employee(sut);

        should_not_give_rise_to_lazy_employee(sut);

        should_give_rise_to_hardworking_emoployees_only(sut);


    }

    private static void should_give_rise_to_hardworking_emoployees_only(HumanResourcesDepartment sut) {
        // Given
        Employee hardWorkingEmployee = hardWorkingEmployee();
        Employee lazyEmployee = lazyEmployee();
        List<Employee> candidatesForRise = asList(hardWorkingEmployee, lazyEmployee);

        // When
        List<Employee> approvedForRise = sut.getEmployeesForRise(candidatesForRise);

        // Then
        check(approvedForRise.size() == 1);
        check(approvedForRise.contains(hardWorkingEmployee));
        check(!approvedForRise.contains(lazyEmployee));
    }

    private static void should_not_give_rise_to_lazy_employee(HumanResourcesDepartment sut) {
        // Given
        List<Employee> candidatesForRise = asList(lazyEmployee());

        // When
        List<Employee> approvedForRise = sut.getEmployeesForRise(candidatesForRise);

        // Then
        check(approvedForRise.size() == 0);
    }

    private static void should_give_rise_to_hard_working_employee(HumanResourcesDepartment sut) {
        // Given
        List<Employee> candidatesForRise = asList(hardWorkingEmployee());

        // When
        List<Employee> approvedForRise = sut.getEmployeesForRise(candidatesForRise);

        // Then
        check(approvedForRise.size() == 1);
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
