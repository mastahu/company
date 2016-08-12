package it.morfoza.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void testEquals() {

        String anna = "";
        if(true) {
            anna += "Anna";
        }

        assertEquals(anna, "Anna");

        Employee employee1=new Employee(anna, "Pazera", 5000, "junior", true, Gender.FEMALE);
        Employee employee2=new Employee("Anna", "Pazera", 5000, "junior", true, Gender.FEMALE);
        Employee employee3=new Employee("Piotr", "Przybylak", 15000, "senior", false, Gender.MALE);
        Employee employee4=new Employee("Piotr", "Kowalski", 15000, "senior", false, Gender.MALE);
        assertEquals(employee1, employee2);
        assertTrue(employee1.equals(employee2));
        assertNotEquals(employee1, employee3);
        assertNotEquals(employee3, employee4);

    }



}