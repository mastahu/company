package it.morfoza.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;

public class StandardHumanResourcesDepartmentTest {

    private HumanResourcesDepartment sut = new StandardHumanResourcesDepartment();

    @Test
    public void should_give_rise_to_hardworking_emoployees_only() {
        // Given
        Employee hardWorkingEmployee = hardWorkingEmployee();
        Employee lazyEmployee = lazyEmployee();
        List<Employee> candidatesForRise = asList(hardWorkingEmployee, lazyEmployee);

        // When
        List<Employee> approvedForRise = sut.getEmployeesForRise(candidatesForRise);

        // Then
        assertTrue(approvedForRise.size() == 1);
        assertTrue(approvedForRise.contains(hardWorkingEmployee));
        assertTrue(!approvedForRise.contains(lazyEmployee));
        check(approvedForRise.size() == 1);
        check(approvedForRise.contains(hardWorkingEmployee));
        check(!approvedForRise.contains(lazyEmployee));
    }

    @Test
    public void should_not_give_rise_to_lazy_employee() {
        // Given
        List<Employee> candidatesForRise = asList(lazyEmployee());

        // When
        List<Employee> approvedForRise = sut.getEmployeesForRise(candidatesForRise);

        // Then
        check(approvedForRise.size() == 0);
        assertTrue(approvedForRise.size() == 0);
    }

    @Test
    public void should_give_rise_to_hard_working_employee() {
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
