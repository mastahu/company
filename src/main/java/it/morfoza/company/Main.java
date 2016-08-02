package it.morfoza.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Employee> employeesForCompany1 = new ArrayList<>();
        employeesForCompany1.add(new Employee("Jan", "Kowalski", 3000.0, "CEO", true, Gender.BOTH ));
        employeesForCompany1.add(new Employee("Jan", "Kowalska", 1000.0, "CFO", true, Gender.NEITHER ));
        employeesForCompany1.add(new Employee("Jan", "Nowak", 4000.0, "Cleaner", true, Gender.MALE ));

        ArrayList<Employee> employeesForCompany2 = new ArrayList<>();
        employeesForCompany2.add(new Employee("Basia", "Kwiatkowska", 1000.0, "CEO", true, Gender.FEMALE ));
        employeesForCompany2.add(new Employee("Zosia", "Piątkowska", 1000.0, "CTO", true, Gender.FEMALE));
        employeesForCompany2.add(new Employee("Marek", "Jurek", 1000.0, "Java Developer", true, Gender.MALE ));
        employeesForCompany2.add(new Employee("John", "Smith", 1000.0, "Tester", true, Gender.MALE ));

        Company company = new Company(employeesForCompany1, new StandardHumanResourcesDepartment());
        Company company2 = new Company(employeesForCompany2, new StandardHumanResourcesDepartment());

        System.out.println(company);
        System.out.println(company2);

        System.out.println("company1 total:" + company.calculateTotalSalaries());
        System.out.println("company2 total:" + company2.calculateTotalSalaries());

        company.giveRise(100);
        company2.giveRise(100);
        System.out.println("-------- RISE ---------!!!!");

        System.out.println("company1 total:" + company.calculateTotalSalaries());
        System.out.println("company2 total:" + company2.calculateTotalSalaries());

        System.out.println(company);
        System.out.println(company2);

    }
}
