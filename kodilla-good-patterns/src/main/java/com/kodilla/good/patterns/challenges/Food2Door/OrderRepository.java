package com.kodilla.good.patterns.challenges.Food2Door;

interface OrderRepository {

    boolean createOrder(Customer customer, Order order);
}
