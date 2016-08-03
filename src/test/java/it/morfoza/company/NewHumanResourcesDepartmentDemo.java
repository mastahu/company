package it.morfoza.company;

import java.util.List;
import static it.morfoza.company.DemoUtil.check;
import static it.morfoza.company.Gender.FEMALE;
import static it.morfoza.company.Gender.MALE;
import static java.util.Arrays.asList;

public class NewHumanResourcesDepartmentDemo {

    public static void main(String[] args) {

        HumanResourcesDepartment humanResourcesDeprartment = new NewHumanResourcesDeprartment();
        //do zmiennej o typie HumanResourcesDepartment i
        // nazwie humanResourcesDeprartment przypisujemy nowo utworzony obiekt typu new NewHumanResourcesDeprartment


        // given
        Employee woman = employeeWithGender(FEMALE);
        Employee man = employeeWithGender(MALE);
        List<Employee> candidatesForRise = asList(woman, man);


        // when
        List<Employee>  approvedForRise; //deklaruje zmienna o typie List<Employee> o nazwie approvedForRise
        approvedForRise = humanResourcesDeprartment.getEmployeesForRise(candidatesForRise);


        // then
        check(approvedForRise.size() == 1 ); //zwraca rozmiar listy
        check(approvedForRise.contains(woman)); //sprawdza czy zawiera podany obiekt
        check(!approvedForRise.contains(man));//then


    }


    private static Employee employeeWithGender (Gender gender) {
        return new Employee ("Kasia", "Kowalska", 2000.0, "", false, gender);

    }



}
