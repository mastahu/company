package it.morfoza.company;

import org.junit.Test;

import static org.junit.Assert.*;

// hello
public class EmployeeTest {

    @Test
    public void testEquals() {

        String anna = "";
        if (true) {
            anna += "Anna";
        }

        assertEquals(anna, "Anna");

        Employee employee1 = new Employee(anna, "Pazera", 5000, "junior", true, Gender.FEMALE);
        Employee employee2 = new Employee("Anna", "Pazera", 5000, "junior", true, Gender.FEMALE);
        Employee employee3 = new Employee("Piotr", "Przybylak", 15000, "senior", false, Gender.MALE);
        Employee employee4 = new Employee("Piotr", "Kowalski", 15000, "senior", false, Gender.MALE);
        assertEquals(employee1, employee2);
        assertTrue(employee1.equals(employee2));
        assertNotEquals(employee1, employee3);
        assertNotEquals(employee3, employee4);

    }

    @Test
    public void testEmployeeWS(){
        Employee employee1=new Employee("Szczepan", "Pazera", 5000, "junior", true, Gender.MALE);

        Employee employee2=new Employee("Szczepan", "Pazera", 15000, "junior", true, Gender.MALE);


        assertNotEquals(employee1, employee2);
        assertTrue(!employee1.equals(employee2));

    }

    @Test
    public void testEmployeeMB(){
        Employee employee1=new Employee("Anna", "Pazera", 5000, "junior", true, Gender.MALE);
        Employee employee2=new Employee("Anna", "Pazera", 5000, "junior", true, Gender.FEMALE);
            assertNotEquals(employee1,employee2);

        }

    @Test
    public void testEmployeeAW() {

        Employee employee3= new Employee("Piotr", "Przybylak", 15000, "senior", false, Gender.MALE);
        Employee employee4= new Employee("Piotr", "Przybylak", 15000, "junior", false, Gender.MALE);
        assertNotEquals(employee3, employee4);

    }

    @Test
    public void testEmployeeKS() {

        Employee employee1 = new Employee("Kasia", "Kowalska", 5000, "", true, Gender.FEMALE);
        Employee employee2 = new Employee("Kasia", "Kowalska", 5000, "", false, Gender.FEMALE);

        assertNotEquals(employee1, employee2);


    }


    @Test
    public void testEmployeePP() {
        Employee employee1 = new Employee("Anna", "Pazera", 5000, "junior", true, Gender.FEMALE);
        assertTrue(true);
    }



    @Test
    public void testEmployeeJS() {
    }


    @Test
    public void testEmployeeAP() {
        Employee employee2 = new Employee("Anna", "Pazera", 5000, "junior", true, Gender.FEMALE);
        Employee employee3 = new Employee("Anna", "Przybylak", 5000, "junior", true, Gender.FEMALE);
        assertNotEquals(employee2,employee3);
    }
    }
