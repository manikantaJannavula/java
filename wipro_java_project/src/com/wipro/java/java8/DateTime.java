package com.wipro.java.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class DateTime {
	public static void checkDateAdjusters() {
		// to get Current Date
		LocalDate date = LocalDate.now();
		System.out.println("\nthe Current Date is:" + date);
		// to get Current Date and Time
		LocalDateTime dateAndTime = LocalDateTime.now();
		System.out.println("\nthe Current Date and Time:" + dateAndTime);
		// Get the current time
		LocalTime currentTime = LocalTime.now();

		// Print the current time
		System.out.println("\nCurrent time:" + currentTime);
		
		// to get the firstDay of Next Month
		LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("\nfirstDayofNextMonth :" + dayOfNextMonth);
		// Get the name of the day (e.g., "Monday", "Tuesday")
		String dayOfWeek = date.getDayOfWeek().toString();
		System.out.println("\nGet the name of the  current Day:"+dayOfWeek);
	}

	public static void main(String[] args) {
		DateTime.checkDateAdjusters();

	}
}
