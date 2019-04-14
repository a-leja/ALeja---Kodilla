package com.kodilla.good.patterns.challenges.ProductOrderService;


import java.time.LocalDate;
import java.time.LocalDateTime;


public class processOrder {

    private boolean order(final User user, final Item item, final LocalDate orderDate) {
        System.out.println("Item: " + item.getCategory() + " ordered by: " + user.getUserName() + " on: " + orderDate.toString());

        return true;
    }
}
