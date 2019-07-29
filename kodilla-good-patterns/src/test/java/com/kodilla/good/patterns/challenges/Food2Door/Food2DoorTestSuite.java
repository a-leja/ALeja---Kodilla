package com.kodilla.good.patterns.challenges.Food2Door;

import org.junit.Assert;
import org.junit.Test;

public class Food2DoorTestSuite {

    @Test
    public void healthyShopTest() {
        //Given
        HealthyShop healthyShop = new HealthyShop();
        //When
        Order healthyShopOrder = new Order(new Product("BIO Chia seeds"), 12);
        boolean result = healthyShop.process(healthyShopOrder);
        //Then
        Assert.assertEquals(false, result);
    }

    @Test
    public void glutenFreeShopTest() {
        //Given
        GlutenFreeShop glutenFreeShop= new GlutenFreeShop();
        //When
        Order glutenFreeShopOrder = new Order(new Product("Gluten-free Oatmeal"), 1);
        boolean result = glutenFreeShop.process(glutenFreeShopOrder);
        //Then
        Assert.assertEquals(true, result);
    }

    @Test
    public void extraFoodShopTest() {
        //Given
        ExtraFoodShop extraFoodShop= new ExtraFoodShop();
        //When
        Order extraFoodShopOrder = new Order(new Product("BIO Banana"), 1);
        boolean result = extraFoodShop.process(extraFoodShopOrder);
        //Then
        Assert.assertEquals(true, result);
    }
}