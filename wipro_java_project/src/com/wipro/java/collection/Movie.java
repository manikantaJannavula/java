package com.wipro.java.collection;

// POJO class implementing Comparable
class Movie implements Comparable<Movie> {
	private String name;// Movie Name Property
	private double rating;// rating Property
	private int year;// Year Property

	// Constructor
	public Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	// Getters
	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}

	// Sorting logic: Sort by rating (lower to higher)
	@Override
	public int compareTo(Movie other) {
		return Double.compare(this.rating, other.rating); // Ascending order
	}

	// toString method for printing
	@Override
	public String toString() {
		return name + " (" + year + ") - Rating: " + rating;
	}

}
