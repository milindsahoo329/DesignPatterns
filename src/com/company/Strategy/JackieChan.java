package com.company.Strategy;

public class JackieChan extends Fighter {
    public JackieChan(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("Jackie Chan");
    }
}
