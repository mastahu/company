package it.morfoza.company;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employees;
    private HumanResourcesDepartment humanResourcesDepartament = new StandardHumanResourcesDepartment();

    public Company(List<Employee> employees, HumanResourcesDepartment humanResourcesDepartament) {
        this.employees = employees;
        this.humanResourcesDepartament = humanResourcesDepartament;
    }

    public double calculateTotalSalaries() {
        double total = 0;
        for (Employee employee: employees) {
            total += employee.getSalary();
        }
        return total;
    }

    public void giveRise(int percent) {
        List<Employee> employeesForRise = humanResourcesDepartament.getEmployeesForRise(employees);
        for (Employee employee: employeesForRise) {
            employee.giveRise(percent);
        }
    }

    public String toString() {
        return "Company: [employees: " + employees +  "]";
    }

}
