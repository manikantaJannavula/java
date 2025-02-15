package com.wipro.java.designpattern.prototype.Caching;

import com.wipro.java.designpattern.prototype.Caching.cache.BundledShapeCache;
import com.wipro.java.designpattern.prototype.shapes.Shape;

/**
 * Main class to demonstrate Prototype Pattern with Caching.
 */
public class Main {
    public static void main(String[] args) {
        // Initialize the shape cache
        BundledShapeCache cache = new BundledShapeCache();

        // Retrieve cloned shapes from the cache
        Shape shape1 = cache.get("Big green circle");  // Cloned circle
        Shape shape2 = cache.get("Medium blue rectangle"); // Cloned rectangle
        Shape shape3 = cache.get("Medium blue rectangle"); // Another cloned rectangle

        // Check if circle and rectangle are different objects
        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big green circle != Medium blue rectangle (yay!)");
        } else {
            System.out.println("Big green circle == Medium blue rectangle (booo!)");
        }

        // Check if two rectangles retrieved from cache are different objects
        if (shape2 != shape3) {
            System.out.println("Medium blue rectangles are two different objects (yay!)");
            
            // Verify if the two rectangle clones have the same attributes
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Rectangle objects are the same (booo!)");
        }
    }
}
