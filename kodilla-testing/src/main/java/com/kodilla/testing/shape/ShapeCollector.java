package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

class ShapeCollector {
    public List<Shape> shapes = new ArrayList<>();

    public ShapeCollector(List<Shape> shapes) {
        this.shapes = shapes;
    }


    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);

    }


    public void getFigure(int n) {


    }

    public String showFigures() {

        String result = "";
        for (int i = 0; i < shapes.size(); i++) {
            result += shapes.get(i).getShapeName();

            if (i < shapes.size() - 1)
                result += ", ";

        }
        return result;
    }


}





