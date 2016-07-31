package it.morfoza.company;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employees;
    private HumanResourcesDepartament humanResourcesDepartament;

    public Company(List<Employee> employees, HumanResourcesDepartament humanResourcesDepartament) {
        this.employees = new ArrayList<>(employees);
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
        for (Employee employee: humanResourcesDepartament.getEmployeesForRise(employees)) {
            employee.giveRise(percent);
        }
    }


    public String toString() {
        return "Company: [employees: " + employees +  "]";
    }

}
