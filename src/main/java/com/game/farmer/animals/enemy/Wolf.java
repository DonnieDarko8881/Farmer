package com.game.farmer.animals.enemy;

import javafx.util.Pair;

import java.util.Deque;

//blue dig na 12
public class Wolf {

    public Pair removeRabbits(int rabbitsOfUser, int rabbitsOfFarm,
                              int bigDogsOfUser, int bigDogsOfFarm,
                              int randomNumberBlue) {

        if (randomNumberBlue == 12 && rabbitsOfUser > 0) {
            if (bigDogsOfUser == 0) {

                for (int i = 0; i < rabbitsOfUser; i++) {
                    rabbitsOfFarm++;
                }

                rabbitsOfUser = 0;
            }
        }
        return new Pair(rabbitsOfUser,rabbitsOfFarm);
    }

    public Pair removeSheep(int sheepOfUser, int sheepOfFarm,
                           int bigDogsOfUser, int bigDogsOfFarm,
                           int randomNumberBlue) {

        if (randomNumberBlue == 12 && sheepOfUser > 0) {

            if (bigDogsOfUser == 0) {
                for (int i = 0; i < sheepOfUser; i++) {
                    sheepOfFarm++;
                }

                sheepOfUser = 0;
            }
        }
        return new Pair(sheepOfUser,sheepOfFarm);
    }

    public Pair removePigs(int pigsOfUser, int pigsOfFarm,
                          int bigDogsOfUser, int bigDogsOfFarm,
                          int randomNumberBlue) {

        if (randomNumberBlue == 12 && pigsOfUser > 0) {
            if (bigDogsOfUser == 0) {
                for (int i = 0; i < pigsOfUser; i++) {
                    pigsOfFarm++;
                }

                pigsOfUser = 0;
            }
        }
        return new Pair(pigsOfUser,pigsOfFarm);
    }

    public Pair removeCows(int cowsOfUser, int cowsOfFarm,
                          int bigDogsOfUser, int bigDogsOfFarm,
                          int randomNumberBlue) {

        if (randomNumberBlue == 12 && cowsOfUser > 0) {
            if (bigDogsOfUser == 0) {
                for (int i = 0; i < cowsOfUser; i++) {
                    cowsOfFarm++;
                }

                cowsOfUser = 0;
            } else if (bigDogsOfUser > 0) {
                bigDogsOfUser--;
                bigDogsOfFarm++;
            }
        }
        return new Pair(cowsOfUser,cowsOfFarm);
    }

    public Pair removeBigDog(int bigDogsOfUser, int bigDogsOfFarm,
                            int randomNumberBlue) {

        if (randomNumberBlue == 12) {
            if (bigDogsOfUser > 0) {
                bigDogsOfUser--;
                bigDogsOfFarm++;
            }
        }
        return new Pair(bigDogsOfUser,bigDogsOfFarm);
    }
}
