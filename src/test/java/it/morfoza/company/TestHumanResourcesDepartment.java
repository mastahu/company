package it.morfoza.company;

import java.util.List;

public class TestHumanResourcesDepartment implements HumanResourcesDepartment {
    @Override
    public List<Employee> getEmployeesForRise(List<Employee> employees) {
        return employees;
    }
}
