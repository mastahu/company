package it.morfoza.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anna Kacprzak on 2016-08-02.
 */
public class AniaHumanResourcesDepartment implements HumanResourcesDepartment {



    @Override
    public List <Employee> getEmployeesForRise(List<Employee> employees) {
        List <Employee> employeesForRise = new ArrayList<>();

        for (Employee employee: employees) {

            if (employee.getGender() == Gender.FEMALE  && !employee.isHardWorking()) {
                employeesForRise.add(employee);
            }
        }
        return employeesForRise;

        }

    }