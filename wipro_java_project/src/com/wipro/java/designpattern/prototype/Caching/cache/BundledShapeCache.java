package com.wipro.java.designpattern.prototype.Caching.cache;

import java.util.HashMap;
import java.util.Map;

import com.wipro.java.designpattern.prototype.shapes.Circle;
import com.wipro.java.designpattern.prototype.shapes.Rectangle;
import com.wipro.java.designpattern.prototype.shapes.Shape;

/**
 * The BundledShapeCache class stores pre-configured shape objects in a cache.
 * When retrieving a shape, it returns a clone instead of the original object.
 */
public class BundledShapeCache {
    // A HashMap to store shape objects with a unique key
    private Map<String, Shape> cache = new HashMap<>();

    /**
     * Constructor initializes the cache with predefined shapes.
     */
    public BundledShapeCache() {
        // Creating a pre-configured Circle object
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        // Creating a pre-configured Rectangle object
        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        // Adding shapes to cache with unique keys
        cache.put("Big green circle", circle);
        cache.put("Medium blue rectangle", rectangle);
    }

    /**
     * Adds a new shape to the cache.
     * 
     * @param key   The unique identifier for the shape.
     * @param shape The shape object to store in the cache.
     * @return The stored shape object.
     */
    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    /**
     * Retrieves a clone of the stored shape object using its key.
     * 
     * @param key The key for the shape.
     * @return A cloned instance of the shape.
     */
    public Shape get(String key) {
        return cache.get(key).clone();  // Ensures cloned objects are returned
    }
}
