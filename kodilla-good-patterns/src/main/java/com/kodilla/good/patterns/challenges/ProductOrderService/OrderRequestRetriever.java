package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Oli68", "Oliver", "oliver.watson68@gmail.com");

        Item item = new Item("Book", "Oxford University Press", "used");

        LocalDate orderDate = LocalDate.of(2018, 8, 16);

        return new OrderRequest(user, item, orderDate);
    }

    ;

}
