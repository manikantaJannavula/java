package com.wipro.java.oops.encapsulation;

public class Animal {

	public Animal(String name, int age) {
		super();// calls the root parent class=object
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("age must be Positive");
		}

	}

	public static void main(String a[]) {

		Animal animal = new Animal("Dog", 15);
		System.out.println(animal.getAge());
		System.out.println(animal.getName());

		animal.setAge(30);
		System.out.println(animal.getAge());
		System.out.println(animal.getName());
		animal.setAge(-5);

	}

}
