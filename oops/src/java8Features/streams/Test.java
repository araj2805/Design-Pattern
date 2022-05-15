/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package java8Features.streams;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Employee> lstEmp = Employee.getEmpList();
        //displaying the sample data
        System.out.println("*****Sample Data*****");
        /*lstEmp.forEach((e) -> System.out.println(e.getId() + ":" + e.getName() + ":" + e.getSal()));
        //displaying the data after applying filter and increasing salary
        System.out.println("*****Data after applying filter and increasing salary*****");
        List<Employee> lstNewEmp = lstEmp.stream().filter(emp -> emp.getYearsInOrg() < 1)
                .map(e -> { e.setSal(e.getSal() + 5000); return e; })
                .collect(Collectors.toList());
        lstNewEmp.forEach((e) -> System.out.println(e.getId() + ":" + e.getName() + ":" + e.getSal()));*/


        lstEmp.stream().forEach(e -> System.out.println(e.getId()+" : "+e.getName()+" Salary : "+e.getSal()));


        System.out.println("*****Operation  Data*****");

        lstEmp.stream().filter(e -> e.getYearsInOrg() >= 2).map(e -> {e.setSal(e.getSal() + 2000); return e;}).forEach(e -> System.out.println(e.getId()+" : "+e.getName()+" SAlary : "+e.getSal()));
    }
}

