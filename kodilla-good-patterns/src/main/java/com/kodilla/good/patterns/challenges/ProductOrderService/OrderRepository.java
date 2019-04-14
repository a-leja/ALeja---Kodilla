package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDate;

interface OrderRepository {
    boolean createOrder(User user, Item item, LocalDate orderDate);
}
