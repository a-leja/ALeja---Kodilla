package com.kodilla.good.patterns.challenges.Food2Door;

public class Product {

    private String supplier;
    private int quantity;
    private String type;

    public Product(String supplier, int quantity, String type) {
        this.supplier = supplier;
        this.quantity = quantity;
        this.type = type;
    }

    public String getSupplier() {
        return supplier;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "supplier='" + supplier + '\'' +
                ", quantity=" + quantity +
                ", type='" + type + '\'' +
                '}';
    }
}
