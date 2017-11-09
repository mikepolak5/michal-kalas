package com.kodilla.testing.shape;
import org.junit.*;
import sun.security.provider.SHA;

import java.util.*;

public class ShapeCollectorTestSuite {
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();

        Circle circle = new Circle("Circle", 12);
        shapeCollector.addFigure(circle);

        Assert.assertEquals(1, shapeCollector.figures.size());
    }
    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();

        Square square = new Square("Square", 15);
        Square square1 = new Square("Square1", 13);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(square1);
        shapeCollector.removeFigure(square);

        Assert.assertEquals(1, shapeCollector.figures.size());
    }
    @Test
    public void testGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();

        Shape theTriangle = new Triangle("Triangle", 23);
        shapeCollector.addFigure(theTriangle);
        Shape retrievedFigure = shapeCollector.getFigure(0);
        shapeCollector.getFigure(0);

        Assert.assertEquals(theTriangle, retrievedFigure);
    }
    @Test
    public void testshowFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();

        Triangle triangle = new Triangle("Triangle", 30);
        shapeCollector.addFigure(triangle);
        shapeCollector.showFigures();

        Assert.assertEquals(shapeCollector.showFigures());
    }
}

