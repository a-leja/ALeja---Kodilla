package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(6,6);
        double subResult = calculator.sub(6,6);
        double mulResult = calculator.mul(6,6);
        double divResult = calculator.div(6,6);
        //Then
        Assert.assertEquals(12, addResult,0.01);
        Assert.assertEquals(0, subResult,0.01);
        Assert.assertEquals(36, mulResult,0.01);
        Assert.assertEquals(1, divResult,0.01);
    }
}
