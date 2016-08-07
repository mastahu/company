//package it.morfoza.company;
//
//import java.util.List;
//
//import static java.util.Arrays.asList;
//
///**
// * Created by Wojt on 2016-08-03.
// */
//public class FalafelHumanResourcesDemo {
//    HumanResourcesDepartment falafelHumanResources = new FalafelHumanResourcesDemo();
//
//    List<Employee> drumpfEmployeesForRise = falafelHumanResources.getEmployeesForRise(asList(goodEmployee()));
//
//    check(drumpfEmployeesForRise.size() ==1);
//
//    List<Employee> nonDrumpfEmployeesForRise = falafelHumanResources.getEmployeesForRise(asList(badEmployee()));
//
//    check(nonDrumpfEmployeesForRise.size() ==0);
//
//
//    private static Employee goodEmployee() {
//        return createEmployeeWithSalaryAndHardWorking(1999, true);
//    }
//
//    private static Employee badEmployee() {
//        return createEmployeeWithSalaryAndHardWorking(2000, true);
//    }
//    private static Employee badEmployee1() {
//        return createEmployeeWithSalaryAndHardWorking(1999, false);
//    }
//    private static Employee badEmployee2() {
//        return createEmployeeWithSalaryAndHardWorking(2000, false);
//    }
//
//    private static Employee createEmployeeWithSalaryAndHardWorking(double salary, hardWorking) {
//        return new Employee("John", "Doe", salary, "", hardWorking, Gender.FEMALE);
//    }
//
//}
//}
