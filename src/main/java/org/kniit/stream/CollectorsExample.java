package org.kniit.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsExample {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 10),
                new Employee("Bob", "IT", 20),
                new Employee("Charlie", "HR", 30),
                new Employee("David", "IT", 25)
        );

        // Исправлено: toList() → collect(Collectors.toList())
        List<Employee> employeesByDepartment = employees.stream()
                .collect(Collectors.toList());

        System.out.println(employeesByDepartment);

        // Пример группировки по отделам (если нужно)
        Map<String, List<Employee>> byDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Сотрудники по отделам: " + byDepartment);

        // Пример поиска максимальной зарплаты по отделам
        Map<String, Integer> maxSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)),
                                opt -> opt.map(Employee::getSalary).orElse(0)
                        )
                ));

        System.out.println("Максимальная зарплата по отделам: " + maxSalaryByDept);
    }

    static class Employee {
        String name;
        String department;
        int salary;

        Employee(String name, String department, int salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() { return name; }
        public String getDepartment() { return department; }
        public int getSalary() { return salary; }

        @Override
        public String toString() {
            return name;
        }
    }
}