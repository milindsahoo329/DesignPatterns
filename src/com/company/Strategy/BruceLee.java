package com.company.Strategy;

public class BruceLee extends Fighter{
    public BruceLee(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("Bruce Lee");
    }
}
