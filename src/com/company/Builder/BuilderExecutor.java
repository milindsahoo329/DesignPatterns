package com.company.Builder;

public class BuilderExecutor {

    public void execute(){
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        vegMeal.getCost();

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
        nonVegMeal.getCost();
    }

}
