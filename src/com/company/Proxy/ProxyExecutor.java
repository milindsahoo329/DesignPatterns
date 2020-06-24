package com.company.Proxy;

public class ProxyExecutor {

    public void execute(){

        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("notabc.com");
            internet.connectTo("abc.com");
        } catch (Exception e){
            e.printStackTrace();
        }



    }

}
