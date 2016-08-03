package it.morfoza.company;

import java.util.ArrayList;
import java.util.List;

public class NewHumanResourcesDeprartment implements HumanResourcesDepartment {

    public List<Employee> getEmployeesForRise(List<Employee> employees) {
        List<Employee> employeesForRise = new ArrayList<>();
        for (Employee employee: employees) {
            if (employee.getGender() == Gender.FEMALE);{

                employeesForRise.add(employee);
            }
        }
        return employeesForRise;
    }
}
