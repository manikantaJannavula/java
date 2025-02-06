package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieSort {
    public static void main(String[] args) {
        // Creating a list of movies
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Shutter Island", 8.2, 2010));

        // Sorting movies based on rating (low to high)
        Collections.sort(movies);

        // Printing sorted movies
        System.out.println("Movies sorted by rating (low to high):");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
