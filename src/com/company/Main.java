package com.company;

import com.company.Bridge.BridgeExecutor;
import com.company.ChainOfResponsibility.CorExecutor;
import com.company.Flyweight.FlyweightExecutor;
import com.company.Interpreter.InterpreterExecutor;
import com.company.Mediator.MediatorExecutor;
import com.company.Memento.Memento;
import com.company.Memento.MementoExecutor;
import com.company.Prototype.PrototypeExecutor;
import com.company.Proxy.ProxyExecutor;
import com.company.Visitor.VisitorExecutor;

public class Main {

    public static void main(String[] args) {

//        FlyweightExecutor flyweightExecutor = new FlyweightExecutor();
//        flyweightExecutor.execute();

//        BridgeExecutor bridgeExecutor = new BridgeExecutor();
//        bridgeExecutor.execute();

//        CorExecutor corExecutor = new CorExecutor();
//        corExecutor.execute();

//        InterpreterExecutor interpreterExecutor = new InterpreterExecutor();
//        interpreterExecutor.execute();

//        MementoExecutor mementoExecutor = new MementoExecutor();
//        mementoExecutor.execute();

//        VisitorExecutor visitorExecutor = new VisitorExecutor();
//        visitorExecutor.execute();

//        PrototypeExecutor prototypeExecutor = new PrototypeExecutor();
//        prototypeExecutor.execute();

//        MediatorExecutor mediatorExecutor = new MediatorExecutor();
//        mediatorExecutor.execute();

        ProxyExecutor proxyExecutor = new ProxyExecutor();
        proxyExecutor.execute();


    }
}
