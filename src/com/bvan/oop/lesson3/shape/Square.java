package com.bvan.oop.lesson3.shape;

import com.bvan.oop.common.Immutable;

/**
 * @author bvanchuhov
 */
@Immutable
public class Square implements Shape {

    private final Rectangle rectangle;

    /**
     * @throws IllegalAccessException
     */
    public Square(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("negative side: " + side);
        }

        this.rectangle = new Rectangle(side, side);
    }

    @Override
    public double getPerimeter() {
        return rectangle.getPerimeter();
    }

    @Override
    public double getArea() {
        return rectangle.getArea();
    }

    public double getSide() {
        return rectangle.getWidth();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                '}';
    }
}
