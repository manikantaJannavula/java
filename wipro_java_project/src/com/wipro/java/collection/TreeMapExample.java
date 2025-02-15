package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        // Creating a TreeMap which will automatically sort entries by keys in ascending order
        TreeMap<Integer, String> map = new TreeMap<>();
        
        // Adding key-value pairs to TreeMap
        map.put(2, "Pratik");
        map.put(1, "Mounica");
        map.put(4, "Preeti");
        map.put(3, "Ram Prakash");
        map.put(5, "Manikanta");

        // Retrieving a specific value using key
        String value = map.get(5);
        System.out.println("Value for key 5: " + value);

        // Displaying TreeMap, which is sorted by keys in ascending order by default
        System.out.println("Sorted TreeMap Elements are: " + map);

        // Sorting the TreeMap entries based on values instead of keys
        System.out.println("Original TreeMap (Sorted by Values):");

        // Step 1: Convert TreeMap entries into a List for sorting
        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());

        // Step 2: Sort the list based on values using a comparator
        list.sort(Map.Entry.comparingByValue());

        // Step 3: Store sorted data in a LinkedHashMap to maintain insertion order
        LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Printing the sorted map (sorted by values)
        System.out.println("TreeMap sorted by Values: " + sortedMap);
    }
}
