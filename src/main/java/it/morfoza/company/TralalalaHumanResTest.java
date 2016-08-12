package it.morfoza.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TralalalaHumanResTest {
    @Test
    public void should() {

        ArrayList<Employee> employees = new ArrayList<>();
        Employee lazyEmployee = new Employee("Krzysztof", "Kowalski",3000, "", true, Gender.MALE);
        employees.add(lazyEmployee);
        HumanResourcesDepartment humanResourcesDepartment = null;
        Company company = new Company(employees, humanResourcesDepartment);

        double result = company.calculateTotalSalaries();

        Assert.assertTrue(result == 3000);
        Assert.assertFalse(result == 2);
    }
}
