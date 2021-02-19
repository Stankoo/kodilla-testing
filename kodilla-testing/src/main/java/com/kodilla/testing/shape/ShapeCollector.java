package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.List;

 class ShapeCollector {
    public List<Shape> shapes = new ArrayList<>();

     public ShapeCollector(List<Shape> shapes) {
         this.shapes = shapes;
     }


     public void addFigure(Shape shape){
shapes.add(shape);
    }
    public void removeFigure(Shape shape){
        shapes.remove(shape);

    }
    public void getFigure(int n){


    }
    public String showFigures(){



      }


    }




