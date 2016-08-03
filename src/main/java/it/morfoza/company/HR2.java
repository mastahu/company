package it.morfoza.company;

import java.util.ArrayList;
import java.util.List;

public class HR2 implements HumanResourcesDepartment {

    public List<Employee> getEmployeesForRise(List<Employee> employees) {
        List<Employee> candidatesForRise = new ArrayList<>();
        for (Employee employee: employees) {
            if (employee.getSalary() < 2000) {
                candidatesForRise.add(employee);
            }
        }
        return candidatesForRise;
    }
}
