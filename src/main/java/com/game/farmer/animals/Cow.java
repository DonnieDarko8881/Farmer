package com.game.farmer.animals;

import javafx.util.Pair;

import java.util.Deque;

public class Cow {
    public Pair addToDequeOffCow(int cowsOfUser, int cowsOfFarm, int randomNumberBlue) {


        if (randomNumberBlue == 11 && cowsOfUser > 0) {
            int currentNumberCows = cowsOfUser;
            for (int i = 0; i < Math.floor((currentNumberCows + 1) / 2); i++) {

                if (cowsOfFarm > 0) {

                    cowsOfFarm--;
                    cowsOfUser++;
                }
            }
            return new Pair(cowsOfUser,cowsOfFarm);
        }

        return new Pair(cowsOfUser,cowsOfFarm);
    }

    public int setNumberCowsOfFarm(int cowsOfFarm) {
//pamietaj zmienic na 12
        cowsOfFarm=0;
        for (int i = 0; i < 12; i++) {
            cowsOfFarm++;
        }
        return cowsOfFarm;
    }
}
