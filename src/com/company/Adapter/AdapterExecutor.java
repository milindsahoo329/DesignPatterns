package com.company.Adapter;

public class AdapterExecutor {

    public void execute(){
        Tesla tesla = new Tesla();
        HotWheels hotWheels = new HotWheels();

        ToyCar carAdapter = new CarAdapter(tesla);

        tesla.autoDrive();

        hotWheels.play();

        carAdapter.play();
    }

}
