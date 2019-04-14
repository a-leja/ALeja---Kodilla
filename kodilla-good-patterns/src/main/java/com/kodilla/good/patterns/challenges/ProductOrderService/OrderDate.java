package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDate;

public class OrderDate {

    private LocalDate orderDate;

    public OrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "OrderDate{" +
                "orderDate=" + orderDate +
                '}';
    }
}
