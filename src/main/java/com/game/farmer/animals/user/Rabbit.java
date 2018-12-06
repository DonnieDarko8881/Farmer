package com.game.farmer.animals.user;

import com.game.farmer.digs.BlueDig;
import com.game.farmer.digs.RedDig;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

import java.util.ArrayDeque;
import java.util.Deque;

public class Rabbit {



    public Deque<String> addToDequeOffRabbit(Deque<String> rabbitsOfUser, int randomNumberBlue, int randomNumberRed) {
        if (randomNumberRed <= 6 && randomNumberBlue <= 6 && rabbitsOfUser.size() == 0) {
            rabbitsOfUser.push("Rabbit");
            return rabbitsOfUser;
        } else if (rabbitsOfUser.size() > 0 && randomNumberRed <= 6 && randomNumberBlue <= 6) {

            int currentNumberRabbit = rabbitsOfUser.size();
            for (int i = 0; i < Math.floor((currentNumberRabbit + 2) / 2); i++) {
                rabbitsOfUser.push("Rabbit");
            }
            return rabbitsOfUser;
        } else if (rabbitsOfUser.size() > 0 && (randomNumberRed <= 6 || randomNumberBlue <= 6)) {

            int currentNumberRabbit = rabbitsOfUser.size();
            for (int i = 0; i < Math.floor((currentNumberRabbit + 1) / 2); i++) {
                rabbitsOfUser.push("Rabbit");
            }
            return rabbitsOfUser;
        }


        return rabbitsOfUser;
    }

}



