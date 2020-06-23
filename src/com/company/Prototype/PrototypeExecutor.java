package com.company.Prototype;

public class PrototypeExecutor {
    public void execute(){
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("red").addColor();
    }
}
