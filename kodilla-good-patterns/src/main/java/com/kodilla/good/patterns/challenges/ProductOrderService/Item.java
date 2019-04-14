package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDate;

public class Item {

    private String category;
    private String producer;
    private String status;
    private LocalDate orderDate;


    public Item(String category, String producer, String status, LocalDate orderDate) {
        this.category = category;
        this.producer = producer;
        this.status = status;
        this.orderDate = orderDate;
    }

    public String getCategory() {
        return category;
    }

    public String getProducer() {
        return producer;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Item{" +
                "category='" + category + '\'' +
                ", producer='" + producer + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
