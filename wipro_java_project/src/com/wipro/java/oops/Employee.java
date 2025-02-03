package com.wipro.java.oops;

/**
 * Plain Old Java Object(POJO) Class Animal
 * No constructor getters have return
 * Value setters have no return value properties are determined using private
 * fields values are behaviors are determined through via setters
 * toString will convert the entire animal class with properties and behaviors
 * 
 */
public class Employee {

	private int empId;// Employee ID
	private String empName;//Employee Name
	private int empAge;//employee Age
	private String empDesignation;//Employee Designation
	private float Salary;//Employee Salary
	//Getters and Setters
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	
	

}
