package it.morfoza.company;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by Anna Kacprzak on 2016-08-03.
 */
public class AniaHumanResourcesDepartmentDemo {
    public static void main(String[] args) {
        HumanResourcesDepartment hr = new AniaHumanResourcesDepartment();

        List<Employee> employeesForRise;
        employeesForRise  = hr.getEmployeesForRise(asList(lazyWoman()));
        DemoUtil.check(employeesForRise.size() == 1);
        employeesForRise  = hr.getEmployeesForRise(asList(notWoman()));
        DemoUtil.check(employeesForRise.size() == 0);
        employeesForRise  = hr.getEmployeesForRise(asList(hardWorkingWoman()));
        DemoUtil.check(employeesForRise.size() == 0);
    }
    private static Employee lazyWoman() {
        return new Employee("Anna", "Pazera", 5000, "JAVA programmer", false, Gender.FEMALE);
    }
    private static Employee hardWorkingWoman(){
        return new Employee("Kasia", "Sobczak", 1000, "cleaner", true, Gender.FEMALE);
    }
    private static Employee notWoman() {
        return new Employee("Marek", "Szymczak", 2000,"Cofee maker", true, Gender.MALE);
    }
}
