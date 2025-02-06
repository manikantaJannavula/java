package com.wipro.java.collection;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array Operations
        System.out.println("Enter Max Range of an Array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter Elements to an Array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array Elements:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println("\n-------------");

        // List Operations
        List<Integer> l1 = new ArrayList<>();
        System.out.println("Enter the maximum number of elements you want to enter in List 1:");
        int listSize1 = sc.nextInt();

        System.out.println("Enter elements for ArrayList 1:");
        for (int i = 0; i < listSize1; i++) {
            l1.add(sc.nextInt());
        }
        System.out.println("List 1: " + l1);

        System.out.println("Enter the maximum number of elements you want to enter in List 2:");
        List<Integer> l2 = new ArrayList<>();
        int listSize2 = sc.nextInt();

        System.out.println("Enter elements for ArrayList 2:");
        for (int j = 0; j < listSize2; j++) {
            l2.add(sc.nextInt());
        }
        System.out.println("List 2: " + l2);

        l1.addAll(1, l2);
        System.out.println("List 1 after adding List 2 at index 1: " + l1);

        l1.remove(1);
        System.out.println("List 1 after removing the element at index 1: " + l1);

        l1.set(0, 5);
        System.out.println("List 1 after setting first element to 5: " + l1);

        System.out.println("\n-------------");

        // LinkedList Operations
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("Enter the maximum number of elements you want to enter in LinkedList:");
        int linkedListSize = sc.nextInt();

        System.out.println("Enter elements for LinkedList:");
        for (int i = 0; i < linkedListSize; i++) {
            linkedList.add(sc.nextInt());
        }
        System.out.println("LinkedList before deletion: " + linkedList);

        if (linkedListSize > 3) {
            linkedList.remove(3);
            System.out.println("LinkedList after removing element at index 3: " + linkedList);
        } else {
            System.out.println("Skipping deletion: LinkedList has less than 4 elements.");
        }

        System.out.print("Elements in LinkedList: ");
        for (int num : linkedList) {
            System.out.print(num + " ");
        }
        System.out.println("\n-------------");

        // HashMap Operations
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        map.put(5,"Orange");
        System.out.println("Initial HashMap: " + map);
        System.out.println("Value for key 2: " + map.get(2));

        map.remove(3);
        System.out.println("HashMap after removing key 3: " + map);

        if (map.containsValue("Date")) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals("Date")) {
                    System.out.println("Key for 'Date': " + entry.getKey());
                    break;
                }
            }
        }

        System.out.println("Iterating through HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}
