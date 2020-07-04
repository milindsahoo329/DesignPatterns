package com.company.Decorator;

public class Barbeque extends ToppingsDecorator {

    Pizza pizza;

    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Barbecue";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+50;
    }
}
