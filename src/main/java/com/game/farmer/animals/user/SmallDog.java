package com.game.farmer.animals.user;

import java.util.Deque;

public class SmallDog {
    public Deque<String> setNumberSmallDogsOfFarm(Deque<String> smallDogsOfFarm) {
//pamietaj zmienic na 4
        for (int i = 0; i < 4; i++) {
            smallDogsOfFarm.push("smallDog");
        }
        return smallDogsOfFarm;
    }
}
