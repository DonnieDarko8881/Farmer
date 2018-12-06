package com.game.farmer.animals.user;

import java.util.Deque;

public class Pig {

    public Deque<String> addToDequeOffPig(Deque<String> pigsOfUser, int randomNumberBlue, int randomNumberRed) {

        if ((randomNumberRed <= 10 && randomNumberRed >= 9) && randomNumberBlue == 10
                && pigsOfUser.size() == 0) {
            pigsOfUser.push("Pig");
            return pigsOfUser;

        } else if ((randomNumberRed <= 10 && randomNumberRed >= 9) && randomNumberBlue == 10
                && pigsOfUser.size() > 0) {
            int currentNumberPigs = pigsOfUser.size();
            for (int i = 0; i < Math.floor((currentNumberPigs + 2) / 2); i++) {
                pigsOfUser.push("Pig");
            }
            return pigsOfUser;

        } else if (((randomNumberRed <= 10 && randomNumberRed >= 9)|| randomNumberBlue == 10)
                && pigsOfUser.size() > 0) {
            int currentNumberPigs = pigsOfUser.size();
            for (int i = 0; i < Math.floor((currentNumberPigs + 1) / 2); i++) {
                pigsOfUser.push("Sheep");
            }
            return pigsOfUser;
        }

        return pigsOfUser;
    }
}
