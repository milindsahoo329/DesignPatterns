package com.company.Facade;

public class FacadeExecutor {

    public void execute(){

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();

    }

}
