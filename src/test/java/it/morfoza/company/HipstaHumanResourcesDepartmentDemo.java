package it.morfoza.company;

import java.lang.reflect.MalformedParametersException;
import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static java.util.Arrays.asList;

/**
 * Created by Wojt on 2016-08-03.
 */
public class HipstaHumanResourcesDepartmentDemo {
    public static void main(String[] args) {
        HumanResourcesDepartment hipstaHumanResourcesDepartment = new HipstaHumanResourcesDepartment();

        List<Employee> maleEmployeesForRise = hipstaHumanResourcesDepartment.getEmployeesForRise(asList(maleEmployee()));
        check(maleEmployeesForRise.size() == 1);

        List<Employee> nonMaleEmployeesForRise1 = hipstaHumanResourcesDepartment.getEmployeesForRise(asList(nonMaleEmployee1(),nonMaleEmployee2(),nonMaleEmployee3()));
        check(nonMaleEmployeesForRise1.size() == 0);

    }
    private static Employee maleEmployee() {return createEmployeeWithGenderFieldSetTo(Gender.MALE);
    }
    private static Employee nonMaleEmployee1() {return createEmployeeWithGenderFieldSetTo(Gender.FEMALE);
    }
    private static Employee nonMaleEmployee2() {return createEmployeeWithGenderFieldSetTo(Gender.NEITHER);
    }
    private static Employee nonMaleEmployee3() {return createEmployeeWithGenderFieldSetTo(Gender.BOTH);
    }

    private static Employee createEmployeeWithGenderFieldSetTo(Gender gender) {
        return new Employee("John", "Doe", 1000.0, "", true , gender);
    }
    }

