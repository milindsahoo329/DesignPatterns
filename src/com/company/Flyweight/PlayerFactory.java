package com.company.Flyweight;

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String,Player> playerHashMap = new HashMap<>();

    public static Player getPlayer(String type){
        Player p = null;

        if(playerHashMap.containsKey(type)){
            p = playerHashMap.get(type);
        } else {
            switch (type) {
                case "Terrorist":
                    System.out.println("Terrorist created... ");
                    p = new Terrorist();
                    break;

                case "ParaTrooper":
                    System.out.println("ParaTrooper created... ");
                    p = new ParaTrooper();
                    break;

                default:
                    System.out.println("Unreachable Code !!!");
            }
            playerHashMap.put(type,p);
        }

        return p;
    }
}
