package com.game.farmer.animals;



public class BigDog {
    public int setNumberBigDogsOfFarm(int bigDogsOfFarm) {
//pamietaj zmienic na 2
        bigDogsOfFarm=0;
        for (int i = 0; i < 2; i++) {
            bigDogsOfFarm++;
        }
        return bigDogsOfFarm;
    }
}
