package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

class ShapeCollector {
    List<Shape> shapes = new ArrayList<>();

    public ShapeCollector(List<Shape> shapes) {
        this.shapes = shapes;
    }


    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);

    }


    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {

        String result = "";
        StringBuilder sB = new StringBuilder(result);
        for (int i = 0; i < shapes.size(); i++) {

            sB.append(shapes.get(i).getShapeName()+", ");


        }
        result = sB.toString();
        return result;
    }


}





