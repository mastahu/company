package it.morfoza.company;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Company {

    private EmployeeRepository employeeRepository;
    private HumanResourcesDepartment humanResourcesDepartament;
    private Mailman mailman;

    public Company(EmployeeRepository employeeRepository, HumanResourcesDepartment humanResourcesDepartament) {
        this.employeeRepository = employeeRepository;
        this.humanResourcesDepartament = humanResourcesDepartament;
    }

    public Company(EmployeeRepository employeeRepository, HumanResourcesDepartment humanResourcesDepartment, Mailman mailman) {
        this(employeeRepository, humanResourcesDepartment);

        this.mailman = mailman;
    }

    public double calculateTotalSalaries() {
        double total = 0;
        for (Employee employee: employeeRepository.getAllEmployees()) {
            total += employee.getSalary();
        }
        return total;
    }

    public void giveRise(int percent) {
        List<Employee> employeesForRise = humanResourcesDepartament.getEmployeesForRise(employeeRepository.getAllEmployees());
        for (Employee employee: employeesForRise) {
            employee.giveRise(percent);
            mailman.deliverLetterAboutPayRise(employee);
        }
    }

    public String toString() {
        return "Company: [employeeRepository: " + employeeRepository.getAllEmployees() +  "]";
    }

}
