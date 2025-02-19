	package com.wipro.java.collection;
	
	import java.util.*;
	
	class Passenger {
		String name;
		int age;
		String seatType; // AC, Sleeper, General
	
		public Passenger(String name, int age, String seatType) {
			this.name = name;
			this.age = age;
			this.seatType = seatType;
		}
	
		@Override
		public String toString() {
			return "Name: " + name + " | Age: " + age + " | Seat Type: " + seatType;
		}
	}
	
	public class LinkedListUsecase {
		public static void main(String[] args) {
			LinkedList<Passenger> passengerList = new LinkedList<>();
			Scanner scanner = new Scanner(System.in);
	
			while (true) {
				System.out.println("\nTrain Reservation System ");
				System.out.println("1️ Book Ticket (Add Passenger)");
				System.out.println("2️ View Passengers");
				System.out.println("3️ Search Passenger");
				System.out.println("4️ Update Passenger Details");
				System.out.println("5️ Cancel Ticket (Remove Passenger)");
				System.out.println("6️ Sort Passengers (A-Z)");
				System.out.println("7️ Exit");
				System.out.print("🔹 Choose an option: ");
				int choice = scanner.nextInt();
				scanner.nextLine(); // Consume newline
	
				switch (choice) {
				case 1: // Add Passenger
					System.out.print("Enter Name: ");
					String name = scanner.nextLine();
					System.out.print("Enter Age: ");
					int age = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter Seat Type (AC/Sleeper/General): ");
					String seatType = scanner.nextLine();
					passengerList.add(new Passenger(name, age, seatType));
					System.out.println("Ticket Booked Successfully!");
					break;
	
				case 2: // View Passengers
					System.out.println("\nPassenger List:");
					if (passengerList.isEmpty()) {
						System.out.println("No Passengers Found!");
					} else {
						for (Passenger p : passengerList) {
							System.out.println(p);
						}
					}
					break;
	
				case 3: // Search Passenger
					System.out.print("Enter Name to Search: ");
					String searchName = scanner.nextLine();
					boolean found = false;
					for (Passenger p : passengerList) {
						if (p.name.equalsIgnoreCase(searchName)) {
							System.out.println("Passenger Found: " + p);
							found = true;
							break;
						}
					}
					if (!found)
						System.out.println("Passenger Not Found!");
					break;
	
				case 4: // Update Passenger
					System.out.print("Enter Name to Update: ");
					String updateName = scanner.nextLine();
					boolean updated = false;
					for (Passenger p : passengerList) {
						if (p.name.equalsIgnoreCase(updateName)) {
							System.out.print("Enter New Age: ");
							p.age = scanner.nextInt();
							scanner.nextLine();
							System.out.print("Enter New Seat Type: ");
							p.seatType = scanner.nextLine();
							System.out.println("Passenger Details Updated!");
							updated = true;
							break;
						}
					}
					if (!updated)
						System.out.println("Passenger Not Found!");
					break;
	
				case 5: // Remove Passenger
					System.out.print("Enter Name to Cancel Ticket: ");
					String removeName = scanner.nextLine();
					boolean removed = passengerList.removeIf(p -> p.name.equalsIgnoreCase(removeName));
					if (removed) {
						System.out.println("Ticket Cancelled!");
					} else {
						System.out.println("Passenger Not Found!");
					}
					break;
	
				case 6: // Sort Passengers
					passengerList.sort(Comparator.comparing(p -> p.name));
					System.out.println("Passengers Sorted!");
					break;
	
				case 7: // Exit
					System.out.println("Exiting Train Reservation System...");
					scanner.close();
					System.exit(0);
	
				default:
					System.out.println("Invalid Option! Try Again.");
				}
			}
		}
	}
