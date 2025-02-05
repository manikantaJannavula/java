package com.wipro.java.exception;

public class ExceptionClass {
	String s="Manikanta -Jannavula";
	public static void main(String[] args) {
		int num1=10,num2=0;
		//Handling Arithmetic Exceptions
		try {
			int num3=num1/num2;
			System.out.println(num3);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.toString());
		}finally {
			System.out.println("I am the Follower of try and catch block");
		}
		System.out.println("\n----------------------\n");
		
		
		//Handling Null Pointer Exception
		try {
			ExceptionClass ex=null;
			System.out.println(ex.s);
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.toString());
		}finally {
			System.out.println("I am the Follower of try and catch block");
		}
		
		
		
	}

}
