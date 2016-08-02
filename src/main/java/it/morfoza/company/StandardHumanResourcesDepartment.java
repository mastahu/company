package it.morfoza.company;

import java.util.ArrayList;
import java.util.List;

public class StandardHumanResourcesDepartment implements HumanResourcesDepartment {

    public List<Employee> getEmployeesForRise(List<Employee> employees) {
        List<Employee> employeesForRise = new ArrayList<>();
        for (Employee employee: employees) {
            if (employee.isHardWorking()){
                employeesForRise.add(employee);
            }
        }
        return employeesForRise;
    }
}
