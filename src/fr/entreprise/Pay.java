package fr.entreprise;

import java.util.ArrayList;

public class Pay {
    public static void main(String[] args) {

        // COMMERCIALS INSTANCES
        Commercial commercial1 = new Commercial("Boris", 12, 35, 5);
        Commercial commercial2 = new Commercial("Sébastien", 10, 60, 5);
        Commercial commercial3 = new Commercial("Walid");

        // EMPLOYEES INSTANCES
        Employee employee1 = new Employee("Todd", 25, 50, 3);
        Employee employee2 = new Employee("Camille", 20, 50, 3);
        Employee employee3 = new Employee("Maxime", 15, 50, 8);

        // INCREASED EMPLOYEES INSTANCES
        IncreasedEmployee increasedEmployee1 = new IncreasedEmployee("Quentin", 18, 60, 3);
        IncreasedEmployee increasedEmployee2 = new IncreasedEmployee("Manon");
        IncreasedEmployee increasedEmployee3 = new IncreasedEmployee("Bertrand", 11, 40, 3);

        increasedEmployee2.setSalaryInformations(18,15,5);


        // ARRAY OF EMPLOYEES
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(commercial1);
        employeeArrayList.add(commercial2);
        employeeArrayList.add(commercial3);

        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);

        employeeArrayList.add(increasedEmployee1);
        employeeArrayList.add(increasedEmployee2);
        employeeArrayList.add(increasedEmployee3);

        employeeArrayList.forEach((employee -> System.out.println(employee.getName() + " gagne " + employee.calculatedSalary() + "€")));
    }
}
