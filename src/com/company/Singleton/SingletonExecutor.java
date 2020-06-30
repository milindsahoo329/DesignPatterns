package com.company.Singleton;

public class SingletonExecutor {

    public void execute(){

        SingleObject singleObject = SingleObject.getInstance();

        singleObject.showMessage();

    }

}
