package it.morfoza.company.pp;

import it.morfoza.company.Employee;
import it.morfoza.company.Gender;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.get;

public class HandlingErrorOldSkulExample {


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        double result = calculateTotalSalaries(employees);
        System.out.println(result);
        employees.add(new Employee("", "", 1000.0, "", false, Gender.BOTH));
        result = calculateTotalSalaries(employees);
        System.out.println(result);
        result = calculateTotalSalaries(null);
        System.out.println(result);



        get("/", (req, res) -> {

            int openFile = openFile("pracownicy.txt");
            if (openFile == -1) {
                return "Błąd! Nie ma pliku pracownicy.txt";
            }

            if (openFile == -2) {
                return "Błąd! Nie masz uprawnien do pliku pracownicy.txt";
            }

            if (openFile < 0) {
                return "Błąd! Sam nie wiem co sie dzieje";
            }

            List<Employee>  employeesFromFile = readFile(openFile);

            double total = calculateTotalSalaries(employeesFromFile);
            if (total < 0) {
                return "Błąd! Coś poszło nie tak";
            }
            return "Total salary is: " + total;
        });
    }

    private static List<Employee> readFile(int openFile) {
        return null;
    }

    public static double calculateTotalSalaries(List<Employee> employees) {
        if (employees == null) {
            //System.out.println("Your employees is null!!!");
            return -1.0;
        }
        else {
            double total = 0;
            for (Employee employee : employees) {
                total += employee.getSalary();
            }
            return total;
        }
    }

    public static int openFile(String file) {

        boolean fileExists = checkIfFileExitst(file);

        if (!fileExists) {
            return -1;
        }

        boolean hasPermission = checkIfUserHasPermissionToRead(file);
        if (!hasPermission) {
            return -2;
        }

        // jest plik
        return 12345;
    }

    private static boolean checkIfUserHasPermissionToRead(String file) {
        return false;
    }

    private static boolean checkIfFileExitst(String file) {
        return false;
    }


}
