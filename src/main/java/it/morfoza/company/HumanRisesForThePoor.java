package it.morfoza.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michalina on 03/08/16.
 */
public class HumanRisesForThePoor implements HumanResourcesDepartment {
    public List<Employee> getEmployeesForRise(List<Employee> employees) {
        List<Employee> employeesForRise = new ArrayList<>();
        for (Employee employee: employees) {
            if  (employee.getSalary() <= 2000){
                employeesForRise.add(employee);
            }
        }
        return employeesForRise;
    }
}

