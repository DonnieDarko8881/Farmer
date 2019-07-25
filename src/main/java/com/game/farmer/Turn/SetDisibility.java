package com.game.farmer.Turn;

import javafx.scene.control.Button;

import java.util.ArrayDeque;
import java.util.Deque;

public class SetDisibility {

    public static void setDisability(Button rabbitToSheepButton, Button sheepToRabbitButton, Button sheepToSmallDogButton,
                                             Button smallDogtoSheepButton, Button sheepToPigButton,
                                             Button pigToSheepButton, Button pigToCowButton,
                                             Button cowToPigButton, Button cowToHorseButton,
                                             Button horseToCowButton,
                                             Button cowToBigDogButton, Button bigDogToCowButton,
                                              int rabbitsOfComputer,  int sheepOfComputer,
                                              int pigsOfComputer,  int cowsOfComputer,
                                              int horsesOfComputer,
                                              int bigDogsOfComputer,
                                              int smallDogsOfComputer) {
        if (rabbitsOfComputer  >= 6) {
            rabbitToSheepButton.setDisable(false);
        } else if (rabbitsOfComputer  < 6) {
            rabbitToSheepButton.setDisable(true);
        }

        if (sheepOfComputer  > 0) {
            sheepToRabbitButton.setDisable(false);
            sheepToSmallDogButton.setDisable(false);
        } else if (sheepOfComputer  == 0) {
            sheepToRabbitButton.setDisable(true);
            sheepToSmallDogButton.setDisable(true);
        }

        if (sheepOfComputer  >= 2) {
            sheepToPigButton.setDisable(false);
        } else if (sheepOfComputer  < 2) {
            sheepToPigButton.setDisable(true);
        }


        if (pigsOfComputer  > 0) {
            pigToSheepButton.setDisable(false);
        } else if (pigsOfComputer  == 0) {
            pigToSheepButton.setDisable(true);
        }

        if (pigsOfComputer  >= 3) {
            pigToCowButton.setDisable(false);
        } else if (pigsOfComputer  < 3) {
            pigToCowButton.setDisable(true);
        }

        if (cowsOfComputer  > 0) {
            cowToBigDogButton.setDisable(false);
            cowToPigButton.setDisable(false);
        } else if (cowsOfComputer  == 0) {
            cowToBigDogButton.setDisable(true);
            cowToPigButton.setDisable(true);
        }

        if (cowsOfComputer  >= 2) {
            cowToHorseButton.setDisable(false);
        } else if (cowsOfComputer  < 2) {
            cowToHorseButton.setDisable(true);
        }

        if (horsesOfComputer  > 0) {
            horseToCowButton.setDisable(false);
        } else if (horsesOfComputer  == 0) {
            horseToCowButton.setDisable(true);
        }

        if (smallDogsOfComputer  > 0) {
            smallDogtoSheepButton.setDisable(false);
        } else if (smallDogsOfComputer  == 0) {
            smallDogtoSheepButton.setDisable(true);
        }

        if (bigDogsOfComputer  > 0) {
            bigDogToCowButton.setDisable(false);
        } else if (bigDogsOfComputer  == 0) {
            bigDogToCowButton.setDisable(true);
        }

    }


}
