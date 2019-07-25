package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Supplier {


    private Map<Product, Integer> allAvailableProducts() {

        Map<Product, Integer> availableProducts = new HashMap();

        availableProducts.put(new Product("Organic Cashew Butter"), 22);
        availableProducts.put(new Product("Organic Hazelnut Butter"), 6);
        availableProducts.put(new Product("Organic Almond Butter"), 11);

        return availableProducts;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {

        System.out.println("Your order " + orderRequest.getOrder() + " is being processed");
        return true;
    }
}
