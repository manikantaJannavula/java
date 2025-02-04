package com.wipro.java.exception;

import java.util.Scanner;

public class HotelBookingSystem {
    private int availableRooms = 3; // Assume only 3 rooms are available

    // Method to Book a Room (Handling Checked Exception Internally)
    public void bookRoom(int roomsToBook) {
        try {
            if (roomsToBook > availableRooms) {
                throw new Exception("Booking failed! Only " + availableRooms + " rooms available.");
            }
            availableRooms -= roomsToBook;
            System.out.println("Booking successful! Remaining rooms: " + availableRooms);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelBookingSystem hotel = new HotelBookingSystem();

        try {
            System.out.print("Enter number of rooms to book: ");
            String input = scanner.next(); // User input (May cause NumberFormatException)
            int rooms = Integer.parseInt(input); // Converts input to integer

            hotel.bookRoom(rooms); // Call the booking method
        } //Handling Unchecked Exception
        catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } 
        finally {
            System.out.println("Thank you for using our Hotel Booking System!");
        }

        scanner.close();
    }
}

