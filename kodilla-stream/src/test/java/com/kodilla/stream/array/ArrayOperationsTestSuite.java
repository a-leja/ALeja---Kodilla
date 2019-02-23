package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;
import java.util.Random;


public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] randomNumbers = new int[20];
        int sum = 0;
        Random generator = new Random();

        for (int i = 0; i <= 20; i++) {
            randomNumbers[i] = generator.nextInt(20);
            sum += randomNumbers[i];
        }

        //When
        double expectedAvg = sum/randomNumbers.length;
        double actualAvg = ArrayOperations.getAverage(randomNumbers);

        //Then
        Assert.assertEquals(expectedAvg, actualAvg, 0.01);
    }
}
