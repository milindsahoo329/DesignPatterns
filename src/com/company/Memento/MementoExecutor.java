package com.company.Memento;

public class MementoExecutor {

    public void execute(){
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State 1");
        System.out.println("Current state = "+originator.getState());
        originator.setState("State 2");
        System.out.println("Current state = "+originator.getState());
        careTaker.add(originator.setMementoState());
        originator.setState("State 3");
        System.out.println("Current state = "+originator.getState());
        careTaker.add(originator.setMementoState());

        originator.getMementoState(careTaker.get(0));
        System.out.println("first saved state - "+originator.getState());

        originator.getMementoState(careTaker.get(1));
        System.out.println("second saved state - "+originator.getState());


    }

}
