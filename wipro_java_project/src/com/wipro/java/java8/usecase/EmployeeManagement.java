package com.wipro.java.java8.usecase;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * EmployeeManagement class serves as the main entry point for the Employee
 * Management System. It provides a menu-driven interface to manage employees,
 * allowing users to: 1. Add Employees 2. Display Employees 3. Remove Employees
 * 4. Update Employee Salary 5. Filter Employees by Department 6. Sort Employees
 * by Name 7. Search Employees by ID 8. Exit the Application
 */
public class EmployeeManagement {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		Scanner sc = new Scanner(System.in);

		while (true) {
			// Display menu options
			System.out.println("\n-------- Employee Management System ------------");
			System.out.println("1. Add Employee");
			System.out.println("2. Display all Employees");
			System.out.println("3. Remove an Employee");
			System.out.println("4. Update an Employee Salary");
			System.out.println("5. Filter Employees by Department");
			System.out.println("6. Sort Employees by Name");
			System.out.println("7. Search for an Employee");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt(); // Read user input

			switch (choice) {
			case 1:
				// Adding an Employee
				System.out.println("\n--- Enter Employee Details ---");
				try {
				    System.out.print("Enter Employee ID: ");
				    int id = sc.nextInt();
				    sc.nextLine(); // Consume newline

				    System.out.print("Enter Employee Name: ");
				    String name = sc.nextLine();

				    System.out.print("Enter Employee Department: ");
				    String dept = sc.nextLine();

				    System.out.print("Enter Employee Salary: ");
				    double salary = sc.nextDouble();

				    Employee employee = new Employee(id, name, dept, salary, LocalDate.now());
				    service.addEmployee(employee); // Add employee to the system
				    System.out.println("Employee added successfully!"); // Success message

				} catch (Exception e) {
				    sc.nextLine(); // Clear scanner buffer to prevent infinite loop
				    System.out.println("Invalid input! Please enter correct employee details.");
				}
				break;
			case 2:
				// Displaying all Employees
				service.displayEmployee();
				break;

			case 3:
				// Removing an Employee by ID
				try {
					System.out.print("Enter Employee ID to Remove: ");
					int removeId = sc.nextInt();
					service.removeEmployee(removeId);
				} catch (Exception e) {
					sc.nextLine(); // Clear scanner buffer to prevent infinite loop
					System.out.println("Entered Invalid Employee ID. Please enter a valid ID.");
				}
				break;

			case 4:
				// Updating Employee Salary
				try {
					System.out.print("Enter Employee ID to Update Salary: ");
					int empID = sc.nextInt();
					System.out.print("Enter New Salary: ");
					double empSalary = sc.nextDouble();
					service.updateSalary(empID, empSalary);
				} catch (Exception e) {
					sc.nextLine();
					System.out.println("Entered Invalid Data. Please enter correct Data.");
				}
				break;

			case 5:
				// Filtering Employees by Department
				System.out.print("Enter Department Name: ");
				String department = sc.next(); // Read only one word
				department += sc.nextLine(); // Read the remaining line (fixes spaces issue)
				service.filterByDepartment(department.trim()); // Trim spaces
				break;

			case 6:
				// Sorting Employees by Name
				service.sortByEmployeeName();
				break;

			case 7:
				// Searching for an Employee by ID
				try {
					System.out.print("Enter Employee ID to Search: ");
					int empID = sc.nextInt();
					service.searchByEmployeeID(empID);
				} catch (Exception e) {
					sc.nextLine();
					System.out.println("Entered Invalid Data. Please enter correct Data.");
				}
				break;

			case 8:
				// Exiting the application
				System.out.println("\nThank you for using the Employee Management System.");
				System.out.println("Application is closing... Have a great day!");
				sc.close();
				System.exit(0);

			default:
				// Handling invalid menu choices
				System.out.println("Invalid Choice. Please try again.");
				break;
			}
		}
	}
}
