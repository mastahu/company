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
        return "Employee: " + firstName + " " + lastName + ", salary: " + salary + ", hardWorking:" + hardWorking;
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

    @Override
    public boolean equals(Object obj) {
        Employee employee1 = this;
        Employee employee2 = (Employee) obj;
        if (employee1.firstName.equals(employee2.firstName)
                && employee1.lastName.equals(employee2.lastName)
                && employee1.position.equals(employee2.position)
                && employee1.hardWorking == employee2.hardWorking
                && employee1.gender == employee2.gender
                && employee1.salary == employee2.salary){
            return true;
        } else {
            return false;
        }
    }
}

