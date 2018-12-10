package com.game.farmer.animals.user;

import java.util.Deque;

public class Cow {
    public Deque<String> addToDequeOffCow(Deque<String> cowsOfUser, Deque<String> cowsOfFarm, int randomNumberBlue) {


        if (randomNumberBlue == 11 && cowsOfUser.size() > 0) {
            int currentNumberCows = cowsOfUser.size();
            for (int i = 0; i < Math.floor((currentNumberCows + 1) / 2); i++) {

                if (cowsOfFarm.size() > 0) {

                    cowsOfFarm.pop();
                    cowsOfUser.push("Cow");
                }
            }
            return cowsOfUser;
        }

        return cowsOfUser;
    }

    public Deque<String> setNumberCowsOfFarm(Deque<String> cowsOfFarm) {
//pamietaj zmienic na 12
        for (int i = 0; i < 12; i++) {
            cowsOfFarm.push("Cow");
        }
        return cowsOfFarm;
    }
}
