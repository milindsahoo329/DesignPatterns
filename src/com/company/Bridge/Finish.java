package com.company.Bridge;

public class Finish implements Workshop {
    @Override
    public void work() {
        System.out.println("Finishing. ");
    }
}
