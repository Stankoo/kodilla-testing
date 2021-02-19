package com.kodilla.testing.shape;

public class Square implements Shape{
double a = 0.0;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return a*a;
    }
}
