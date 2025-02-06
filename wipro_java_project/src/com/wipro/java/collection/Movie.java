package com.wipro.java.collection;

import java.util.*;
import java.util.Collections;

// POJO class implementing Comparable
class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

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

    public static void main(String[] args) {
        // Creating a list of movies
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Shutter Island", 8.2, 2010));

        // Sorting movies based on rating
        Collections.sort(movies);  // <-- No error now

        // Printing sorted movies
        System.out.println("Movies sorted by rating (high to low):");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
