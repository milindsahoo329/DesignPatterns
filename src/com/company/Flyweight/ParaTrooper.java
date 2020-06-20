package com.company.Flyweight;

public class ParaTrooper implements Player{

    private final String task;

    private String weapon;

    public ParaTrooper() {
        task = "Kill Terrorists";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("ParaTrooper with weapon - "+weapon+" and task - "+task);
    }
}
