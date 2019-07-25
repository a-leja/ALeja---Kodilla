package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Supplier {

    private Map<Product, Integer> allAvailableProducts() {

        Map<Product, Integer> availableProducts = new HashMap();

        availableProducts.put(new Product("Ginger Jam"), 22);
        availableProducts.put(new Product("BIO Chia seeds"), 6);
        availableProducts.put(new Product("BIO Peanut Butter"), 11);

        return availableProducts;
    }


    private boolean checkIfAvailable(Order order) {

        for (Map.Entry<Product, Integer> entry : allAvailableProducts().entrySet()) {
            if (order.getProduct() == entry.getKey() && order.getQuantity() <= entry.getValue()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {

        System.out.println(orderRequest.getCustomer() + ", welcome to HealthyShop! Thank you for choosing our product");
        return checkIfAvailable(Order order);
    }
}
