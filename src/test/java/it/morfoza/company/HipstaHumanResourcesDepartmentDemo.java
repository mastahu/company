package it.morfoza.company;

import java.util.List;

import static it.morfoza.company.DemoUtil.check;
import static java.util.Arrays.asList;

/**
 * Created by Wojt on 2016-08-03.
 */
public class HipstaHumanResourcesDepartmentDemo {
    public static void main(String[] args) {
        HumanResourcesDepartment sut = new HipstaHumanResourcesDepartment();

        shouldGetArise(sut);

        shouldNotGetArise(sut);

        OnlyMalesShouldGetArise(sut);


    }

    private static void OnlyMalesShouldGetArise(HumanResourcesDepartment sut) {
//Given
        List<Employee> candidatesForRise = asList(maleEmployee(),nonMaleEmployee1(),nonMaleEmployee2(),nonMaleEmployee3());
//When
        List<Employee> approvedForRise = sut.getEmployeesForRise(candidatesForRise);
//Then
        check(approvedForRise.size() == 1);
    }

    private static void shouldNotGetArise(HumanResourcesDepartment sut) {
//Given
        List<Employee> candidatesForRise = asList(nonMaleEmployee1(),nonMaleEmployee2(),nonMaleEmployee3());
//When
        List<Employee> approvedForRise = sut.getEmployeesForRise(candidatesForRise);
//Then
        check(approvedForRise.size() == 0);
    }

    private static void shouldGetArise(HumanResourcesDepartment sut) {
//Given
        List<Employee> candidatesForRise = asList(maleEmployee());
//When
        List<Employee> approvedForRise = sut.getEmployeesForRise(candidatesForRise);
//Then
        check(approvedForRise.size() == 1);
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

