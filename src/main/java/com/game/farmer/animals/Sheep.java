package com.game.farmer.animals;

import javafx.util.Pair;

import java.util.Deque;

public class Sheep {
    public Pair addToDequeOffSheep(int sheepOfUser, int sheepOfFarm, int randomNumberBlue, int randomNumberRed) {

        if ((randomNumberRed <= 8 && randomNumberRed >= 7) && (randomNumberBlue <= 9 && randomNumberBlue >= 7)
                && sheepOfUser == 0) {

            if (sheepOfFarm > 0) {
                sheepOfFarm--;
                sheepOfUser++;
            }

            return new Pair(sheepOfUser,sheepOfFarm);

        } else if ((randomNumberRed <= 8 && randomNumberRed >= 7) && (randomNumberBlue <= 9 && randomNumberBlue >= 7)
                && sheepOfUser > 0) {

            int currentNumberSheep = sheepOfUser;
            for (int i = 0; i < Math.floor((currentNumberSheep + 2) / 2); i++) {
                if (sheepOfFarm > 0) {
                    sheepOfFarm--;
                    sheepOfUser++;
                }
            }
            return new Pair(sheepOfUser,sheepOfFarm);

        } else if (((randomNumberRed <= 8 && randomNumberRed >= 7) || (randomNumberBlue <= 9 && randomNumberBlue >= 7))
                && sheepOfUser > 0) {
            int currentNumberRabbit = sheepOfUser;
            for (int i = 0; i < Math.floor((currentNumberRabbit + 1) / 2); i++) {
                if (sheepOfFarm > 0) {
                    sheepOfFarm--;
                    sheepOfUser++;
                }
            }
            return new Pair(sheepOfUser,sheepOfFarm);
        }

        return new Pair(sheepOfUser,sheepOfFarm);
    }
}
