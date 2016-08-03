package it.morfoza.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anna Kacprzak on 2016-08-03.
 */
public class BasiaHumanResourcesDepartment implements HumanResourcesDepartment {
    public List<Employee> getEmployeesForRise(List<Employee> employees) {
        List<Employee> employeesForRise = new ArrayList<>();
        for (Employee employee: employees) {
            if (employee.getFirstName().equals("Basia")){
                employeesForRise.add(employee);
            }

        }

        return employeesForRise;
    }

}
