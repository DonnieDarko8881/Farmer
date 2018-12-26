package com.game.farmer.animals.enemy;

import javafx.scene.control.Button;
import javafx.util.Pair;

import java.util.Deque;

public class Fox {

    public Pair removeRabbits(int rabbitsOfUser, int rabbitsOfFarm,
                              int smallDogsOfUser, int smallDogsOfFarm, int randomNumberRed) {

        if (randomNumberRed == 12 && rabbitsOfUser == 0) {
            return new Pair(rabbitsOfUser, rabbitsOfFarm);

        } else if (randomNumberRed == 12 && rabbitsOfUser > 0) {
            if (smallDogsOfUser == 0) {

                for (int i = 0; i < rabbitsOfUser; i++) {
                    rabbitsOfFarm++;
                }
                rabbitsOfUser = 0;
            } else if (smallDogsOfUser > 0) {

                smallDogsOfUser--;
                smallDogsOfFarm++;
            }
            return new Pair(rabbitsOfUser, rabbitsOfFarm);
        }
        return new Pair(rabbitsOfUser, rabbitsOfFarm);

    }

    public Pair removeSmallDog(int rabbitsOfUser, int rabbitsOfFarm,
                               int smallDogsOfUser, int smallDogsOfFarm, int randomNumberRed) {

        if (randomNumberRed == 12 && rabbitsOfUser == 0) {
            return new Pair(smallDogsOfUser, smallDogsOfFarm);
        } else if (randomNumberRed == 12 && rabbitsOfUser > 0) {
            if (smallDogsOfUser == 0) {

                for (int i = 0; i < rabbitsOfUser; i++) {
                    rabbitsOfFarm++;
                }
                rabbitsOfUser = 0;
            } else if (smallDogsOfUser > 0) {

                smallDogsOfUser--;
                smallDogsOfFarm++;
            }
            return new Pair(smallDogsOfUser, smallDogsOfFarm);
        }
        return new Pair(smallDogsOfUser, smallDogsOfFarm);

    }
}

