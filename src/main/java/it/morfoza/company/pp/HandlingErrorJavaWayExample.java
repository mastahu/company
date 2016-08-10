package it.morfoza.company.pp;

import it.morfoza.company.Employee;
import it.morfoza.company.Gender;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.get;

public class HandlingErrorJavaWayExample {


    public static void notMain(String[] args) {
        try {

            String a = null;

            boolean z = a == null;

            System.out.println(z);
            a.isEmpty();

             int b = 1 / 0;



            List<Employee> employees = new ArrayList<>();
            double result = calculateTotalSalaries(employees);
            System.out.println(result);
            employees.add(new Employee("", "", 1000.0, "", false, Gender.BOTH));
            result = calculateTotalSalaries(employees);
            System.out.println(result);
            System.out.println("UWAGA wywoluje metode z parametrem null!");
            result = calculateTotalSalaries(null);
            System.out.println(result);
            System.out.println("KONIEC");


        } catch (Exception e) {
            System.out.println("AAAAAA BŁĄD!!!!!!");
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
      //      return;
        }
        System.out.println("Po catchu");

        get("/", (req, res) -> {
//            if(true) {
//                throw new Exception("terefere");
//            }

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







    public static double calculateTotalSalaries(List<Employee> employees) throws NieMaListyEmployeeException {

            if (employees == null) {
                //System.out.println("Your employees is null!!!");
                //return -1.0;
                throw new NieMaListyEmployeeException();
            } else {
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


    public void nicNieRob() {
        System.out.println("");
        System.out.println("");
        if(true) {
            return;
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }

}
