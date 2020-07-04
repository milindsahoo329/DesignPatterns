package com.company.Decorator;

public class DecoratorExecutor {

    public void execute(){
        Pizza pizza = new FarmHouse();
        System.out.println(pizza.getDescription()+" Cost - "+pizza.getCost());

        pizza = new CheeseBurst(pizza);
        System.out.println(pizza.getDescription()+" Cost - "+pizza.getCost());

        pizza = new Barbeque(pizza);
        System.out.println(pizza.getDescription()+" Cost - "+pizza.getCost());
    }

}
