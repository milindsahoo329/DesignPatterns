package com.company.Proxy;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting to server "+serverHost+"...");
    }

}
