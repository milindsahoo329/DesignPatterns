package com.company.Prototype;

public class redColor extends Color {

    public redColor() {
        this.colorName = "Red";
    }

    @Override
    void addColor() {
        System.out.println("Red color added");
    }
}
