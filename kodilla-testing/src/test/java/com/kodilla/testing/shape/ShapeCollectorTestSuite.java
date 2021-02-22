package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;


class ShapeCollectorTestSuite {


    private static int testCounter = 0;


    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Nested
    @DisplayName("addFigure tests")
    class TestAddFigure {
        @Test
        void testAddCircle() {
            //Given
            Circle circle = (new Circle(5));
            ShapeCollector collector = new ShapeCollector(new ArrayList<>());


            //When

            collector.addFigure(circle);


            //Then
            Assertions.assertEquals(1, collector.shapes.size());
            Assertions.assertEquals("Circle", circle.getShapeName());

        }

        @Test
        void testAddTriangle() {
            //Given
            Triangle triangle = new Triangle(5, 7);
            ShapeCollector collector = new ShapeCollector(new ArrayList<>());


            //When
            collector.addFigure(triangle);


            //Then
            Assertions.assertEquals(1, collector.shapes.size());
            Assertions.assertEquals("Triangle", triangle.getShapeName());

        }


        @Test
        void testAddSquare() {
            //Given
            Square square = new Square(4);
            ShapeCollector collector = new ShapeCollector(new ArrayList<>());


            //When
            collector.addFigure(square);


            //Then
            Assertions.assertEquals(1, collector.shapes.size());
            Assertions.assertEquals("Square", square.getShapeName());

        }
    }

    @Nested
    @DisplayName("removeFigure tests")
    class TestRemoveFigure {
        @Test
        void testRemoveCircle() {
            //Given
            ShapeCollector collector = new ShapeCollector(new ArrayList<>());
            Circle circle = new Circle(5);
            collector.shapes.add(circle);
            collector.shapes.add(new Triangle(5, 5));
            collector.shapes.add(new Square(4));

            //When
            collector.removeFigure(circle);

            //Than
            Assertions.assertFalse(collector.shapes.contains(circle));
            Assertions.assertEquals(2, collector.shapes.size());

        }

        @Test
        void testRemoveTriangle() {

            //Given
            ShapeCollector collector = new ShapeCollector(new ArrayList<>());
            Triangle triangle = new Triangle(6, 7);
            collector.shapes.add(triangle);
            collector.shapes.add(new Circle(5));
            collector.shapes.add(new Square(4));

            //When
            collector.removeFigure(triangle);

            //Than
            Assertions.assertFalse(collector.shapes.contains(triangle));
            Assertions.assertEquals(2, collector.shapes.size());

        }

        @Test
        void testRemoveSquare() {
            //Given
            ShapeCollector collector = new ShapeCollector(new ArrayList<>());
            Square square = new Square(9);
            collector.addFigure(square);
            collector.addFigure(new Circle(5));
            collector.addFigure(new Square(4));

            //When
            collector.removeFigure(square);

            //Than
            Assertions.assertFalse(collector.shapes.contains(square));
            Assertions.assertEquals(2, collector.shapes.size());
        }

        @Test
        void testRemoveNotExistingShape() {
            //Given
            ShapeCollector collector = new ShapeCollector(new ArrayList<>());
            Square square = new Square(9);
            collector.addFigure(square);
            collector.addFigure(new Circle(5));
            collector.addFigure(new Square(4));
            collector.shapes.remove(square);

            //When

            boolean result = collector.shapes.remove(square);

            //Than
            Assertions.assertFalse(result);

        }
    }

    @DisplayName(" getFigure test")
    @Test
    void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector(new ArrayList<>());
        Circle circle = new Circle(5);
        collector.shapes.add(0, circle);
        //When
        collector.getFigure(0);
        //Than
        Assertions.assertEquals(circle, collector.shapes.get(0));
    }

    @DisplayName(" showFigures should return names of all figures in the list as one String")
    @Test
    void tesShowFigures() {
        //Given


        ShapeCollector collector = new ShapeCollector(new ArrayList<>());
        Circle circle = new Circle(5);
        Square square = new Square(6);
        Triangle triangle = new Triangle(4, 9);
        collector.shapes.add(circle);
        collector.shapes.add(square);
        collector.shapes.add(triangle);

        //When
        String result = collector.showFigures();

        //Than
        Assertions.assertEquals("Circle, Square, Triangle", result);
    }

    @Test
    void tesShowFiguresEmpty() {
        //Given


        ShapeCollector collector = new ShapeCollector(new ArrayList<>());

        //When
        String result = collector.showFigures();

        //Than
        Assertions.assertEquals("", result);


    }

}

