package it.morfoza.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahann on 02/08/2016.
 */
public class ZosiaHumanResourcesDepartment implements HumanResourcesDepartment{

    public List<Employee> getEmployeesForRise(List<Employee> employees) {
        List<Employee> employeesForRise = new ArrayList<>();
        for (Employee employee: employees) {
            if (employee.getFirstName().equals("Zosia")){
                employeesForRise.add(employee);
            }
        }
        return employeesForRise;
    }
}
