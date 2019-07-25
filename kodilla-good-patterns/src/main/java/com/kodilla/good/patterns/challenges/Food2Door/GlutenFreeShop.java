package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Supplier {




    private Map<Product, Integer> allAvailableProducts() {

        Map<Product, Integer> availableProducts = new HashMap();

        availableProducts.put(new Product("Gluten-free Oatmeal"), 11);
        availableProducts.put(new Product("Gluten-free Muesli Apple & Banana & Pineapple"), 5);
        availableProducts.put(new Product("Gluten-free Muesli Cacao & Banana & Raspberry"), 12);

        return availableProducts;
    }

//    @Override
//    public boolean process(OrderRequest orderRequest) {
//
//        System.out.println("Thank you " + orderRequest.getCustomer() + " for ordering " + orderRequest.getOrder() + ". We would appreciate your feedback on it!");
//        return true;
//    }
}
