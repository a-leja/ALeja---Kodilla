package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class VegetarianPizza extends AbstractPizzaOrderDecorator {

    public VegetarianPizza(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(32.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", avocado, roasted peppers, mushrooms, red onion, topped olives";
    }
}
