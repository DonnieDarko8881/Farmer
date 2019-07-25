package com.game.farmer.digs;

import javafx.scene.image.Image;

public class BlueDig extends Dig {

    public Image assignNumberToPictures(int randomNumber) {

        if (randomNumber >= 1 && randomNumber <= 6) {
            Image rabbit = new Image("/pictures/rabbit.png");
            return rabbit;
        } else if(randomNumber >= 7 && randomNumber <= 9) {
            Image sheep = new Image("/pictures/sheep.png");
            return sheep;
        }  else if(randomNumber ==10) {
            Image pig = new Image("/pictures/pig.png");
            return pig;
        } else if(randomNumber ==11) {
            Image cow = new Image("/pictures/cow.png");
            return cow;
        } else if(randomNumber ==12) {
            Image wolf = new Image("/pictures/wolf.png");
            return wolf;
        }

       return null;
    }

}
