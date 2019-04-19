package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDate;

interface OrderService {
    boolean order(User user, Item item, LocalDate orderDate);
}
