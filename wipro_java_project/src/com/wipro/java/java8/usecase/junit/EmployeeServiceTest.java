package com.wipro.java.java8.usecase.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wipro.java.java8.usecase.Employee;
import com.wipro.java.java8.usecase.EmployeeService;

/**
 * Test class for EmployeeService.
 */
public class EmployeeServiceTest {

    private EmployeeService employeeService;

    @BeforeEach
    void setUp() {
        employeeService = new EmployeeService();
        employeeService.addEmployee(new Employee(1, "John Doe", "IT", 75000.0, LocalDate.of(2020, 5, 15)));
        employeeService.addEmployee(new Employee(2, "Jane Doe", "HR", 80000.0, LocalDate.of(2021, 6, 20)));
    }

    @Test
    void testAddEmployee() {
        Employee emp = new Employee(3, "Alice Brown", "Finance", 90000.0, LocalDate.of(2019, 3, 10));
        employeeService.addEmployee(emp);
        assertEquals(3, employeeService.getEmployees().size());
    }

    @Test
    void testRemoveEmployee() {
        employeeService.removeEmployee(1);
        assertEquals(1, employeeService.getEmployees().size());
    }

    @Test
    void testUpdateSalary() {
        employeeService.updateSalary(2, 85000.0);

        Employee updatedEmployee = employeeService.getEmployees().stream()
                .filter(emp -> emp.getId() == 2)
                .findFirst()
                .orElse(null);

        assertNotNull(updatedEmployee);
        assertEquals(85000.0, updatedEmployee.getSalary(), 0.001);
    }

    @Test
    void testFilterByDepartment() {
        List<Employee> hrEmployees = employeeService.getEmployees().stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase("HR"))
                .collect(Collectors.toList());
        assertEquals(1, hrEmployees.size());
    }

    @Test
    void testSortByEmployeeName() {
        employeeService.sortByEmployeeName();
        assertEquals("Jane Doe", employeeService.getEmployees().get(0).getName());
    }

    @Test
    void testSearchByEmployeeID() {
        Employee emp = employeeService.getEmployees().stream()
                .filter(e -> e.getId() == 2)
                .findFirst()
                .orElse(null);
        assertNotNull(emp);
        assertEquals("Jane Doe", emp.getName());
    }
}