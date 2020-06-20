package com.company.Flyweight;

import java.util.Random;

public class FlyweightExecutor {

    private static String [] playerType = {"ParaTrooper","Terrorist"};
    private static String [] weapons = {"AK 47","Pistol","Knife"};

    public void execute(){

        for(int i=0; i<10; i++){
            Player p = PlayerFactory.getPlayer(getRandomPlayerType());
            p.assignWeapon(getRandomWeapon());
            p.mission();
        }

    }

    public String getRandomPlayerType(){
        Random r = new Random();
        int randomInt = r.nextInt(playerType.length);
        return playerType[randomInt];
    }

    public String getRandomWeapon(){
        Random r = new Random();
        int randomInt = r.nextInt(weapons.length);
        return weapons[randomInt];
    }

}
