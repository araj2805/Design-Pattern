/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package java8Features.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {

        System.out.println("How many male and female employees are there in the organization?");

        List<Employee> employeeList = Employee.getEmployeeList();

        Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getGender(), Collectors.counting()));
        noOfMaleAndFemaleEmployees.forEach((k,v) -> System.out.println(k+" "+v));

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("How many employees are there in the each department ?");
        Map<String, Long> employeeInEachDept = employeeList.stream().collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()));
        employeeInEachDept.forEach((k,v) -> System.out.println(k+" "+v));

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Print the name of all departments in the organization ans count org?");

        employeeList.stream().map(e -> e.getDepartment()).distinct().forEach(e -> System.out.print(e+", "));

        System.out.println();
        long count = employeeList.stream().map(e -> e.getDepartment()).count();
        System.out.println("Department : "+count);

        System.out.println();
        System.out.println("What is the average age of male and female employees?");


        Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println(avgAgeOfMaleAndFemaleEmployees);

        System.out.println();

        System.out.println("Get the details of highest paid employee in the organization? ");
        Employee maxSalaryEmp = employeeList.stream().collect(Collectors.maxBy((o1, o2) -> (int) (o2.getSal() - o1.getSal()))).get();
        System.out.println(maxSalaryEmp);


    }
}
