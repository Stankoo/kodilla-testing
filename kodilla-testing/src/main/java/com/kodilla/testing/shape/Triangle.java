package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double a = 0.0;
    double h = 0.0;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return a*h;
    }
}
