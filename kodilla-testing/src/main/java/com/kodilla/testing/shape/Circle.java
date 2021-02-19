package com.kodilla.testing.shape;

public class Circle implements Shape{
    double r = 0;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.PI*r*r;
    }
}
