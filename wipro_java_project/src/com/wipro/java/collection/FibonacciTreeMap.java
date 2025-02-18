package com.wipro.java.collection;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FibonacciTreeMap {
    public static void main(String[] args) {
        // Step 1: Create a TreeMap to store Fibonacci numbers
        TreeMap<Integer, Integer> fibonacciMap = new TreeMap<>();

        // Step 2: Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        // Step 3: Generate Fibonacci series and store in TreeMap
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            fibonacciMap.put(i, a);  // Store in TreeMap (Position -> Fibonacci number)
            int next = a + b;  // Calculate next Fibonacci number
            a = b;
            b = next;
        }

        // Step 4: Print the Fibonacci series
        System.out.println("Fibonacci Series stored in TreeMap:");
        for (Map.Entry<Integer, Integer> entry : fibonacciMap.entrySet()) {
            System.out.println("Position " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
