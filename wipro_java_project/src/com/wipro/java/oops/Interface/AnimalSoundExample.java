package com.wipro.java.oops.Interface;

//Animal interface
interface Animal {
	void eat();
}

//DogSound interface
interface DogSound {
	void makeSound();

	void eat();
}

//CatSound interface
interface CatSound {
	void makeSound();
}

//Dog class implements Animal and DogSound interfaces
class Dog implements Animal, DogSound {
	@Override
	public void eat() {
		System.out.println("Dog is eating.");
	}

	@Override
	public void makeSound() {
		System.out.println("Dog says: Woof Woof");
	}
}

//Cat class implements Animal and CatSound interfaces
class Cat implements Animal, CatSound {
	@Override
	public void eat() {
		System.out.println("Cat is eating.");
	}

	@Override
	public void makeSound() {
		System.out.println("Cat says: Meow Meow");
	}
}

public class AnimalSoundExample {
	public static void main(String[] args) {
		// Create objects of Dog and Cat
		Animal dog = new Dog();
		Animal cat = new Cat();
		DogSound dogSound = new Dog();
		CatSound catSound = new Cat();
		// Dog behaviors
		dog.eat();
		dogSound.makeSound(); // Casting to DogSound to call makeSound()

		// Cat behaviors
		cat.eat();
		catSound.makeSound(); // Casting to CatSound to call makeSound()
	}
}
