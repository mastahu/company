package it.morfoza.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employeesForCompany1 = new ArrayList<>();
        employeesForCompany1.add(new Employee(1000.0, true));
        employeesForCompany1.add(new Employee(2000.0, true));
        employeesForCompany1.add(new Employee(5000.0, false));

        ArrayList<Employee> employeesForCompany2 = new ArrayList<>();
        employeesForCompany2.add(new Employee(3000.0, true));
        employeesForCompany2.add(new Employee(3000.0, false));
        employeesForCompany2.add(new Employee(3000.0, true));

        Company company = new Company(employeesForCompany1);
        Company company2 = new Company(employeesForCompany2);

        System.out.println(company);
        System.out.println(company2);

        System.out.println("company1 total:" + company.calculateTotalSalaries());
        System.out.println("company2 total:" + company2.calculateTotalSalaries());

        company.giveRise(100);
        System.out.println("-------- RISE ---------!!!!");

        System.out.println("company1 total:" + company.calculateTotalSalaries());
        System.out.println("company2 total:" + company2.calculateTotalSalaries());

        System.out.println(company);
        System.out.println(company2);

    }
}
