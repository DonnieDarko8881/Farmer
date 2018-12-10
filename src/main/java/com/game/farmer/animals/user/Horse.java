package com.game.farmer.animals.user;

import java.util.Deque;

public class Horse {
    public Deque<String> addToDequeOffHorse(Deque<String> horsesOfUser, Deque<String> horsesOfFarm, int randomNumberRed) {


        if (randomNumberRed == 12 && horsesOfUser.size() > 0) {
            int currentNumberCows = horsesOfUser.size();
            for (int i = 0; i < Math.floor((currentNumberCows + 1) / 2); i++) {

                if (horsesOfFarm.size() > 0) {

                    horsesOfFarm.pop();
                    horsesOfUser.push("Horse");
                }
            }
            return horsesOfUser;
        }

        return horsesOfUser;
    }

    public Deque<String> setNumberHorsesOfFarm(Deque<String> horsesOfFarm) {
//pamietaj zmienic na 6
        for (int i = 0; i < 6; i++) {
            horsesOfFarm.push("Horse");
        }
        return horsesOfFarm;
    }
}
