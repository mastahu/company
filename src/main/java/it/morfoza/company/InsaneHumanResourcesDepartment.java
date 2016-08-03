package it.morfoza.company;



import java.util.ArrayList;
import java.util.List;


public class InsaneHumanResourcesDepartment implements HumanResourcesDepartment {

    public List<Employee> getEmployeesForRise(List<Employee> employees) {
        List<Employee> employeesForRise = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getGender().equals(Gender.NEITHER)) {
                employeesForRise.add(employee);
            }
        }
        return employeesForRise;
    }
}








