package com.wipro.java.usecase;

import java.util.LinkedList;
import java.util.Scanner;

// Generic Stack class that supports multiple data types
class Stack<T> {
    private LinkedList<T> list = new LinkedList<>(); // LinkedList to store stack elements

    // Push method to add an item to the top of the stack
    public void push(T item) {
        list.addFirst(item); // Add item at the beginning of the list (top of the stack)
    }

    // Pop method to remove and return the top item of the stack
    public T pop() {
        if (!isEmpty()) {
            return list.removeFirst(); // Remove and return the first element
        }
        return null; // Return null if stack is empty
    }

    // Peek method to return the top item without removing it
    public T peek() {
        if (!isEmpty()) {
            return list.getFirst(); // Return the first element without removing
        }
        return null; // Return null if stack is empty
    }

    // isEmpty method to check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty(); // Return true if list is empty, false otherwise
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer stack to store and process integer values
        Stack<Integer> integerStack = new Stack<>();

        // Read integers from the user until a non-integer is entered
        while (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();
            integerStack.push(userInput); // Push the integer onto the stack
        }

        // Perform stack operations on the integer stack
        System.out.println("Peek: " + integerStack.peek()); // Get top element
        System.out.println("Pop: " + integerStack.pop()); // Remove top element
        System.out.println("Is Empty: " + integerStack.isEmpty()); // Check if empty
        System.out.println("Pop: " + integerStack.pop()); // Remove another element
        System.out.println("Pop: " + integerStack.pop()); // Remove another element
        System.out.println("Is Empty: " + integerStack.isEmpty()); // Check if empty again

        // Skip the non-integer input to move to the next step
        scanner.nextLine();

        // String stack to store and process string values
        Stack<String> stringStack = new Stack<>();
        System.out.println("Enter strings to push onto the stack (enter 'stop' or an empty string to stop):");

        // Read strings from user input until an empty string or 'stop' is entered
        while (scanner.hasNextLine()) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty() || userInput.equalsIgnoreCase("stop")) {
                break; // Exit loop if input is empty or 'stop'
            }
            stringStack.push(userInput); // Push string onto the stack
        }

        // Perform stack operations on the string stack
        if (!stringStack.isEmpty()) {
            System.out.println("Peek: " + stringStack.peek()); // Get top string element
        }

        
        // Close scanner to prevent resource leak
        scanner.close();
    }
}
