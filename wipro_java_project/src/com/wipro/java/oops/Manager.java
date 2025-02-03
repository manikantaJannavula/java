package com.wipro.java.oops;

/**
 * Parent Class= Employee Child class =Manager Extends =is a keyword
 */
public class Manager extends Employee {

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] a) {
		// child object is instantiated from child constructor
		// parent class consumes the prop and behaviors of child class

		Employee employee = new Manager();
		employee.setEmpName("Manikanta");
		employee.setEmpId(1235);
		employee.setEmpAge(47);
		employee.setEmpDesignation("Manager");
		employee.setSalary(5000f);

		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpAge());
		System.out.println(employee.getEmpDesignation());
		System.out.println(employee.getSalary());
	}

}
