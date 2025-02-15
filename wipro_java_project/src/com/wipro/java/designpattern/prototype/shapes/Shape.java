package com.wipro.java.designpattern.prototype.shapes;

import java.util.Objects;

/**
 * Abstract class representing a generic shape.
 * It provides basic attributes like position (x, y) and color.
 * Also, it defines an abstract clone method for creating copies.
 */
public abstract class Shape {
    public int x;       // X-coordinate of the shape
    public int y;       // Y-coordinate of the shape
    public String color; // Color of the shape

    /**
     * Default constructor.
     */
    public Shape() {
    }

    /**
     * Copy constructor that creates a new shape based on an existing one.
     * @param target The shape to copy.
     */
    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    /**
     * Abstract method to be implemented by subclasses for cloning.
     * @return A cloned instance of the shape.
     */
    public abstract Shape clone();

    /**
     * Checks if another shape is equal to this shape.
     * @param object2 The object to compare with.
     * @return true if both shapes have the same attributes, otherwise false.
     */
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape))
            return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
