package com.company.Mediator;

public class MediatorExecutor {

    public void execute(){

        ATCMediator atcMediator = new ATCMediatorImpl();
        Flight boeing747 = new Flight(atcMediator);
        Runway runway1 = new Runway(atcMediator);

        atcMediator.registerFlight(boeing747);
        atcMediator.registerRunway(runway1);

        boeing747.getReady();
        runway1.land();
        boeing747.land();



    }

}
