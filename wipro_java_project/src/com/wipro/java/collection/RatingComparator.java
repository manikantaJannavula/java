package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Custom comparator to sort movies by their rating in ascending order (Low to High)
public class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return Double.compare(m1.getRating(), m2.getRating()); // Sorting by rating in ascending order
    }

    public static void main(String[] args) {
        // Creating a list to store Movie objects
        List<Movie> movies = new ArrayList<>();
        
        // Adding movies to the list
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Shutter Island", 8.2, 2010));

        // Sorting movies using RatingComparator (Low to High)
        Collections.sort(movies, new RatingComparator());

        // Displaying the sorted list of movies
        System.out.println("Movies sorted by Rating (Low to High):");
        for (Movie movie : movies) {
            System.out.println(movie); // Assuming Movie class has a proper toString() method
        }
    }
}
