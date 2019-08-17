package com.kodilla.patterns2.decorator.pizza;

import static org.junit.Assert.*;

import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void HawaiianPizzaWithAdditionalCheeseTest() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HawaiianPizza(pizzaOrder);
        pizzaOrder = new AdditionalCheese(pizzaOrder);
        //When
        BigDecimal price = pizzaOrder.getPrice();
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(35.50), price);
        assertEquals("Ingredients: thin dough, tomato sauce, cheese, pineapple, ham, onion, double cheese option", description);

    }

    @Test
    public void SalamiPizzaWithTwoSaladsTest() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiPizza(pizzaOrder);
        pizzaOrder = new SaladDecorator(pizzaOrder);
        pizzaOrder = new SaladDecorator(pizzaOrder);
        //When
        BigDecimal price = pizzaOrder.getPrice();
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(42.5), price);
        assertEquals("Ingredients: thin dough, tomato sauce, cheese, salami, onion, oregano, mushrooms, 1x salad, 1x salad", description);
    }

    @Test
    public void VegetarianSalamiHawaiianPizzaTest() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new VegetarianPizza(pizzaOrder);
        pizzaOrder = new SalamiPizza(pizzaOrder);
        pizzaOrder = new HawaiianPizza(pizzaOrder);
        pizzaOrder = new OrangeJuiceDecorator(pizzaOrder);
        pizzaOrder = new OrangeJuiceDecorator(pizzaOrder);
        pizzaOrder = new OrangeJuiceDecorator(pizzaOrder);
        //When
        BigDecimal price = pizzaOrder.getPrice();
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(90.50), price);
        assertEquals("Ingredients: thin dough, tomato sauce, cheese, avocado, roasted peppers, mushrooms, red onion, topped olives, salami, onion, oregano, mushrooms, pineapple, ham, onion, 1x orange juice, 1x orange juice, 1x orange juice", description);
    }
}
