package com.wipro.java.oops;

/**
 * Plain Old Java Object(POJO) Class Animal
 * No constructor getters have return
 * Value setters have no return value properties are determined using private
 * fields values are behaviors are determined through via setters
 * toString will convert the entire animal class with properties and behaviors
 * 
 */
class Animal {
	// private properties=structure
	private String name;// Animal Name
	private String color;
	private int age;// Animal Age
	private String breed;// Animal Breed
	private int weight;// Animal Weight

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	// Overriding toString() method
	@Override
	public String toString() {
		return "Animal { " + "name='" + name + '\'' + ", color='" + color + '\'' + ", age=" + age + ", breed='" + breed
				+ '\'' + ", weight=" + weight + " }";
	}

}
