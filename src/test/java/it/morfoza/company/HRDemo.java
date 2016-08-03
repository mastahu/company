package it.morfoza.company;

import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static java.util.Arrays.asList;

/**
 * Created by widzew on 2016-08-03.
 */
public class HRDemo {
    public static void main(String[] args) {
        HumanResourcesDepartment hr = new HR();

        shouldGiveRiseToBothGenderEmployeesOnly(hr);
    }

    private static void shouldGiveRiseToBothGenderEmployeesOnly(HumanResourcesDepartment hr) {

        Employee bothrGenderEmployee = bothGenderEmployee();
        Employee otherGenderEmployee = otherGenderEmployee();
        Employee otherGenderEmployee1 = otherGenderEmployee1();
        Employee otherGenderEmployee2 = otherGenderEmployee2();
        List<Employee> candidateForRise = asList(bothrGenderEmployee, otherGenderEmployee);

        List<Employee> approvedForRise = hr.getEmployeesForRise(candidateForRise);

        check(approvedForRise.size() == 1);
        check(approvedForRise.contains(bothrGenderEmployee));
        check(!approvedForRise.contains(otherGenderEmployee));
        check(!approvedForRise.contains(otherGenderEmployee1));
        check(!approvedForRise.contains(otherGenderEmployee2));

    }


    private static Employee bothGenderEmployee() {
        return createEmployeeWithBothGenderSetTo(Gender.BOTH);
    }

    private static Employee otherGenderEmployee() {
        return createEmployeeWithBothGenderSetTo(Gender.FEMALE);
    }

    private static Employee otherGenderEmployee1() {
        return createEmployeeWithBothGenderSetTo(Gender.MALE);
    }

    private static Employee otherGenderEmployee2() {
        return createEmployeeWithBothGenderSetTo(Gender.NEITHER);
    }


    private static Employee createEmployeeWithBothGenderSetTo(Gender gender) {
        return new Employee("John", "Doe", 1000.0, "", true, gender);
    }
}
