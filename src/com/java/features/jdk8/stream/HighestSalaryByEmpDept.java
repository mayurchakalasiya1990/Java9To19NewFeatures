package com.java.features.jdk8.stream;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class HighestSalaryByEmpDept {
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
          new Employee(1,"Mayur", "Dev",100000),
                new Employee(3,"Bhavesh", "QA",200000),
                new Employee(5,"Rajesh", "QA",500000),
                new Employee(8,"Bapu", "Dev",700000),
                new Employee(8,"Bhadresh", "DevOps",400000)
        );

        Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getSalary);

        Map<String, Optional<Employee>> employeeMap =employeeList
                .stream()
                .collect(
                        Collectors.groupingBy(Employee::getDept,
                                Collectors.reducing(BinaryOperator.maxBy(compareBySalary))
                        )
                );
        System.out.println(employeeMap);

        Map<String, Employee> employeeMap1 =employeeList.stream().collect(Collectors.groupingBy(
                Employee::getDept,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),Optional::get)
        ));
        System.out.println(employeeMap1);

    }
}
