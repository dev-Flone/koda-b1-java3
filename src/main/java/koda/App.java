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

        // Map
        // Map<Integer, Employee> employees = new LinkedHashMap<>();

        // employees.put(1, new Employee("KR001", "Andi", 7000000));
        // employees.put(2, new Employee("KR002", "Budi", 5000000));
        // employees.put(3, new Employee("KR003", "Citra", 6000000));

        // for (Employee employee : employees.values()) {
        // System.out.println(employee.getAccount() + " - " + employee.getOwner() + " -
        // " + employee.getBalance());
        // }

        // Set
        // Set<Employee> employees = new HashSet<>();
        // employees.add(new Employee("KR001", "Andi", 7000000));
        // employees.add(new Employee("KR002", "Budi", 5000000));
        // employees.add(new Employee("KR003", "Citra", 6000000));

        // Queue
        Queue<Employee> employees = new ArrayDeque<>();
        employees.offer(new Employee("KR001", "Andi", 7000000));
        employees.offer(new Employee("KR002", "Budi", 5000000));
        employees.offer(new Employee("KR003", "Citra", 6000000));

        // Printing
        for (Employee employee : employees) {
            System.out.println(employee.getAccount() + " - " + employee.getOwner() + " - " + employee.getBalance());
        }
    }
}
