package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;


public class GlutenFreeShop implements Supplier {

    private List<Product> allAvailableProducts() {

        List<Product> availableProducts = new ArrayList<>();

        Product oatmeal = new Product("Gluten-free Oatmeal");
        Product appleMuesli = new Product("Gluten-free Muesli Apple & Banana & Pineapple");
        Product cacaoMuesli = new Product("Gluten-free Muesli Cacao & Banana & Raspberry");

        availableProducts.add(oatmeal);
        availableProducts.add(appleMuesli);
        availableProducts.add(cacaoMuesli);

        return availableProducts;
    }

    private boolean checkIfAvailable(Order order) {


        if (allAvailableProducts().contains(order.getProduct())) {
            return true;
        } else {
            System.out.println("Sorry, the product is currently unavailable.");
        }
        return false;
    }

    @Override
    public boolean process(Order order) {

        OrderRequest orderRequest;

        if (order != null && checkIfAvailable(order)) {
            System.out.println("Thank you for ordering " + order.getProduct().getName() + ". We would appreciate your feedback on it!" + "\n");
            return true;
        }
        return false;
    }
}
