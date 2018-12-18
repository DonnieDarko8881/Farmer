package com.game.farmer.animals;

import com.game.farmer.digs.BlueDig;
import com.game.farmer.digs.RedDig;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

import java.util.ArrayDeque;
import java.util.Deque;

public class Rabbit {


    public Deque<String> addToDequeOffRabbit(Deque<String> rabbitsOfUser, Deque<String> rabbitsOfFarm, int randomNumberBlue, int randomNumberRed) {
        if (randomNumberRed <= 6 && randomNumberBlue <= 6 && rabbitsOfUser.size() == 0) {
            if (rabbitsOfFarm.size() > 0) {
                rabbitsOfFarm.pop();
                rabbitsOfUser.push("Rabbit");
            }
            return rabbitsOfUser;
        } else if (rabbitsOfUser.size() > 0 && randomNumberRed <= 6 && randomNumberBlue <= 6) {

            int currentNumberRabbit = rabbitsOfUser.size();
            for (int i = 0; i < Math.floor((currentNumberRabbit + 2) / 2); i++) {
                if (rabbitsOfFarm.size() > 0) {
                    rabbitsOfFarm.pop();
                    rabbitsOfUser.push("Rabbit");
                }
            }
            return rabbitsOfUser;
        } else if (rabbitsOfUser.size() > 0 && (randomNumberRed <= 6 || randomNumberBlue <= 6)) {

            int currentNumberRabbit = rabbitsOfUser.size();
            for (int i = 0; i < Math.floor((currentNumberRabbit + 1) / 2); i++) {
                if (rabbitsOfFarm.size() > 0) {
                    rabbitsOfFarm.pop();
                    rabbitsOfUser.push("Rabbit");
                }
            }
            return rabbitsOfUser;
        }


        return rabbitsOfUser;
    }

    public Deque<String> setNumberRabbitsOfFarm(Deque<String> rabbitsOfFarm) {

        for (int i = 0; i < 60; i++) {
            rabbitsOfFarm.push("Rabbit");
        }
        return rabbitsOfFarm;
    }


}



