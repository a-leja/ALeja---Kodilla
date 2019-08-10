package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HawaiianPizza extends AbstractPizzaOrderDecorator {

    public HawaiianPizza(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(16.50));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pineapple, ham, onion";
    }
}