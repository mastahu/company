package it.morfoza.company;

import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static java.util.Arrays.asList;

/**
 * Created by Anna Kacprzak on 2016-08-03.
 */
public class AniaHumanResourcesDepartmentDemo {
    public static void main(String[] args) {
        test1();
        test2();


    }

    private static Employee lazyWoman() {
        return new Employee("Anna", "Pazera", 5000, "JAVA programmer", false, Gender.FEMALE);
    }

    private static Employee hardWorkingWoman() {
        return new Employee("Kasia", "Sobczak", 1000, "cleaner", true, Gender.FEMALE);
    }

    private static Employee notWoman() {
        return new Employee("Marek", "Szymczak", 2000, "Cofee maker", true, Gender.MALE);

    }

    private static void test1() {
        HumanResourcesDepartment hr = new AniaHumanResourcesDepartment();

        List<Employee> employeesForRise;
        employeesForRise = hr.getEmployeesForRise(asList(lazyWoman()));
        check(employeesForRise.size() == 1);

        employeesForRise = hr.getEmployeesForRise(asList(notWoman()));
        check(employeesForRise.size() == 0);

        employeesForRise = hr.getEmployeesForRise(asList(hardWorkingWoman()));
        check(employeesForRise.size() == 0);
    }

    private static void test2() {
        HumanResourcesDepartment hr = new AniaHumanResourcesDepartment();
//given
        List<Employee> employeesForRise;

        Employee lazyWoman = lazyWoman();
        Employee notWoman = notWoman();
//When
        employeesForRise = hr.getEmployeesForRise(asList(lazyWoman, notWoman));
// Then

        check(employeesForRise.size() == 1);
        check(employeesForRise.contains(lazyWoman));
        check(!employeesForRise.contains(notWoman));
    }


    }
