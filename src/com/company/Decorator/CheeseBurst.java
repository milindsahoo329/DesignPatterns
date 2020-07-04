package com.company.Decorator;

public class CheeseBurst extends ToppingsDecorator {

    Pizza pizza;

    public CheeseBurst(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", CheeseBurst";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 75;
    }
}
