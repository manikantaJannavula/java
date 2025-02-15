package com.wipro.java.designpattern.prototype.shapes;

/**
 * The Rectangle class extends the Shape class and adds properties 
 * specific to rectangles, such as width and height.
 */
public class Rectangle extends Shape {
    public int width;
    public int height;

    /**
     * Default constructor.
     */
    public Rectangle() {
    }

    /**
     * Copy constructor that clones attributes from an existing Rectangle.
     * Calls the parent constructor to copy common shape properties.
     * 
     * @param target The rectangle to copy from.
     */
    public Rectangle(Rectangle target) {
        super(target); // Calls the Shape copy constructor
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    /**
     * Clones the current Rectangle object.
     * 
     * @return A new Rectangle object that is a copy of the current instance.
     */
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    /**
     * Checks if two Rectangle objects are equal based on width, height, and parent shape properties.
     * 
     * @param object2 The object to compare with.
     * @return true if the objects have the same values, false otherwise.
     */
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2))
            return false;
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.height == height;
    }
}
