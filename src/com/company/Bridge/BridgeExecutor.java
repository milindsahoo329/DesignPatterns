package com.company.Bridge;

public class BridgeExecutor {
    public void execute(){

        Vehicle vehicle1 = new Car(new Assemble(),new Finish());
        vehicle1.manufacture();

        Vehicle vehicle2 = new Bike(new Assemble(), new Finish());
        vehicle2.manufacture();

    }
}
