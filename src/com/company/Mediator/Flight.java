package com.company.Mediator;

public class Flight implements Command {

    private ATCMediator atcMediator;

    public Flight(ATCMediator atcMediator) {
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {

        if(atcMediator.isLandingOk()){
            System.out.println("Landing allowed");
            atcMediator.setLandingStatus(true);
        }else{
            System.out.println("Wait for landing");
        }

    }

    public void getReady(){
        System.out.println("Ready to land...");
    }
}
