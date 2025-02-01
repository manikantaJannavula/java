/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class MyClass {

	int num = 5;

//Called Method
	public void changeValue(int num) {
		this.num = num;
	}

	public static void main(String[] args) {
		MyClass obj = new MyClass();// creating Object for MyClass
		obj.changeValue(10);// Calling ChangeValue Method
		System.out.println(obj.num);
	}
}
