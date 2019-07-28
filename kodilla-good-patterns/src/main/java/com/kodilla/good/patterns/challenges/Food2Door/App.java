package com.kodilla.good.patterns.challenges.Food2Door;

public class App {

    public static void main(String[] args) {

        HealthyShop healthyShop = new HealthyShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();

        Order healthyShopOrder = new Order(new Product("BIO Chia seeds"), 12);
        Order glutenFreeShopOrder = new Order(new Product("Gluten-free Oatmeal"), 1);
        Order extraFoodShopOrder = new Order(new Product("BIO Chia seeds"), 1);

        healthyShop.process(healthyShopOrder);
        glutenFreeShop.process(glutenFreeShopOrder);
        extraFoodShop.process(extraFoodShopOrder);
    }
}
