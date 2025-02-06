package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Custom comparator to sort movies by their release year in ascending order (Oldest to Newest)
public class YearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return Integer.compare(m1.getYear(), m2.getYear()); // Sorting by year in ascending order
    }

    public static void main(String[] args) {
        // Creating a list to store Movie objects
        List<Movie> movies = new ArrayList<>();
        
        // Adding movies to the list
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Shutter Island", 8.2, 2010));

        // Sorting movies using YearComparator (Oldest to Newest)
        Collections.sort(movies, new YearComparator());

        // Displaying the sorted list of movies
        System.out.println("Movies sorted by Year (Oldest to Newest):");
        for (Movie movie : movies) {
            System.out.println(movie); // Assuming Movie class has a proper toString() method
        }
    }
}
