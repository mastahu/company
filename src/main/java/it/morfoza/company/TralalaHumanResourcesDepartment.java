package it.morfoza.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahann on 03/08/2016.
 */
public class TralalaHumanResourcesDepartment implements HumanResourcesDepartment {

    public List<Employee> getEmployeesForRise(List<Employee> employees){
        List<Employee> emloyeesForRise = new ArrayList<>();
        for (Employee employee: employees){
            if (employee.getGender().equals(Gender.FEMALE)){
                emloyeesForRise.add(employee);
            }
        }

        return emloyeesForRise;
    }
}



