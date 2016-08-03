package it.morfoza.company;

import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static it.morfoza.company.Gender.FEMALE;
import static it.morfoza.company.Gender.MALE;
import static java.util.Arrays.asList;

/**
 * Created by michalina on 03/08/16.
 */
public class WomanDeservBetterHumanResourcesDepartmentDemo {

    public static void main(String[] args) {
        HumanResourcesDepartment hrowcy = new WomanDeservBetterHumanResourcesDepartment();

        whoShouldGetRise(hrowcy);


        whoSouldNotGetRise(hrowcy);


    }

    private static void whoSouldNotGetRise(HumanResourcesDepartment hrowcy) {
        // Given
        Employee hardWorkingMaleEmployee = hardWorkingMale();
        List<Employee> approvedForRise;
        // When
        approvedForRise = hrowcy.getEmployeesForRise(asList(hardWorkingMaleEmployee));
        // Then
        check(approvedForRise.size() == 0);
        check(!approvedForRise.contains(hardWorkingMaleEmployee));
    }

    private static Employee whoShouldGetRise(HumanResourcesDepartment hrowcy) {
        // Given
        List<Employee> candidatesForRise;
        Employee hardWorkingMaleEmployee = hardWorkingMale();
        Employee lazyFemaleEmployee = lazyFemale();
        candidatesForRise = asList(lazyFemaleEmployee, hardWorkingMaleEmployee);

        // When
        List<Employee> approvedForRise = hrowcy.getEmployeesForRise(candidatesForRise);

        // Then
        check(approvedForRise.size() == 1);
        check(approvedForRise.contains(lazyFemaleEmployee));
        return hardWorkingMaleEmployee;
    }

    private static Employee lazyFemale() {
        return createEmployee(false, FEMALE);
    }

    private static Employee hardWorkingMale() {
        return createEmployee(true, MALE);
    }

    private static Employee createEmployee(boolean hardWorking, Gender gender) {
        return new Employee("John", "Doe", 1000.0, "", hardWorking, gender);
    }

}
