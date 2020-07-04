package com.company.Factory;

public class ShapeFactory {

    public Shape getShape(String shapeType){

        switch (shapeType){
            case "Rectangle":
                return new Rectangle();
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();

            default:
                return null;
        }

    }

}
