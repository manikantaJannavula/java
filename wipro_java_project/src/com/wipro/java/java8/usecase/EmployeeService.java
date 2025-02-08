package com.wipro.java.java8.usecase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * EmployeeService class provides business logic for employee management.
 * It includes operations like adding, removing, updating, searching,
 * filtering, and sorting employees.
 */
public class EmployeeService {

    // List to store employee records
    private List<Employee> employees = new ArrayList<>();

    /**
     * Adds a new employee to the system.
     *
     * @param emp The Employee object to be added
     */
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee Added: " + emp);
    }

    /**
     * Returns the list of employees.
     *
     * @return List of employees
     */
    public List<Employee> getEmployees() {
        return employees;
    }

    /**
     * Displays all employees in the system.
     */
    public void displayEmployee() {
        if (employees.isEmpty()) {
            System.out.println("No Employee Records Found.");
        } else {
            employees.forEach(System.out::println);
        }
    }

    /**
     * Removes an employee by ID.
     */
    public void removeEmployee(int removeId) {
        boolean removed = employees.removeIf(emp -> emp.getId() == removeId);
        if (removed) {
            System.out.println("Employee with ID " + removeId + " removed.");
        } else {
            System.out.println("Employee with ID " + removeId + " not found.");
        }
    }

    /**
     * Updates the salary of an employee by ID.
     */
    public void updateSalary(int empID, double empSalary) {
        employees.stream()
                .filter(emp -> emp.getId() == empID)
                .findFirst()
                .ifPresentOrElse(
                        emp -> {
                            emp.setSalary(empSalary);
                            System.out.println("Updated salary for Employee ID: " + empID);
                        },
                        () -> System.out.println("Employee with ID " + empID + " not found.")
                );
    }

    /**
     * Filters employees by department.
     */
    public void filterByDepartment(String department) {
        List<Employee> departments = employees.stream()
                .filter(emp -> emp.getDepartment().trim().equalsIgnoreCase(department.trim()))
                .collect(Collectors.toList());

        if (departments.isEmpty()) {
            System.out.println("No employees found in the " + department + " department.");
        } else {
            departments.forEach(System.out::println);
        }
    }

    /**
     * Sorts employees by name in ascending order.
     */
    public void sortByEmployeeName() {
        employees.sort(Comparator.comparing(Employee::getName));
    }

    /**
     * Searches for an employee by ID.
     */
    public void searchByEmployeeID(int empID) {
        employees.stream()
                .filter(emp -> emp.getId() == empID)
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("No Employee Records Found.")
                );
    }
}