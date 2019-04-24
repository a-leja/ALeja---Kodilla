package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import org.junit.AfterClass;
import org.junit.*;


//Test suite for ShapeCollector class' methods
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @Test
    public void testAddFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square();
        //When
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals(square, shapeCollector.getFigure(0));

    }


    @Test
    public void testRemoveFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle();
        shapeCollector.addFigure(circle);

        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapes().size());
    }


    @Test
    public void testGetFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle();
        shapeCollector.addFigure(triangle);

        //When
        Shape result = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(triangle, result);
    }


    @Test
    public void testShowFigures() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle();
        shapeCollector.addFigure(circle);

        //When
        shapeCollector.showFigures();

        //Then
    }
}
