package it.morfoza.company;

import java.util.List;

public class TestEmployeeRepository implements EmployeeRepository {

    private List<Employee> employees;

    public TestEmployeeRepository(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }
}
