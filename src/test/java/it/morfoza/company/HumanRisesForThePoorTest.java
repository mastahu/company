package it.morfoza.company;

import org.junit.Test;

import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static java.util.Arrays.asList;

/**
 * Created by Wojt on 2016-08-03.
 */
public class HumanRisesForThePoorTest {

    private HumanResourcesDepartment sut = new HumanRisesForThePoor();

    @Test
    public void poorShouldGetRises() {
        // Given

        Employee poorEmployee = poorEmployee();
        List<Employee> candidatesForRise = asList(poorEmployee);

        // When
        List<Employee> approvedForRise = sut.getEmployeesForRise(candidatesForRise);

        // Then
        check(approvedForRise.size() == 1);
    }

    @Test
    public void richShouldNotGetRises() {
        // Given
        Employee richEmployee = richEmployee();
        List<Employee> candidatesForRise = asList(richEmployee);

        // When
        List<Employee> approvedForRise = sut.getEmployeesForRise(candidatesForRise);

        // Then
        check(approvedForRise.size() == 0);
    }

    @Test
    public void shouldGiveRiseToPoorEmployeesOnly() {
        // Given
        Employee richEmployee = richEmployee();
        Employee poorEmployee = poorEmployee();
        List<Employee> candidatesForRise = asList(richEmployee, poorEmployee);

        // When
        List<Employee> approvedForRise = sut.getEmployeesForRise(candidatesForRise);

        // Then
        check(approvedForRise.size() == 1);
        check(approvedForRise.contains(poorEmployee));
        check(!approvedForRise.contains(richEmployee));
    }

    private static Employee richEmployee() {
        return createEmployeeWithSalaryFieldSetTo(2001.0);
    }

    private static Employee poorEmployee() {
        return createEmployeeWithSalaryFieldSetTo(1999.0);
    }
//    private static Employee poorEmployee1() {
//        return createEmployeeWithSalaryFieldSetTo(1000.0);
//    }


    private static Employee createEmployeeWithSalaryFieldSetTo(double salary) {
        return new Employee("John", "Doe", salary, "", true, Gender.FEMALE);
    }
}

