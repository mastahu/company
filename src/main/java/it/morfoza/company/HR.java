package it.morfoza.company;

import it.morfoza.company.Employee;
import it.morfoza.company.HumanResourcesDepartment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by widzew on 2016-08-02.
 */
public class HR implements HumanResourcesDepartment {

    public List<Employee> getEmployeesForRise(List<Employee> employees) {
        ArrayList<Employee> employeesForRise = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getGender() == Gender.BOTH) {
                employeesForRise.add(employee);
            }
        }
        return employeesForRise;


    }
}
