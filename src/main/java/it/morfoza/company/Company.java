package it.morfoza.company;

import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> employees;
    private HumanResourcesDepartament humanResourcesDepartament;

    public Company(ArrayList<Employee> employees) {
        this.employees = employees;
        this.humanResourcesDepartament = new HumanResourcesDepartament();
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
