package com.game.farmer.animals.enemy;

import java.util.Deque;

public class Fox {

    public Deque<String> removeRabbits(Deque<String> rabbitsOfUser, int randomNumberRed) {

        if (randomNumberRed == 12 && rabbitsOfUser.size() == 0) {
            return rabbitsOfUser;

        } else if (randomNumberRed == 12 && rabbitsOfUser.size() > 0) {

            rabbitsOfUser.clear();
            return rabbitsOfUser;
        }
        return rabbitsOfUser;
    }
}

