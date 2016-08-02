package it.morfoza.company;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;
    private String position;
    private boolean hardWorking;
    private Gender gender;

    public Employee(String firstName, String lastName, double salary, String position, boolean hardWorking, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.position = position;
        this.hardWorking = hardWorking;
        this.gender = gender;
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public Gender getGender() {
        return gender;
    }
}
