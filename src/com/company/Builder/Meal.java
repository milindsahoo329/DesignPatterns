package com.company.Builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public void showItems(){
        for(Item item : items){
            System.out.print("Item - "+item.name());
            System.out.print(", Packing - "+item.packing().pack());
            System.out.print(", Price - "+item.price());
            System.out.println();
        }
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item : items){
            cost = cost + item.price();
        }
        return cost;
    }

}
