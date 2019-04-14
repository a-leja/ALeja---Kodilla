package com.kodilla.good.patterns.challenges.ProductOrderService;


public class Item {

    private String category;
    private String producer;
    private String status;


    public Item(String category, String producer, String status) {
        this.category = category;
        this.producer = producer;
        this.status = status;
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
