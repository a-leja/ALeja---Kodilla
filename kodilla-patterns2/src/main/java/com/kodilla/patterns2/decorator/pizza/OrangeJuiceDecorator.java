package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OrangeJuiceDecorator extends AbstractPizzaOrderDecorator {

    public OrangeJuiceDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4.50));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 1x orange juice";
    }
}
