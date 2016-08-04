package it.morfoza.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Anna Kacprzak on 2016-08-03.
 */
public class AniaCompanyTest {
    @Test
    public void testCalculateTotalSalaries (){
//Given
        ArrayList<Employee> employees=new ArrayList<>();
        Employee lazyEmployee=new Employee("Józek", "Kiepski", 1000, "beerDrinker", false, Gender.MALE);
        employees.add(lazyEmployee);
        HumanResourcesDepartment humanResourcesDepartament=new AniaHumanResourcesDepartment();
        Company company=new Company(employees, humanResourcesDepartament);
//When
        double result= company.calculateTotalSalaries();
//Then
        Assert.assertTrue(result==1000);
    }
}
