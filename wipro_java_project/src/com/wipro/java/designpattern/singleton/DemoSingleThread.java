package com.wipro.java.designpattern.singleton;

/**
 * Demo class to test Singleton behavior in a single-threaded environment.
 */
public class DemoSingleThread {

    public static void main(String[] args) {
        // Display introductory message explaining Singleton behavior
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        // Create the first Singleton instance with value "FOO"
        Singleton singleton = Singleton.getInstance("FOO");

        // Try to create another Singleton instance with value "BAR"
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        // Print values of both instances
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
