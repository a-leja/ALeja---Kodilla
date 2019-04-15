package com.kodilla.good.patterns.challenges.Food2Door;

public class Order {

    private String supplier;
    private int quantity;
    private String type;

    public Order(String supplier, int quantity, String type) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order product = (Order) o;

        if (getQuantity() != product.getQuantity()) return false;
        if (getSupplier() != null ? !getSupplier().equals(product.getSupplier()) : product.getSupplier() != null)
            return false;
        return getType() != null ? getType().equals(product.getType()) : product.getType() == null;
    }

    @Override
    public int hashCode() {
        int result = getSupplier() != null ? getSupplier().hashCode() : 0;
        result = 31 * result + getQuantity();
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        return result;
    }
}
