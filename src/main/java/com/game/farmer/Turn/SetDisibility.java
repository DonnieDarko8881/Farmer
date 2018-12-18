package com.game.farmer.Turn;

import javafx.scene.control.Button;

import java.util.ArrayDeque;
import java.util.Deque;

public class SetDisibility {


    public static void setDisabilityComputer(Button rabbitToSheepButton, Button sheepToRabbitButton, Button sheepToSmallDogButton,
                                             Button smallDogtoSheepButton, Button sheepToPigButton,
                                             Button pigToSheepButton, Button pigToCowButton,
                                             Button cowToPigButton, Button cowToHorseButton,
                                             Button horseToCowButton,
                                             Button cowToBigDogButton, Button bigDogToCowButton,
                                             Deque<String> rabbitsOfComputer, Deque<String> sheepOfComputer,
                                             Deque<String> pigsOfComputer, Deque<String> cowsOfComputer,
                                             Deque<String> horsesOfComputer,
                                             Deque<String> bigDogsOfComputer,
                                             Deque<String> smallDogsOfComputer) {
        if (rabbitsOfComputer.size() >= 6) {
            rabbitToSheepButton.setDisable(false);
        } else if (rabbitsOfComputer.size() < 6) {
            rabbitToSheepButton.setDisable(true);
        }

        if (sheepOfComputer.size() > 0) {
            sheepToRabbitButton.setDisable(false);
            sheepToSmallDogButton.setDisable(false);
        } else if (sheepOfComputer.size() == 0) {
            sheepToRabbitButton.setDisable(true);
            sheepToSmallDogButton.setDisable(true);
        }

        if (sheepOfComputer.size() >= 2) {
            sheepToPigButton.setDisable(false);
        } else if (sheepOfComputer.size() < 2) {
            sheepToPigButton.setDisable(true);
        }


        if (pigsOfComputer.size() > 0) {
            pigToSheepButton.setDisable(false);
        } else if (pigsOfComputer.size() == 0) {
            pigToSheepButton.setDisable(true);
        }

        if (pigsOfComputer.size() >= 3) {
            pigToCowButton.setDisable(false);
        } else if (pigsOfComputer.size() < 3) {
            pigToCowButton.setDisable(true);
        }

        if (cowsOfComputer.size() > 0) {
            cowToBigDogButton.setDisable(false);
            cowToPigButton.setDisable(false);
        } else if (cowsOfComputer.size() == 0) {
            cowToBigDogButton.setDisable(true);
            cowToPigButton.setDisable(true);
        }

        if (cowsOfComputer.size() >= 2) {
            cowToHorseButton.setDisable(false);
        } else if (cowsOfComputer.size() < 2) {
            cowToHorseButton.setDisable(true);
        }

        if (horsesOfComputer.size() > 0) {
            horseToCowButton.setDisable(false);
        } else if (horsesOfComputer.size() == 0) {
            horseToCowButton.setDisable(true);
        }

        if (smallDogsOfComputer.size() > 0) {
            smallDogtoSheepButton.setDisable(false);
        } else if (smallDogsOfComputer.size() == 0) {
            smallDogtoSheepButton.setDisable(true);
        }

        if (bigDogsOfComputer.size() > 0) {
            bigDogToCowButton.setDisable(false);
        } else if (bigDogsOfComputer.size() == 0) {
            bigDogToCowButton.setDisable(true);
        }

    }

    public static void setDisabilityUser(Button rabbitToSheepButton, Button sheepToRabbitButton, Button sheepToSmallDogButton,
                                         Button smallDogtoSheepButton, Button sheepToPigButton,
                                         Button pigToSheepButton, Button pigToCowButton,
                                         Button cowToPigButton, Button cowToHorseButton,
                                         Button horseToCowButton,
                                         Button cowToBigDogButton, Button bigDogToCowButton,
                                         Deque<String> rabbitsOfUser, Deque<String> sheepOfUser,
                                         Deque<String> pigsOfUser, Deque<String> cowsOfUser,
                                         Deque<String> horsesOfUser,
                                         Deque<String> bigDogsOfUser,
                                         Deque<String> smallDogsOfUser) {
        if (rabbitsOfUser.size() >= 6) {
            rabbitToSheepButton.setDisable(false);
        } else if (rabbitsOfUser.size() < 6) {
            rabbitToSheepButton.setDisable(true);
        }

        if (sheepOfUser.size() > 0) {
            sheepToRabbitButton.setDisable(false);
            sheepToSmallDogButton.setDisable(false);
        } else if (sheepOfUser.size() == 0) {
            sheepToRabbitButton.setDisable(true);
            sheepToSmallDogButton.setDisable(true);
        }

        if (sheepOfUser.size() >= 2) {
            sheepToPigButton.setDisable(false);
        } else if (sheepOfUser.size() < 2) {
            sheepToPigButton.setDisable(true);
        }


        if (pigsOfUser.size() > 0) {
            pigToSheepButton.setDisable(false);
        } else if (pigsOfUser.size() == 0) {
            pigToSheepButton.setDisable(true);
        }

        if (pigsOfUser.size() >= 3) {
            pigToCowButton.setDisable(false);
        } else if (pigsOfUser.size() < 3) {
            pigToCowButton.setDisable(true);
        }

        if (cowsOfUser.size() > 0) {
            cowToBigDogButton.setDisable(false);
            cowToPigButton.setDisable(false);
        } else if (cowsOfUser.size() == 0) {
            cowToBigDogButton.setDisable(true);
            cowToPigButton.setDisable(true);
        }

        if (cowsOfUser.size() >= 2) {
            cowToHorseButton.setDisable(false);
        } else if (cowsOfUser.size() < 2) {
            cowToHorseButton.setDisable(true);
        }

        if (horsesOfUser.size() > 0) {
            horseToCowButton.setDisable(false);
        } else if (horsesOfUser.size() == 0) {
            horseToCowButton.setDisable(true);
        }

        if (smallDogsOfUser.size() > 0) {
            smallDogtoSheepButton.setDisable(false);
        } else if (smallDogsOfUser.size() == 0) {
            smallDogtoSheepButton.setDisable(true);
        }

        if (bigDogsOfUser.size() > 0) {
            bigDogToCowButton.setDisable(false);
        } else if (bigDogsOfUser.size() == 0) {
            bigDogToCowButton.setDisable(true);
        }

    }

}
