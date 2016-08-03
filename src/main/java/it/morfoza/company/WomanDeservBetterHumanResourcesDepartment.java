package it.morfoza.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by widzew on 2016-08-03.
 */
public class WomanDeservBetterHumanResourcesDepartment implements HumanResourcesDepartment {

    public List<Employee> getEmployeesForRise(List<Employee> employees) {
        ArrayList<Employee> employeesForRise = new ArrayList<>();
        for (Employee employee : employees) {
            if( (employee.getGender() == Gender.FEMALE) &&
            (employee.isHardWorking() == false))
            employeesForRise.add(employee);
        }

        return employeesForRise;
    }
}
