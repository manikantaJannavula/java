package com.wipro.java.java8.usecase.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wipro.java.java8.usecase.Employee;
import com.wipro.java.java8.usecase.EmployeeService;

/**
 * Test class for EmployeeManagement to validate various employee operations.
 */
public class EmployeeManagementTest {

    private EmployeeService employeeService;
    private ByteArrayOutputStream outputStream;

    /**
     * Sets up the test environment before each test case.
     * Initializes EmployeeService and redirects System.out to capture console output.
     */
    @BeforeEach
    void setUp() {
        employeeService = new EmployeeService();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream, true)); // Auto-flush enabled
    }

    /**
     * Test case to verify adding an employee.
     * Checks whether the console output contains a success message.
     */
    @Test
    void testAddEmployee() {
        Employee emp = new Employee(1, "John Doe", "IT", 75000.0, LocalDate.now());
        employeeService.addEmployee(emp);

        String output = outputStream.toString();
        System.out.println("Captured Output: " + output); // Debugging

        assertTrue(output.contains("Employee Added") || output.contains("added successfully"));
    }

    /**
     * Test case to verify removing an employee.
     * Ensures that the console output indicates successful removal.
     */
    @Test
    void testRemoveEmployee() {
        employeeService.addEmployee(new Employee(1, "John Doe", "IT", 75000.0, LocalDate.now()));
        employeeService.removeEmployee(1);

        String output = outputStream.toString();
        System.out.println("Captured Output: " + output); // Debugging

        assertTrue(output.contains("removed") || output.contains("Employee with ID 1 removed"));
    }

    /**
     * Test case to verify updating an employee's salary.
     * Checks whether the updated salary is correctly stored in the employee record.
     */
    @Test
    void testUpdateSalary() {
        employeeService.addEmployee(new Employee(1, "John Doe", "IT", 75000.0, LocalDate.now()));
        employeeService.updateSalary(1, 85000.0);

        Employee updatedEmployee = employeeService.getEmployees().stream()
                .filter(e -> e.getId() == 1)
                .findFirst()
                .orElseThrow(() -> new AssertionError("Employee not found"));

        assertEquals(85000.0, updatedEmployee.getSalary(), 0.001);
    }

    /**
     * Test case to verify searching for an employee by ID.
     * Checks if the console output contains the expected employee details.
     */
    @Test
    void testSearchByEmployeeID() {
        employeeService.addEmployee(new Employee(1, "John Doe", "IT", 75000.0, LocalDate.now()));
        employeeService.searchByEmployeeID(1);

        String output = outputStream.toString();
        System.out.println("Captured Output: " + output); // Debugging

        assertTrue(output.contains("John Doe") || output.contains("Employee { ID=1"));
    }

    /**
     * Uncomment the following test case to validate handling of invalid menu choices.
     * Ensures that an appropriate message is displayed when an invalid choice is entered.
     */
    // @Test
    // void testInvalidChoiceHandling() {
    //     String input = "9\n";
    //     System.setIn(new ByteArrayInputStream(input.getBytes()));
    //
    //     String output = outputStream.toString();
    //     System.out.println("Captured Output: " + output); // Debugging
    //
    //     assertTrue(output.contains("Invalid Choice") || output.contains("Please enter a valid option"));
    // }
}
