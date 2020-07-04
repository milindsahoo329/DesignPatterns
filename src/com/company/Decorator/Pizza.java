package com.company.Decorator;

abstract class Pizza {

    String description = "Unknown pizza";

    public String getDescription(){
        return description;
    }

    public abstract int getCost();
}
