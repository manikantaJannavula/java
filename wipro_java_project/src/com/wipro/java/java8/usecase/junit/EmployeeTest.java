package com.wipro.java.java8.usecase.junit;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.wipro.java.java8.usecase.Employee;  // Import the Employee class

/**
 * Test class for Employee.
 */
public class EmployeeTest {

    private Employee employee;

    /**
     * Setup method to initialize an Employee instance before each test.
     */
    @BeforeEach
    void setUp() {
        employee = new Employee(1, "John Doe", "IT", 75000.0, LocalDate.of(2020, 5, 15));
    }

    /**
     * Test case to verify the getter methods of Employee class.
     */
    @Test
    void testGetters() {
        assertEquals(1, employee.getId()); // Verify Employee ID
        assertEquals("John Doe", employee.getName()); // Verify Employee Name
        assertEquals("IT", employee.getDepartment()); // Verify Department
        assertEquals(75000.0, employee.getSalary(), 0.001); // Verify Salary with delta
        assertEquals(LocalDate.of(2020, 5, 15), employee.getJoiningDate()); // Verify Joining Date
    }

    /**
     * Test case to verify the setter methods of Employee class.
     */
    @Test
    void testSetters() {
        employee.setId(2); // Set new Employee ID
        employee.setName("Jane Doe"); // Set new Employee Name
        employee.setDepartment("HR"); // Set new Department
        employee.setSalary(80000.0); // Set new Salary
        employee.setJoiningDate(LocalDate.of(2021, 6, 20)); // Set new Joining Date

        // Verify updated values
        assertEquals(2, employee.getId());
        assertEquals("Jane Doe", employee.getName());
        assertEquals("HR", employee.getDepartment());
        assertEquals(80000.0, employee.getSalary(), 0.001);
        assertEquals(LocalDate.of(2021, 6, 20), employee.getJoiningDate());
    }

    /**
     * Test case to verify the toString() method of Employee class.
     */
    @Test
    void testToString() {
        String expected = "Employee { ID=1, Name='John Doe', Department='IT', Salary=75000.0, Joining Date=2020-05-15 }";
        assertEquals(expected, employee.toString()); // Verify toString() output
    }
}
