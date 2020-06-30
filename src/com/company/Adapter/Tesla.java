package com.company.Adapter;

public class Tesla implements Car {
    @Override
    public void honk() {
        System.out.println("Honking..");
    }

    @Override
    public void autoDrive() {
        System.out.println("Auto-driving via sensors");
    }
}
