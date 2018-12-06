package com.game.farmer.digs;

import javafx.scene.image.Image;

public class RedDig extends Dig {
    public Image assignNumberToPictures(int randomNumber) {



        if (randomNumber >= 1 && randomNumber <= 6) {
            Image rabbit = new Image("/pictures/rabbit.png");
            return rabbit;
        } else if (randomNumber >= 7 && randomNumber <= 8) {
            Image sheep = new Image("/pictures/sheep.png");
            return sheep;
        } else if (randomNumber >= 9 && randomNumber <= 10) {
            Image pig = new Image("/pictures/pig.png");
            return pig;
        } else if (randomNumber == 11) {
            Image horse = new Image("/pictures/horse.png");
            return horse;
        } else if (randomNumber == 12) {
            Image fox = new Image("/pictures/fox.png");
            return fox;
        }
        return null;
    }

    public int addRabbit(){

        return 0;
    }
}
