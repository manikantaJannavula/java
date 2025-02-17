package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapUseCase {

    public static void main(String[] args) {
        // Step 1: Create a TreeMap instance
        // TreeMap stores elements in a sorted order based on keys (ascending order by default).
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        map.put(1, "Manikanta");
        map.put(3, "Mounica");
        map.put(5, "Ram Prakash");
        map.put(2, "Preeti");
        map.put(4, "Pratik");

        // Step 2: Displaying elements from TreeMap
        // Since TreeMap sorts elements based on keys, output will be in ascending order of keys.
        System.out.println("Data from TreeMap (sorted by key):");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Adding a separator for readability
        System.out.println("\n-----------------------------\n");

        // Step 3: Creating a HashMap instance
        // HashMap stores elements in an unordered manner based on keys.
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Step 4: Copying all entries from TreeMap to HashMap
        // This operation does not maintain any specific order in HashMap.
        hashMap.putAll(map);

        // Step 5: Displaying elements from HashMap
        // Note: HashMap does not maintain any specific order.
        System.out.println("Data from HashMap (unordered):");
        for (Map.Entry<Integer, String> entry1 : hashMap.entrySet()) {
            System.out.println("ID: " + entry1.getKey() + ", Name: " + entry1.getValue());
        }

        // Adding a separator for readability
        System.out.println("\n-----------------------------\n");

        // Step 6: Sorting HashMap by values instead of keys
        // HashMap does not provide built-in sorting, so we use an intermediate list.
        System.out.println("HashMap Sorted by Values:");
        
        // Convert HashMap entries to a list for sorting
        ArrayList<Map.Entry<Integer, String>> list = new ArrayList<>(hashMap.entrySet());

        // Sorting the list based on values (names) in ascending order
        list.sort(Map.Entry.comparingByValue());

        // Creating a LinkedHashMap to store sorted elements while maintaining insertion order
        LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Displaying sorted HashMap based on values
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
