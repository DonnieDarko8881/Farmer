package com.game.farmer.animals.enemy;

import java.util.Deque;

//blue dig na 12
public class Wolf {

    public Deque<String> removeRabbits(Deque<String> rabbitsOfUser, Deque<String> rabbitsOfFarm,
                                       Deque<String> bigDogsOfUser, Deque<String> bigDogsOfFarm,
                                       int randomNumberBlue) {

        if (randomNumberBlue == 12 && rabbitsOfUser.size() > 0) {
            if (bigDogsOfUser.size() == 0) {

                for (int i = 0; i < rabbitsOfUser.size(); i++) {
                    rabbitsOfFarm.push("Rabbit");
                }

                rabbitsOfUser.clear();
            }
        }
        return rabbitsOfUser;
    }

    public Deque<String> removeSheep(Deque<String> sheepOfUser, Deque<String> sheepOfFarm,
                                     Deque<String> bigDogsOfUser, Deque<String> bigDogsOfFarm,
                                     int randomNumberBlue) {

        if (randomNumberBlue == 12 && sheepOfUser.size() > 0) {

            if (bigDogsOfUser.size() == 0) {
                for (int i = 0; i < sheepOfUser.size(); i++) {
                    sheepOfFarm.push("Sheep");
                }

                sheepOfUser.clear();
            }
        }
        return sheepOfUser;
    }

    public Deque<String> removePigs(Deque<String> pigsOfUser, Deque<String> pigsOfFarm,
                                    Deque<String> bigDogsOfUser, Deque<String> bigDogsOfFarm,
                                    int randomNumberBlue) {

        if (randomNumberBlue == 12 && pigsOfUser.size() > 0) {
            if (bigDogsOfUser.size() == 0) {
                for (int i = 0; i < pigsOfUser.size(); i++) {
                    pigsOfFarm.push("Pig");
                }

                pigsOfUser.clear();
            }
        }
        return pigsOfUser;
    }

    public Deque<String> removeCows(Deque<String> cowsOfUser, Deque<String> cowsOfFarm,
                                    Deque<String> bigDogsOfUser, Deque<String> bigDogsOfFarm,
                                    int randomNumberBlue) {

        if (randomNumberBlue == 12 && cowsOfUser.size() > 0) {
            if (bigDogsOfUser.size() == 0) {
                for (int i = 0; i < cowsOfUser.size(); i++) {
                    cowsOfFarm.push("Cow");
                }

                cowsOfUser.clear();
            } else if (bigDogsOfUser.size() > 0) {
                bigDogsOfUser.pop();
                bigDogsOfFarm.push("Big Dog");
            }
        }
        return cowsOfUser;
    }

    public Deque<String> removeBigDog(Deque<String> bigDogsOfUser, Deque<String> bigDogsOfFarm,
                                      int randomNumberBlue) {

        if (randomNumberBlue == 12) {
            if (bigDogsOfUser.size() > 0) {
                bigDogsOfUser.pop();
                bigDogsOfFarm.push("Big Dog");
            }
        }
        return bigDogsOfUser;
    }
}
