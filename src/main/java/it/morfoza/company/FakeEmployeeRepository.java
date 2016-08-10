package it.morfoza.company;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FakeEmployeeRepository implements EmployeeRepository {
    @Override
    public List<Employee> getAllEmployees() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Maria", "Kubiak", 1000.0, "CEO", true, Gender.FEMALE ));
        employees.add(new Employee("Zenobia", "Xoxoxo", 1000.0, "CTO", true, Gender.FEMALE));
        employees.add(new Employee("Marek", "Baba", 1000.0, "Java Developer", true, Gender.MALE ));
        employees.add(new Employee("John", "Trump", 1000.0, "Tester", true, Gender.MALE ));
        return employees;
    }
}
