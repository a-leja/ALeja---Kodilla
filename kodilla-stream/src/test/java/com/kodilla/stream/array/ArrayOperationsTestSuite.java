package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int randomNumbers = [1, 3, 12, 4, 19, 34, 2, 6, 0, 55, 78, 43, 8, 66, 43, 77, 99, 32, 3, 88];
        // expectedAverage = 550/20
        double expectedAverage = 27.5;

        //When
        double average = ArrayOperations.getAverage(randomNumbers);

        //Then
        Assert.assertEquals(expectedAverage, average, 0);
    }
}
