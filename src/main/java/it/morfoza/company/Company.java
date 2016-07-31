package it.morfoza.company;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employees;
    private HumanResourcesDepartament humanResourcesDepartament = new HumanResourcesDepartament();

    public Company(List<Employee> employees) {
        this.employees = new ArrayList<>(employees);
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
