package com.wipro.java.oops.inheritance;

import com.wipro.java.oops.Employee;

/**
 * Parent Class= Employee Child class =ProjectLead Extends =is a keyword
 */
public class ProjectLead extends Employee {

	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] a) {
		// child object is instantiated from child constructor
		// parent class consumes the prop and behaviors of child class

		Employee employee = new ProjectLead();
		employee.setEmpName("Manikanta");
		employee.setEmpId(1234);
		employee.setEmpAge(47);
		employee.setEmpDesignation("Project Lead");
		employee.setSalary(5000f);

		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpAge());
		System.out.println(employee.getEmpDesignation());
		System.out.println(employee.getSalary());
	}
}
