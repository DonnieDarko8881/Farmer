package com.game.farmer.animals;

import java.util.Deque;

public class Pig {

    public Deque<String> addToDequeOffPig(Deque<String> pigsOfUser, Deque<String> pigsOfFarm, int randomNumberBlue, int randomNumberRed) {

        if ((randomNumberRed <= 10 && randomNumberRed >= 9) && randomNumberBlue == 10
                && pigsOfUser.size() == 0) {
            if (pigsOfFarm.size() > 0) {

                pigsOfFarm.pop();
                pigsOfUser.push("pig");
            }
            return pigsOfUser;

        } else if ((randomNumberRed <= 10 && randomNumberRed >= 9) && randomNumberBlue == 10
                && pigsOfUser.size() > 0) {
            int currentNumberPigs = pigsOfUser.size();
            for (int i = 0; i < Math.floor((currentNumberPigs + 2) / 2); i++) {
                if (pigsOfFarm.size() > 0) {

                    pigsOfFarm.pop();
                    pigsOfUser.push("pig");
                }
            }
            return pigsOfUser;

        } else if (((randomNumberRed <= 10 && randomNumberRed >= 9) || randomNumberBlue == 10)
                && pigsOfUser.size() > 0) {
            int currentNumberPigs = pigsOfUser.size();
            for (int i = 0; i < Math.floor((currentNumberPigs + 1) / 2); i++) {

                if (pigsOfFarm.size() > 0) {

                    pigsOfFarm.pop();
                    pigsOfUser.push("pig");
                }
            }
            return pigsOfUser;
        }

        return pigsOfUser;
    }

    public Deque<String> setNumberPigOfFarm(Deque<String> pigsOfFarm) {
//pamietaj zmienic na 20
        for (int i = 0; i < 20; i++) {
            pigsOfFarm.push("Pig");
        }
        return pigsOfFarm;
    }
}
