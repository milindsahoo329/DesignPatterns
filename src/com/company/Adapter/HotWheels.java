package com.company.Adapter;

public class HotWheels implements ToyCar{
    @Override
    public void play() {
        System.out.println("Using a RC..");
    }
}
