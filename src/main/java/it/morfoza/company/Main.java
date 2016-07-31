package it.morfoza.company;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        Company company2 = new Company();

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
