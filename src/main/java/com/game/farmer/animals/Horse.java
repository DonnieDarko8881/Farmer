package com.game.farmer.animals;


import javafx.util.Pair;

public class Horse {
    public Pair addToDequeOffHorse(int horsesOfUser, int horsesOfFarm, int randomNumberRed) {


        if (randomNumberRed == 12 && horsesOfUser > 0) {
            int currentNumberCows = horsesOfUser;
            for (int i = 0; i < Math.floor((currentNumberCows + 1) / 2); i++) {

                if (horsesOfFarm > 0) {

                    horsesOfFarm--;
                    horsesOfUser++;
                }
            }
            return new Pair(horsesOfUser,horsesOfFarm);
        }

        return new Pair(horsesOfUser,horsesOfFarm);
    }

    public int setNumberHorsesOfFarm(int horsesOfFarm) {
//pamietaj zmienic na 6
        horsesOfFarm=0;
        for (int i = 0; i < 6; i++) {
            horsesOfFarm++;
        }
        return horsesOfFarm;
    }
}
