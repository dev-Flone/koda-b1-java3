package koda;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        System.out.println("EMPLOYEE LIST");
        System.out.println();
        // List
        // List<Employee> employees = new ArrayList<>();
        // employees.add(new Employee("KR001", "Andi", 7000000));
        // employees.add(new Employee("KR002", "Budi", 5000000));
        // employees.add(new Employee("KR003", "Citra", 6000000));

        // System.out.println("Employee List");
        // for (Employee employee : employees) {
        // System.out.println(employee.getAccount() + " - " + employee.getOwner() + " -
        // " + employee.getBalance());
        // }

        // Map
        // Map<String, Employee> employees = new LinkedHashMap<>();

        // Employee employee1 = new Employee("KR001", "Andi", 7000000);
        // Employee employee2 = new Employee("KR002", "Budi", 5000000);
        // Employee employee3 = new Employee("KR003", "Citra", 6000000);

        // employees.put(employee1.getAccount(), employee1);
        // employees.put(employee2.getAccount(), employee2);
        // employees.put(employee3.getAccount(), employee3);

        // for (Employee employee : employees.values()) {
        // System.out.println(employee.getAccount() + " - " + employee.getOwner() + " -
        // " + employee.getBalance());
        // }

        // Set
        // // Set<Employee> employees = new HashSet<>();
        // Employee employee1 = new Employee("KR001", "Andi", 7000000);
        // Employee employee2 = new Employee("KR002", "Budi", 5000000);
        // Employee employee3 = new Employee("KR003", "Citra", 6000000);

        // employees.add(employee1);
        // employees.add(employee2);
        // employees.add(employee3);
        // for (Employee employee : employees) {
        // System.out.println(employee.getAccount() + " - " + employee.getOwner() + " -
        // " + employee.getBalance());
        // }

        // Queue
        Queue<Employee> employees = new ArrayDeque<>();
        Employee employee1 = new Employee("KR001", "Andi", 7000000);
        Employee employee2 = new Employee("KR002", "Budi", 5000000);
        Employee employee3 = new Employee("KR003", "Citra", 6000000);

        employees.offer(employee1);
        employees.offer(employee2);
        employees.offer(employee3);

        for (Employee employee : employees) {
            System.out.println(employee.getAccount() + " - " + employee.getOwner() + " - " + employee.getBalance());
        }
    }
}
