package com.game.farmer.animals;

import java.util.Deque;

public class Sheep {
    public Deque<String> addToDequeOffSheep(Deque<String> sheepOfUser, Deque<String> sheepOfFarm, int randomNumberBlue, int randomNumberRed) {

        if ((randomNumberRed <= 8 && randomNumberRed >= 7) && (randomNumberBlue <= 9 && randomNumberBlue >= 7)
                && sheepOfUser.size() == 0) {

            if (sheepOfFarm.size() > 0) {
                sheepOfFarm.pop();
                sheepOfUser.push("sheep");
            }

            return sheepOfUser;

        } else if ((randomNumberRed <= 8 && randomNumberRed >= 7) && (randomNumberBlue <= 9 && randomNumberBlue >= 7)
                && sheepOfUser.size() > 0) {

            int currentNumberSheep = sheepOfUser.size();
            for (int i = 0; i < Math.floor((currentNumberSheep + 2) / 2); i++) {
                if (sheepOfFarm.size() > 0) {
                    sheepOfFarm.pop();
                    sheepOfUser.push("sheep");
                }
            }
            return sheepOfUser;

        } else if (((randomNumberRed <= 8 && randomNumberRed >= 7) || (randomNumberBlue <= 9 && randomNumberBlue >= 7))
                && sheepOfUser.size() > 0) {
            int currentNumberRabbit = sheepOfUser.size();
            for (int i = 0; i < Math.floor((currentNumberRabbit + 1) / 2); i++) {
                if (sheepOfFarm.size() > 0) {
                    sheepOfFarm.pop();
                    sheepOfUser.push("sheep");
                }
            }
            return sheepOfUser;
        }

        return sheepOfUser;
    }

    public Deque<String> setNumberSheepOfFarm(Deque<String> sheepOfFarm) {
//pamietaj zmienic na 24
        for (int i = 0; i < 24; i++) {
            sheepOfFarm.push("Sheep");
        }
        return sheepOfFarm;
    }
}
