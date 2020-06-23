package com.company.Prototype;

import java.util.HashMap;

public class ColorStore {
    private static HashMap<String,Color> colorList = new HashMap<String,Color>();
    static {
        colorList.put("blue", new blueColor());
        colorList.put("red", new redColor());
    }
    public static Color getColor(String colorName){
        return (Color)colorList.get(colorName);
    }
}
