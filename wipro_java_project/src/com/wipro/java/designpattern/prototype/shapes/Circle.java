package com.wipro.java.designpattern.prototype.shapes;

/**
 * Concrete class representing a Circle.
 * It extends the Shape class and adds a radius property.
 */
public class Circle extends Shape {
    public int radius; // Radius of the circle

    /**
     * Default constructor.
     */
    public Circle() {
    }

    /**
     * Copy constructor that creates a new Circle by copying an existing one.
     * Calls the parent constructor to copy common attributes (x, y, color).
     * @param target The Circle to copy.
     */
    public Circle(Circle target) {
        super(target); // Calls the copy constructor of Shape
        if (target != null) {
            this.radius = target.radius; // Copies the radius
        }
    }

    /**
     * Implements the clone method to return a copy of the Circle.
     * @return A new Circle object with the same properties.
     */
    @Override
    public Shape clone() {
        return new Circle(this);
    }

    /**
     * Overrides equals() to check if two circles are identical.
     * @param object2 The object to compare with.
     * @return true if both Circles have the same attributes, otherwise false.
     */
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2))
            return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
