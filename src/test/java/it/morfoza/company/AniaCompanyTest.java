package it.morfoza.company;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Anna Kacprzak on 2016-08-03.
 */
public class AniaCompanyTest {

    @Test
    public void shouldCalculateTotalSalaries() {
        testCalculateTotalSalaries(testCase().salary(1000).expectedTotal(1000));
        testCalculateTotalSalaries(testCase().salary(200).salary(300).expectedTotal(500));
        testCalculateTotalSalaries(testCase().salary(200).salary(300).expectedTotal(500));
        testCalculateTotalSalaries(testCase().salary(400).salary(500).expectedTotal(900));
        testCalculateTotalSalaries(testCase().salary(200).salary(300).expectedTotal(500));
        testCalculateTotalSalaries(testCase().salary(200).salary(300).expectedTotal(500));
        testCalculateTotalSalaries(testCase().salary(200).salary(300).expectedTotal(500));
        testCalculateTotalSalaries(testCase().salary(200).salary(300).salary(500).expectedTotal(1000));
    }

    private TestCase testCase() {
        return new TestCase();
    }

    private void testCalculateTotalSalaries(TestCase testCase) {
        testCalculateTotalSalariesForListOfEmployees(testCase.salaries, testCase.expectedTotal);
    }

    private void testCalculateTotalSalariesForListOfEmployees(List<Double> salaries, double expectedResult) {
        //Given
        List<Employee> employees = new ArrayList<>();
        for (Double salary : salaries) {
            employees.add(employeeWithSalary(salary));
        }

        HumanResourcesDepartment humanResourcesDepartament = null;

        EmployeeRepository employeeRepository = mock(EmployeeRepository.class);
        when(employeeRepository.getAllEmployees()).thenReturn(employees);

        Company company = new Company(employeeRepository, humanResourcesDepartament);

        //When
        double result = company.calculateTotalSalaries();

        //Then
        assertTrue(result == expectedResult);
    }

    private Employee employeeWithSalary(double salary) {
        return new Employee("Józek", "Kiepski", salary, "beerDrinker", false, Gender.MALE);
    }


    private static class TestCase {
        public List<Double> salaries = new ArrayList<>();
        public double expectedTotal;

        public TestCase salary(double salary) {
            salaries.add(salary);
            return this;
        }

        public TestCase expectedTotal(double expectedTotal) {
            this.expectedTotal = expectedTotal;
            return this;
        }
    }

    @Test
    public void shouldGiveRiseToEmployeeThatHRLikes() {
        // Given
        List<Employee> employees = new ArrayList<>();
        Employee employee = employeeWithSalary(1000);
        employees.add(employee);

        EmployeeRepository employeeRepository = mock(EmployeeRepository.class);
        when(employeeRepository.getAllEmployees()).thenReturn(employees);
        Mailman mailman = mock(Mailman.class);
        Company company = new Company(employeeRepository, new TestHumanResourcesDepartment(), mailman);

        // When
        company.giveRise(10);

        // Then
        assertThat(employee.getSalary()).isEqualTo(1100);
    }

        @Test
        public void shouldNotifyEmployeeWhenSheGetsARise(){
            // Given
            List<Employee> employees = new ArrayList<>();
            Employee employee = employeeWithSalary(1000);
            employees.add(employee);

            EmployeeRepository employeeRepository = mock(EmployeeRepository.class);
            when(employeeRepository.getAllEmployees()).thenReturn(employees);
            Mailman mailman = mock(Mailman.class);
            Company company = new Company(employeeRepository, new TestHumanResourcesDepartment(), mailman);

            // When
            company.giveRise(10);

            // Then
            verify(mailman).deliverLetterAboutPayRise(employee);


        }

}



