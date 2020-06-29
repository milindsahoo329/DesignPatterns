package com.company.Facade;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawCircle(){
        circle.draw();
    }

}
