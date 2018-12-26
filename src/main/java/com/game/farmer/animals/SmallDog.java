package com.game.farmer.animals;

import java.util.Deque;

public class SmallDog {
    public int setNumberSmallDogsOfFarm(int smallDogsOfFarm) {
//pamietaj zmienic na 4
        smallDogsOfFarm=0;
        for (int i = 0; i < 4; i++) {
            smallDogsOfFarm++;
        }
        return smallDogsOfFarm;
    }
}
