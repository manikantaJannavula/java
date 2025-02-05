package com.wipro.java.exception;

import java.util.Scanner;

/**
 * Handling Unchecked Exception
 */
public class UnCheckedException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your 4-digit PIN: ");
        String pin = scanner.next(); // User input

        try {
            int pinNumber = Integer.parseInt(pin); // Might throw NumberFormatException
            System.out.println("PIN Verified Successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid PIN! Please enter only numbers.");
        }
    }
}
