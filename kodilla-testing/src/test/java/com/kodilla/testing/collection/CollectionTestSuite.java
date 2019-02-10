package com.kodilla.testing.collection;


import org.junit.*;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    //test on an empty list
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();

        //When
        if (emptyList.size() == 0) {
            System.out.println("The list is empty!");
        }
        ArrayList<Integer> evenNumbers = oddNumbersExterminator.exterminate(emptyList);

        //Then
        //assertTrue(evenNumbers.isEmpty());
        boolean result = evenNumbers.isEmpty();
        Assert.assertTrue(result);
        Assert.assertEquals(0, evenNumbers.size());
        System.out.println("Test completed successfully");
    }


    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> numbers = new ArrayList<>();

        int number = 0;
        for(int i=0; i < 6; i++) {
            number++;
            numbers.add(number);
        }

        //When
        ArrayList<Integer> evenNumbers = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing normal list in progress");

        //Then
        ArrayList<Integer> properList = new ArrayList<>();
        properList.add(2);
        properList.add(4);
        properList.add(6);
        assertEquals(properList, evenNumbers);
        System.out.println("Test completed successfully");
    }
}
