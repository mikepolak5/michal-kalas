package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    List<Shape> figures = new ArrayList<>();




    public void addFigure(Shape shape){
        figures.add(shape);
    }
    public void removeFigure (Shape shape) {
        figures.remove(shape);
    }
    public Shape getFigure(int n){
        return figures.get(n);
    }
    public void showFigures() {
        System.out.println();
    }
}
