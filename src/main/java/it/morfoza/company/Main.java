package it.morfoza.company;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {


        Company company = new Company(asList(new Employee(1000.0, true), new Employee(2000.0, false), new Employee(5000.0, true)), new StandardHumanResourcesDepartament());
        Company company2 = new Company(asList(new Employee(3000.0, true), new Employee(3000.0, true), new Employee(3000.0, true)), new StandardHumanResourcesDepartament());

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
