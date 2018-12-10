package com.game.farmer.animals.enemy;

import javafx.scene.control.Button;

import java.util.Deque;

public class Fox {

    public Deque<String> removeRabbits(Deque<String> rabbitsOfUser, Deque<String> rabbitsOfFarm,
                                       Deque<String> smallDogsOfUser, Deque<String> smallDogsOfFarm, int randomNumberRed) {

        if (randomNumberRed == 12 && rabbitsOfUser.size() == 0) {
            return rabbitsOfUser;

        } else if (randomNumberRed == 12 && rabbitsOfUser.size() > 0) {
            if (smallDogsOfUser.size() == 0) {

                for (int i = 0; i < rabbitsOfUser.size(); i++) {
                    rabbitsOfFarm.push("rabbit");
                }
                rabbitsOfUser.clear();
            } else if (smallDogsOfUser.size() > 0) {

                smallDogsOfUser.pop();
                smallDogsOfFarm.push("Small Dog");
            }
            return rabbitsOfUser;
        }
        return rabbitsOfUser;
    }
}

