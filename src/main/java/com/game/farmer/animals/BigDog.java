package com.game.farmer.animals;

import java.util.Deque;

public class BigDog {
    public Deque<String> setNumberBigDogsOfFarm(Deque<String> bigDogsOfFarm) {
//pamietaj zmienic na 2
        for (int i = 0; i < 2; i++) {
            bigDogsOfFarm.push("BigDog");
        }
        return bigDogsOfFarm;
    }
}
