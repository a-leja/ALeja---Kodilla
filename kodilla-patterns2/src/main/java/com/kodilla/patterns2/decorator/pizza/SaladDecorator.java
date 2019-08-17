package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SaladDecorator extends AbstractPizzaOrderDecorator {

    public SaladDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(7.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 1x salad";
    }
}
