package com.wipro.java.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers1 = Arrays.asList(5, 2, 1, 3, 4);
        List<Integer> numbers2 = Arrays.asList(10, 30, 20, 50, 69);
        
        // Sorting the list in ascending order using streams
        List<Integer> sortedNumbers = numbers1.stream()
                                             .sorted()
                                             .collect(Collectors.toList());
        System.out.println("Sorted numbers of numbers1 (Ascending Order): " + sortedNumbers);
        
        // Sorting the list in descending order using streams
                                             .sorted(Comparator.reverseOrder())
                                             .collect(Collectors.toList());
        System.out.println("Sorted numbers of numbers1 (Descending Order): " + sortedNumbers1);
        
        // Finding the minimum value from numbers2 list
        int min = numbers2.stream().min(Integer::compare).orElseThrow();
        
        // Finding the maximum value from numbers2 list
        int max = numbers2.stream().max(Integer::compare).orElseThrow();
        
        // Printing the minimum and maximum values
        System.out.println("Minimum value in numbers2: " + min);
        System.out.println("Maximum value in numbers2: " + max);
    }
}
