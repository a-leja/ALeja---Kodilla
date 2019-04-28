package com.kodilla.good.patterns.challenges.Food2Door;

public class ItemOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(Customer customer, Order order) {
        return true;
    }
}
