package it.morfoza.company;

import java.util.ArrayList;

public class StandardHumanResourcesDepartament implements HumanResourcesDepartament {
    @Override
    public ArrayList<Employee> getEmployeesForRise(ArrayList<Employee> employees) {
        ArrayList<Employee> employeesForRise = new ArrayList<>();
        for (Employee employee: employees) {
            if (employee.isHardWorking()){
                employeesForRise.add(employee);
            }
        }
        return employeesForRise;
    }
}
