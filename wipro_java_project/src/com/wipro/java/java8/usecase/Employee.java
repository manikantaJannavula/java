package com.wipro.java.java8.usecase;

import java.time.LocalDate;

/**
 * Represents an Employee entity with attributes such as ID, Name, Department,
 * Salary, and Joining Date. Provides getter and setter methods to access and
 * modify employee details. Implements a toString() method for easy
 * representation of Employee data.
 */
public class Employee {

	private int id; // Unique identifier for the employee
	private String name; // Employee's name
	private String department; // Employee's department
	private double salary; // Employee's salary
	private LocalDate joiningDate; // Date when the employee joined the company

	/**
	 * Constructor to initialize an Employee object.
	 *
	 * @param id          Employee ID
	 * @param name        Employee Name
	 * @param department  Employee Department
	 * @param salary      Employee Salary
	 * @param joiningDate Employee Joining Date
	 */
	public Employee(int id, String name, String department, double salary, LocalDate joiningDate) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	// Getter and Setter methods for Employee attributes

	/**
	 * Gets the Employee ID.
	 * 
	 * @return Employee ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the Employee ID.
	 * 
	 * @param id Employee ID
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the Employee Name.
	 * 
	 * @return Employee Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the Employee Name.
	 * 
	 * @param name Employee Name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the Employee Department.
	 * 
	 * @return Employee Department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the Employee Department.
	 * 
	 * @param department Employee Department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Gets the Employee Salary.
	 * 
	 * @return Employee Salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Sets the Employee Salary.
	 * 
	 * @param salary Employee Salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * Gets the Employee Joining Date.
	 * 
	 * @return Employee Joining Date
	 */
	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	/**
	 * Sets the Employee Joining Date.
	 * 
	 * @param joiningDate Employee Joining Date
	 */
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	/**
	 * Provides a string representation of the Employee object.
	 * 
	 * @return A formatted string containing Employee details
	 */
	@Override
	public String toString() {
		return "Employee { ID=" + id + ", Name='" + name + "', Department='" + department + "', Salary=" + salary
				+ ", Joining Date=" + joiningDate + " }";
	}
}
