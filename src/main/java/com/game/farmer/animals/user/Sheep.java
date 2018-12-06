package com.game.farmer.animals.user;

import java.util.Deque;

public class Sheep {
    public Deque<String> addToDequeOffSheep(Deque<String> sheepOfUser, int randomNumberBlue, int randomNumberRed) {

        if ((randomNumberRed <= 8 && randomNumberRed >= 7) && (randomNumberBlue <= 9 && randomNumberBlue >= 7)
                && sheepOfUser.size() == 0) {
            sheepOfUser.push("Sheep");
            return sheepOfUser;

        } else if ((randomNumberRed <= 8 && randomNumberRed >= 7) && (randomNumberBlue <= 9 && randomNumberBlue >= 7)
                && sheepOfUser.size() > 0) {
            int currentNumberSheep = sheepOfUser.size();
            for (int i = 0; i < Math.floor((currentNumberSheep + 2) / 2); i++) {
                sheepOfUser.push("Sheep");
            }
            return sheepOfUser;

        } else if (((randomNumberRed <= 8 && randomNumberRed >= 7) || (randomNumberBlue <= 9 && randomNumberBlue >= 7))
                && sheepOfUser.size() > 0) {
            int currentNumberRabbit = sheepOfUser.size();
            for (int i = 0; i < Math.floor((currentNumberRabbit + 1) / 2); i++) {
                sheepOfUser.push("Sheep");
            }
            return sheepOfUser;
        }

        return sheepOfUser;
    }
}
