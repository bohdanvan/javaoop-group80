package com.bvan.oop.lesson4.shape;

/**
 * @author bvanchuhov
 */
public class Circle implements NameableShape {

    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius should be > 0: " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getName() {
        return "circle";
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
