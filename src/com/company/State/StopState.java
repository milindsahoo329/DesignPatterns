package com.company.State;

public class StopState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop";
    }

}
