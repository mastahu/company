package it.morfoza.company;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;

/**
 * Created by Anna Kacprzak on 2016-08-03.
 */
public class AniaCompanyTest {
    @Test
    public void testCalculateTotalSalaries() {
//Given
        List<Employee> employees = asList(employeeWithSalary(1000.0));

        HumanResourcesDepartment humanResourcesDepartament = new AniaHumanResourcesDepartment();
        Company company = new Company(employees, humanResourcesDepartament);
//When
        double result = company.calculateTotalSalaries();
//Then
        assertTrue(result == 1000.0);

    }

    @Test
    public void testCalculateTotalSalaries2() {
        testCalculateTotalSalariesForTwoEmployees(testCase().salary1(200).salary2(300).expectedTotal(500));
        testCalculateTotalSalariesForTwoEmployees(testCase().salary1(400).salary2(500).expectedTotal(900));
        testCalculateTotalSalariesForTwoEmployees(testCase().salary1(200).salary2(300).expectedTotal(500));
        testCalculateTotalSalariesForTwoEmployees(testCase().salary1(200).salary2(300).expectedTotal(500));
        testCalculateTotalSalariesForTwoEmployees(testCase().salary1(200).salary2(300).expectedTotal(500));


    }

    private TestCase testCase() {
        return new TestCase();
    }

    private void testCalculateTotalSalariesForTwoEmployees(TestCase testCase) {
        testCalculateTotalSalariesForTwoEmployees(testCase.salary1, testCase.salary2, testCase.expectedTotal);
    }

    private void testCalculateTotalSalariesForTwoEmployees(double salary1, double salary2, double expectedResult) {
        //Given
        List<Employee> employees = asList(employeeWithSalary(salary1), employeeWithSalary(salary2));

        HumanResourcesDepartment humanResourcesDepartament = new AniaHumanResourcesDepartment();
        Company company = new Company(employees, humanResourcesDepartament);
//When
        double result = company.calculateTotalSalaries();
//Then
        assertTrue(result == expectedResult);
    }

    private Employee employeeWithSalary(double salary) {
        return new Employee("Józek", "Kiepski", salary, "beerDrinker", false, Gender.MALE);
    }


    private static class TestCase {
        public double salary1;
        public double salary2;
        public double expectedTotal;

        public TestCase salary1(double salary1) {
            this.salary1 = salary1;
            return this;
        }

        public TestCase salary2(double salary2) {
            this.salary2 = salary2;
            return this;
        }

        public TestCase expectedTotal(double expectedTotal) {
            this.expectedTotal = expectedTotal;
            return this;
        }
    }

}



