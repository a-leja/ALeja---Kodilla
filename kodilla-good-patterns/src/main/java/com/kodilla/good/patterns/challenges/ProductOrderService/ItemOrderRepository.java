package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDate;

public class ItemOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, Item item, LocalDate orderDate) {
        return true;
    }

}
