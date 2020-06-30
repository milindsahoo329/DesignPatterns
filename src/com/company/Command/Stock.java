package com.company.Command;

public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Bought : Name - "+name+" Quantity - "+quantity);
    }

    public void sell(){
        System.out.println("Sold : Name - "+name+" Quantity - "+quantity);
    }

}
