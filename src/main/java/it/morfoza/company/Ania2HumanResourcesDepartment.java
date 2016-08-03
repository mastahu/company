package it.morfoza.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wojt on 2016-08-03.
 */
public class Ania2HumanResourcesDepartment implements HumanResourcesDepartment {
    public List<Employee> getEmployeesForRise(List<Employee> employees) {
        List <Employee> employeesForRise = new ArrayList<>();

        for (Employee employee: employees) {

            if (employee.getFirstName() == ("Anna")) {
                employeesForRise.add(employee);
            }
        }
        return employeesForRise;

    }

}

