package com.game.farmer.animals;

import javafx.util.Pair;

import java.util.Deque;

public class Pig {

    public Pair addToDequeOffPig(int pigsOfUser, int pigsOfFarm, int randomNumberBlue, int randomNumberRed) {

        if ((randomNumberRed <= 10 && randomNumberRed >= 9) && randomNumberBlue == 10
                && pigsOfUser == 0) {
            if (pigsOfFarm > 0) {

                pigsOfFarm--;
                pigsOfUser++;
            }
            return new Pair(pigsOfUser,pigsOfFarm);

        } else if ((randomNumberRed <= 10 && randomNumberRed >= 9) && randomNumberBlue == 10
                && pigsOfUser > 0) {
            int currentNumberPigs = pigsOfUser;
            for (int i = 0; i < Math.floor((currentNumberPigs + 2) / 2); i++) {
                if (pigsOfFarm > 0) {

                    pigsOfFarm--;
                    pigsOfUser++;
                }
            }
            return new Pair(pigsOfUser,pigsOfFarm);

        } else if (((randomNumberRed <= 10 && randomNumberRed >= 9) || randomNumberBlue == 10)
                && pigsOfUser > 0) {
            int currentNumberPigs = pigsOfUser;
            for (int i = 0; i < Math.floor((currentNumberPigs + 1) / 2); i++) {

                if (pigsOfFarm > 0) {

                    pigsOfFarm--;
                    pigsOfUser++;
                }
            }
            return new Pair(pigsOfUser,pigsOfFarm);
        }

        return new Pair(pigsOfUser,pigsOfFarm);
    }

   /* public int setNumberPigOfFarm(int pigsOfFarm) {
/*pamietaj zmienic na 20
        pigsOfFarm=0;
        for (int i = 0; i < 20; i++) {
            pigsOfFarm++;
        }
        return pigsOfFarm;
    }*/
}
