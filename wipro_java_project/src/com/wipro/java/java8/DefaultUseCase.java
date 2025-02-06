package com.wipro.java.java8;

// Interface 1 with a default method
interface TestInterface1 {
    // Default method in TestInterface1
    default void show() {
        System.out.println("I am from Default TestInterface1");
    }
}

// Interface 2 with a default method
interface TestInterface2 {
    // Default method in TestInterface2
    default void show() {
        System.out.println("I am from Default TestInterface2");
    }
}

// Main class implementing both TestInterface1 and TestInterface2
public class DefaultUseCase implements TestInterface1, TestInterface2 {

    // Overriding the show method
    @Override
    public void show() {
        // Using 'super' to call the show method of TestInterface1
        TestInterface1.super.show();
        
        // Using 'super' to call the show method of TestInterface2
        TestInterface2.super.show();
    }

    // Main method
    public static void main(String[] args) {
        // Creating an instance of DefaultUseCase
        DefaultUseCase d = new DefaultUseCase();
        
        // Calling the show method
        d.show();
    }
}
