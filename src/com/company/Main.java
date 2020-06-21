package com.company;

import com.company.Bridge.BridgeExecutor;
import com.company.ChainOfResponsibility.CorExecutor;
import com.company.Flyweight.FlyweightExecutor;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        FlyweightExecutor flyweightExecutor = new FlyweightExecutor();
//        flyweightExecutor.execute();

//        BridgeExecutor bridgeExecutor = new BridgeExecutor();
//        bridgeExecutor.execute();

        CorExecutor corExecutor = new CorExecutor();
        corExecutor.execute();

    }
}
