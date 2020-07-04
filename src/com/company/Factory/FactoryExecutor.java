package com.company.Factory;

public class FactoryExecutor {

    public void execute(){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Circle");
        shape2.draw();
    }

}
