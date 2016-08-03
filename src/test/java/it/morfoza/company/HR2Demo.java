package it.morfoza.company;

import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static java.util.Arrays.asList;


public class HR2Demo {

        public static void main(String[] args) {
            HumanResourcesDepartment hr = new HR2();

            shouldGiveRiseToRiseLessThan2000EmployeesOnly(hr);
        }

        private static void shouldGiveRiseToRiseLessThan2000EmployeesOnly(HumanResourcesDepartment hr) {

            Employee salaryLessThan2000Employee = createEmployeeWithSalaryLessThan2000();
            Employee salaryMoreThan2000Employee = createEmployeeWithSalaryMoreThan2000();

            List<Employee> candidatesForRise = asList(salaryLessThan2000Employee, salaryMoreThan2000Employee);

            List<Employee> approvedForRise = hr.getEmployeesForRise(candidatesForRise);

            check(approvedForRise.size() == 1);
            check(approvedForRise.contains(salaryLessThan2000Employee));
            check(!approvedForRise.contains(salaryMoreThan2000Employee));


        }

    private static Employee createEmployeeWithSalaryMoreThan2000() {
        return new Employee("John", "Doe", 2200.0, "", true, Gender.BOTH);
    }

    private static Employee createEmployeeWithSalaryLessThan2000() {
            return new Employee("John", "Doe", 1000.0, "", true, Gender.BOTH);
        }
    }


