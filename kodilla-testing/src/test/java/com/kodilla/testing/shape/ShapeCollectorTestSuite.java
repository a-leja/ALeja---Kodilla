package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import org.junit.AfterClass;
import org.junit.*;

import java.awt.*;


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
    public void testAddFigure(Shape shape) {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square;
        //When
        boolean result = shapeCollector.addFigure(Square);
        //Then
        Assert.assertTrue(result);

    };


    @Test
    public void testRemoveFigure(Shape shape) {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector.addFigure(Circle);

        //When
        boolean result = shapeCollector.removeFigure(Circle);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.size())
    };


    @Test
    public void testGetFigure(int n) {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle();
        shapeCollector.addFigure(Triangle);

        //When
        boolean result = shapeCollector.getFigure(Triangle);

        //Then
        Assert.assertEquals(Triangle, result);
    };


    @Test
    public void testShowFigures() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector.addFigure(Circle);

        //When
        boolean result = shapeCollector.showFigures();
        //Then
        Assert.assertTrue(result);

    };
}
