package it.morfoza.company;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;
    private String position;
    private boolean hardWorking;

    public Employee(double salary, boolean hardWorking) {
        this.salary = salary;
        this.hardWorking= hardWorking;
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + ", salary: " + salary +", hardWorking:" + hardWorking;
    }

    public void giveRise(int percent) {
        this.salary += (this.salary / 100 * percent);
    }

    public double getSalary() {
        return this.salary;
    }

    public boolean isHardWorking() {
        return hardWorking;
    }
}
