package com.game.fx.controller;

import com.game.farmer.Turn.SetDisibility;
import com.game.farmer.Turn.Turn;
import com.game.farmer.animals.*;
import com.game.farmer.animals.enemy.Fox;
import com.game.farmer.animals.enemy.Wolf;
import com.game.farmer.digs.BlueDig;
import com.game.farmer.digs.RedDig;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Pair;

import java.io.IOException;

public class MainController {


    @FXML
    private ImageView userBlueDigResult;

    @FXML
    private ImageView userRedDigResult;

    @FXML
    private ImageView computerBlueDigResult;

    @FXML
    private ImageView computerRedDigResult;


    @FXML
    private ImageView userRabbit;

    @FXML
    private ImageView computerRabbit;

    @FXML
    private ImageView userSheep;

    @FXML
    private ImageView computerSheep;

    @FXML
    private ImageView userPig;

    @FXML
    private ImageView computerPig;

    @FXML
    private ImageView userCow;

    @FXML
    private ImageView computerCow;

    @FXML
    private ImageView userHorse;

    @FXML
    private ImageView computerHorse;

    @FXML
    private ImageView userSmallDog;

    @FXML
    private ImageView computerSmallDog;

    @FXML
    private ImageView userBigDog;

    @FXML
    private ImageView computerBigDog;


    @FXML
    private Label countUserRabbit;

    @FXML
    private Label countComputerRabbit;

    @FXML
    private Label countUserSheep;

    @FXML
    private Label countComputerSheep;

    @FXML
    private Label countUserPig;

    @FXML
    private Label countComputerPig;

    @FXML
    private Label countUserCow;

    @FXML
    private Label countComputerCow;

    @FXML
    private Label countUserHorse;

    @FXML
    private Label countComputerHorse;

    @FXML
    private Label countUserSmallDog;

    @FXML
    private Label countComputerSmallDog;

    @FXML
    private Label countUserBigDog;

    @FXML
    private Label countComputerBigDog;

    @FXML
    private Label userResultLabel;

    @FXML
    private Label computerResultLabel;

    @FXML
    private Button rabbitToSheepButton;

    @FXML
    private Button sheepToRabbitButton;

    @FXML
    private Button sheepToPigButton;

    @FXML
    private Button pigToSheepButton;

    @FXML
    private Button pigToCowButton;

    @FXML
    private Button cowToPigButton;

    @FXML
    private Button cowToHorseButton;

    @FXML
    private Button horseToCowButton;

    @FXML
    private Button sheepToSmallDogButton;

    @FXML
    private Button smallDogtoSheepButton;

    @FXML
    private Button bigDogToCowButton;

    @FXML
    private Button cowToBigDogButton;


    public MainController() {

    }

    @FXML
    public void initialize() {
        rabbitsOfFarm = 60;
        sheepOfFarm = 24;
        pigsOfFarm = 20;
        cowsOfFarm = 12;
        horsesOfFarm = 6;
        smallDogsOfFarm = 4;
        bigDogsOfFarm = 2;

        rabbitsOfUser = 0;
        sheepOfUser = 0;
        pigsOfUser = 0;
        cowsOfUser = 0;
        horsesOfUser = 0;
        smallDogsOfUser = 0;
        bigDogsOfUser = 0;

        rabbitsOfComputer = 0;
        sheepOfComputer = 0;
        pigsOfComputer = 0;
        cowsOfComputer = 0;
        horsesOfComputer = 0;
        smallDogsOfComputer = 0;
        bigDogsOfComputer = 0;
        turn.firstTurn(userResultLabel);

    }

    BlueDig blueDig = new BlueDig();
    RedDig redDig = new RedDig();
    Rabbit rabbit = new Rabbit();
    Sheep sheep = new Sheep();
    Pig pig = new Pig();
    Cow cow = new Cow();
    Horse horse = new Horse();
    Wolf wolf = new Wolf();
    Fox fox = new Fox();
    Turn turn = new Turn();


    int rabbitsOfFarm;
    int sheepOfFarm;
    int pigsOfFarm;
    int cowsOfFarm;
    int horsesOfFarm;
    int smallDogsOfFarm;
    int bigDogsOfFarm;


    int rabbitsOfUser;
    int sheepOfUser;
    int pigsOfUser;
    int cowsOfUser;
    int horsesOfUser;
    int smallDogsOfUser;
    int bigDogsOfUser;

    int rabbitsOfComputer;
    int sheepOfComputer;
    int pigsOfComputer;
    int cowsOfComputer;
    int horsesOfComputer;
    int smallDogsOfComputer;
    int bigDogsOfComputer;

    public void setDisabledButtonInCaseShortageOfAnimals() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {


            if (rabbitsOfFarm < 6) {
                sheepToRabbitButton.setDisable(true);
            } else if (rabbitsOfUser >= 6) {
                rabbitToSheepButton.setDisable(false);
            }

            if (sheepOfFarm < 1) {
                rabbitToSheepButton.setDisable(true);
                smallDogtoSheepButton.setDisable(true);
            }

            if (sheepOfFarm < 2) {
                pigToSheepButton.setDisable(true);
            } else if (sheepOfFarm >= 2 && pigsOfUser >= 1) {
                pigToSheepButton.setDisable(false);
            }

            if (pigsOfFarm < 1) {
                sheepToPigButton.setDisable(true);
            } else if (pigsOfFarm >= 1 && sheepOfUser >= 2) {
                sheepToPigButton.setDisable(false);
            }

            if (pigsOfFarm < 3) {
                cowToPigButton.setDisable(true);
            } else if (pigsOfFarm >= 3 && cowsOfUser >= 1) {
                cowToPigButton.setDisable(false);
            }

            if (cowsOfFarm < 1) {
                pigToCowButton.setDisable(true);
                bigDogToCowButton.setDisable(true);
            } else if (cowsOfFarm >= 1 && pigsOfUser >= 3) {
                pigToCowButton.setDisable(false);
            }

            if (cowsOfFarm < 2) {
                horseToCowButton.setDisable(true);
            } else if (cowsOfFarm >= 2 && horsesOfUser >= 1) {
                horseToCowButton.setDisable(false);
            }


            if (horsesOfFarm < 1) {
                cowToHorseButton.setDisable(true);
            } else if (horsesOfFarm >= 1 && cowsOfUser >= 2) {
                cowToHorseButton.setDisable(false);
            }

            if (smallDogsOfFarm < 1) {
                sheepToSmallDogButton.setDisable(true);
            } else if (smallDogsOfFarm >= 1 && sheepOfUser >= 1) {
                sheepToSmallDogButton.setDisable(false);
            }
            if (sheepOfFarm >= 1 && smallDogsOfUser >= 1) {
                smallDogtoSheepButton.setDisable(false);
            }

            if (bigDogsOfFarm < 1) {
                cowToBigDogButton.setDisable(true);
            } else if (bigDogsOfFarm >= 1 && cowsOfUser >= 1) {
                cowToBigDogButton.setDisable(false);
            }

        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (rabbitsOfFarm < 6) {
                sheepToRabbitButton.setDisable(true);
            } else if (rabbitsOfComputer >= 6) {
                rabbitToSheepButton.setDisable(false);
            }

            if (sheepOfFarm < 1) {
                rabbitToSheepButton.setDisable(true);
                smallDogtoSheepButton.setDisable(true);
            }

            if (sheepOfFarm < 2) {
                pigToSheepButton.setDisable(true);
            } else if (sheepOfFarm >= 2 && pigsOfComputer >= 1) {
                pigToSheepButton.setDisable(false);
            }

            if (pigsOfFarm < 1) {
                sheepToPigButton.setDisable(true);
            } else if (pigsOfFarm >= 1 && sheepOfComputer >= 2) {
                sheepToPigButton.setDisable(false);
            }

            if (pigsOfFarm < 3) {
                cowToPigButton.setDisable(true);
            } else if (pigsOfFarm >= 3 && cowsOfComputer >= 1) {
                cowToPigButton.setDisable(false);
            }

            if (cowsOfFarm < 1) {
                pigToCowButton.setDisable(true);
                bigDogToCowButton.setDisable(true);
            } else if (cowsOfFarm >= 1 && pigsOfComputer >= 3) {
                pigToCowButton.setDisable(false);
            }

            if (cowsOfFarm < 2) {
                horseToCowButton.setDisable(true);
            } else if (cowsOfFarm >= 2 && horsesOfComputer >= 1) {
                horseToCowButton.setDisable(false);
            }


            if (horsesOfFarm < 1) {
                cowToHorseButton.setDisable(true);
            } else if (horsesOfFarm >= 1 && cowsOfComputer >= 2) {
                cowToHorseButton.setDisable(false);
            }

            if (smallDogsOfFarm < 1) {
                sheepToSmallDogButton.setDisable(true);
            } else if (smallDogsOfFarm >= 1 && sheepOfComputer >= 1) {
                sheepToSmallDogButton.setDisable(false);
            }
            if (sheepOfFarm >= 1 && smallDogsOfComputer >= 1) {
                smallDogtoSheepButton.setDisable(false);
            }

            if (bigDogsOfFarm < 1) {
                cowToBigDogButton.setDisable(true);
            } else if (bigDogsOfFarm >= 1 && cowsOfComputer >= 1) {
                cowToBigDogButton.setDisable(false);
            }
        }
    }


    public void exchangeRabbitToSheep() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (sheepOfFarm > 0) {
                for (int i = 0; i < 6; i++) {
                    if (rabbitsOfUser > 0) {
                        rabbitsOfUser--;
                        rabbitsOfFarm++;
                    }
                }
                sheepOfFarm--;
                sheepOfUser++;
            }

            countUserSheep.setText(String.valueOf(sheepOfUser));
            if (sheepOfUser > 0) {
                sheepToRabbitButton.setDisable(false);
                sheepToSmallDogButton.setDisable(false);
                userSheep.setOpacity(1.0);
            }
            if (sheepOfUser >= 2) {
                sheepToPigButton.setDisable(false);
            }

            countUserRabbit.setText(String.valueOf(rabbitsOfUser));
            if (rabbitsOfUser == 0) {
                userRabbit.setOpacity(0.4);
            }
            if (rabbitsOfUser < 6) {
                rabbitToSheepButton.setDisable(true);
            }

            setDisabledButtonInCaseShortageOfAnimals();

        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (sheepOfFarm > 0) {
                for (int i = 0; i < 6; i++) {
                    rabbitsOfComputer--;
                    rabbitsOfFarm++;
                }
                sheepOfFarm--;
                sheepOfComputer++;
            }

            countComputerSheep.setText(String.valueOf(sheepOfComputer));
            if (sheepOfComputer > 0) {
                sheepToRabbitButton.setDisable(false);
                sheepToSmallDogButton.setDisable(false);
                computerSheep.setOpacity(1.0);
            }
            if (sheepOfComputer >= 2) {
                sheepToPigButton.setDisable(false);
            }

            countComputerRabbit.setText(String.valueOf(rabbitsOfComputer));
            if (rabbitsOfComputer == 0) {
                computerRabbit.setOpacity(0.4);
            }
            if (rabbitsOfComputer < 6) {
                rabbitToSheepButton.setDisable(true);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }

        win(rabbitsOfUser, sheepOfUser, pigsOfUser, cowsOfUser, horsesOfUser, rabbitsOfComputer,
                sheepOfComputer, pigsOfComputer, cowsOfComputer, horsesOfComputer);
    }

    public void exchangeSheepToRabbits() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (rabbitsOfFarm >= 6) {
                sheepOfUser--;
                sheepOfFarm++;
            }
            for (int i = 0; i < 6; i++) {
                if (rabbitsOfFarm > 0) {
                    rabbitsOfFarm--;
                    rabbitsOfUser++;
                }
            }

            countUserSheep.setText(String.valueOf(sheepOfUser));
            if (sheepOfUser == 0) {
                sheepToRabbitButton.setDisable(true);
                sheepToSmallDogButton.setDisable(true);
                userSheep.setOpacity(0.4);
            }
            if (sheepOfUser < 2) {
                sheepToPigButton.setDisable(true);
            }

            countUserRabbit.setText(String.valueOf(rabbitsOfUser));
            if (rabbitsOfUser > 0) {
                userRabbit.setOpacity(1.0);
            }
            if (rabbitsOfUser > 6) {
                rabbitToSheepButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (rabbitsOfFarm >= 6) {
                sheepOfComputer--;
                sheepOfFarm++;
            }
            for (int i = 0; i < 6; i++) {
                if (rabbitsOfFarm > 0) {
                    rabbitsOfFarm--;
                    rabbitsOfComputer++;
                }
            }

            countComputerSheep.setText(String.valueOf(sheepOfComputer));
            if (sheepOfComputer == 0) {
                sheepToRabbitButton.setDisable(true);
                sheepToSmallDogButton.setDisable(true);
                computerSheep.setOpacity(0.4);
            }
            if (sheepOfComputer < 2) {
                sheepToPigButton.setDisable(true);
            }

            countComputerRabbit.setText(String.valueOf(rabbitsOfComputer));
            if (rabbitsOfComputer > 0) {
                computerRabbit.setOpacity(1.0);
            }
            if (rabbitsOfComputer > 6) {
                rabbitToSheepButton.setDisable(false);
            }
            setDisabledButtonInCaseShortageOfAnimals();
        }
        win(rabbitsOfUser, sheepOfUser, pigsOfUser, cowsOfUser, horsesOfUser, rabbitsOfComputer,
                sheepOfComputer, pigsOfComputer, cowsOfComputer, horsesOfComputer);
    }

    public void exchangeSheepToPig() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (pigsOfFarm > 0) {
                for (int i = 0; i < 2; i++) {
                    sheepOfUser--;
                    sheepOfFarm++;
                }
                pigsOfFarm--;
                pigsOfUser++;
            }

            countUserPig.setText(String.valueOf(pigsOfUser));
            if (pigsOfUser > 0) {
                pigToSheepButton.setDisable(false);
                userPig.setOpacity(1.0);
            }
            if (pigsOfUser >= 3) {
                pigToCowButton.setDisable(false);
            }


            countUserSheep.setText(String.valueOf(sheepOfUser));
            if (sheepOfUser == 0) {
                userSheep.setOpacity(0.4);
            }
            if (sheepOfUser < 2) {
                sheepToPigButton.setDisable(true);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (pigsOfFarm > 0) {
                for (int i = 0; i < 2; i++) {
                    sheepOfComputer--;
                    sheepOfFarm++;
                }
                pigsOfFarm--;
                pigsOfComputer++;
            }

            countComputerPig.setText(String.valueOf(pigsOfComputer));
            if (pigsOfComputer > 0) {
                pigToSheepButton.setDisable(false);
                computerPig.setOpacity(1.0);
            }
            if (pigsOfComputer >= 3) {
                pigToCowButton.setDisable(false);
            }


            countComputerSheep.setText(String.valueOf(sheepOfComputer));
            if (sheepOfComputer == 0) {
                computerSheep.setOpacity(0.4);
            }
            if (sheepOfComputer < 2) {
                sheepToPigButton.setDisable(true);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
        win(rabbitsOfUser, sheepOfUser, pigsOfUser, cowsOfUser, horsesOfUser, rabbitsOfComputer,
                sheepOfComputer, pigsOfComputer, cowsOfComputer, horsesOfComputer);
    }

    public void exchangePigToSheep() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (sheepOfFarm >= 2) {
                pigsOfUser--;
                pigsOfFarm++;

                for (int i = 0; i < 2; i++) {
                    if (sheepOfFarm > 0) {
                        sheepOfFarm--;
                        sheepOfUser++;
                    }
                }
            }

            countUserPig.setText(String.valueOf(pigsOfUser));
            if (pigsOfUser == 0) {
                pigToSheepButton.setDisable(true);
                userPig.setOpacity(0.4);
            }
            if (pigsOfUser < 3) {
                pigToCowButton.setDisable(true);
            }


            countUserSheep.setText(String.valueOf(sheepOfUser));
            if (sheepOfUser > 0) {
                userSheep.setOpacity(1.0);
                sheepToRabbitButton.setDisable(false);
                sheepToSmallDogButton.setDisable(false);
            }
            if (sheepOfUser >= 2) {
                sheepToPigButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (sheepOfFarm >= 2) {
                if (pigsOfComputer > 0) {
                    pigsOfComputer--;
                    pigsOfFarm++;
                }
                for (int i = 0; i < 2; i++) {
                    if (sheepOfFarm > 0) {
                        sheepOfFarm--;
                        sheepOfComputer++;
                    }
                }
            }

            countComputerPig.setText(String.valueOf(pigsOfComputer));
            if (pigsOfComputer == 0) {
                pigToSheepButton.setDisable(true);
                computerPig.setOpacity(0.4);
            }
            if (pigsOfComputer < 3) {
                pigToCowButton.setDisable(true);
            }

            countComputerSheep.setText(String.valueOf(sheepOfComputer));
            if (sheepOfComputer > 0) {
                computerSheep.setOpacity(1.0);
                sheepToRabbitButton.setDisable(false);
                sheepToSmallDogButton.setDisable(false);
            }
            if (sheepOfComputer >= 2) {
                sheepToPigButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
        win(rabbitsOfUser, sheepOfUser, pigsOfUser, cowsOfUser, horsesOfUser, rabbitsOfComputer,
                sheepOfComputer, pigsOfComputer, cowsOfComputer, horsesOfComputer);
    }

    public void exchangePigToCow() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (cowsOfFarm > 0) {
                for (int i = 0; i < 3; i++) {
                    pigsOfUser--;
                    pigsOfFarm++;
                }
                cowsOfFarm--;
                cowsOfUser++;
            }

            countUserCow.setText(String.valueOf(cowsOfUser));
            if (cowsOfUser > 0) {
                cowToPigButton.setDisable(false);
                cowToBigDogButton.setDisable(false);
                userCow.setOpacity(1.0);
            }
            if (cowsOfUser >= 2) {
                cowToHorseButton.setDisable(false);
            }

            countUserPig.setText(String.valueOf(pigsOfUser));
            if (pigsOfUser == 0) {
                userPig.setOpacity(0.4);
            }
            if (pigsOfUser < 3) {
                pigToCowButton.setDisable(true);
            } else if (pigsOfUser >= 3) {
                pigToCowButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (cowsOfFarm > 0) {
                for (int i = 0; i < 3; i++) {
                    pigsOfComputer--;
                    pigsOfFarm++;
                }
                cowsOfFarm--;
                cowsOfComputer++;
            }

            countComputerCow.setText(String.valueOf(cowsOfComputer));
            if (cowsOfComputer > 0) {
                cowToPigButton.setDisable(false);
                cowToBigDogButton.setDisable(false);
                computerCow.setOpacity(1.0);
            }
            if (cowsOfComputer >= 2) {
                cowToHorseButton.setDisable(false);
            }

            countComputerPig.setText(String.valueOf(pigsOfComputer));
            if (pigsOfComputer == 0) {
                computerPig.setOpacity(0.4);
            }
            if (pigsOfComputer < 3) {
                pigToCowButton.setDisable(true);
            } else if (pigsOfComputer >= 3) {
                pigToCowButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
        win(rabbitsOfUser, sheepOfUser, pigsOfUser, cowsOfUser, horsesOfUser, rabbitsOfComputer,
                sheepOfComputer, pigsOfComputer, cowsOfComputer, horsesOfComputer);
    }

    public void exchangeCowToPig() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (pigsOfFarm >= 3) {
                cowsOfUser--;
                cowsOfFarm++;

                for (int i = 0; i < 3; i++) {
                    if (pigsOfFarm > 0) {
                        pigsOfFarm--;
                        pigsOfUser++;
                    }
                }
            }

            countUserCow.setText(String.valueOf(cowsOfUser));
            if (cowsOfUser == 0) {
                cowToPigButton.setDisable(true);
                cowToBigDogButton.setDisable(true);
                userCow.setOpacity(0.4);
            }
            if (cowsOfUser < 2) {
                cowToHorseButton.setDisable(true);
            }


            countUserPig.setText(String.valueOf(pigsOfUser));
            if (pigsOfUser > 0) {
                userPig.setOpacity(1.0);
                pigToSheepButton.setDisable(false);
            }
            if (pigsOfUser >= 3) {
                pigToCowButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (pigsOfFarm >= 3) {
                cowsOfComputer--;
                cowsOfFarm++;

                for (int i = 0; i < 3; i++) {
                    if (pigsOfFarm > 0) {
                        pigsOfFarm--;
                        pigsOfComputer++;
                    }
                }
            }

            countComputerCow.setText(String.valueOf(cowsOfComputer));
            if (cowsOfComputer == 0) {
                cowToPigButton.setDisable(true);
                cowToBigDogButton.setDisable(true);
                computerCow.setOpacity(0.4);
            }
            if (cowsOfComputer < 2) {
                cowToHorseButton.setDisable(true);
            }

            countComputerPig.setText(String.valueOf(pigsOfComputer));
            if (pigsOfComputer > 0) {
                computerPig.setOpacity(1.0);
                pigToSheepButton.setDisable(false);
            }
            if (pigsOfComputer >= 3) {
                pigToCowButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
        win(rabbitsOfUser, sheepOfUser, pigsOfUser, cowsOfUser, horsesOfUser, rabbitsOfComputer,
                sheepOfComputer, pigsOfComputer, cowsOfComputer, horsesOfComputer);
    }

    public void exchangeCowToHorse() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (horsesOfFarm > 0) {
                for (int i = 0; i < 2; i++) {
                    cowsOfUser--;
                    cowsOfFarm++;
                }
                horsesOfFarm--;
                horsesOfUser++;
            }

            countUserHorse.setText(String.valueOf(horsesOfUser));
            if (horsesOfUser > 0) {
                horseToCowButton.setDisable(false);
                userHorse.setOpacity(1.0);
            }

            countUserCow.setText(String.valueOf(cowsOfUser));
            if (cowsOfUser == 0) {
                userCow.setOpacity(0.4);
            }
            if (cowsOfUser < 2) {
                cowToHorseButton.setDisable(true);
            } else if (cowsOfUser >= 2) {
                cowToHorseButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (horsesOfFarm > 0) {
                for (int i = 0; i < 2; i++) {
                    cowsOfComputer--;
                    cowsOfFarm++;
                }
                horsesOfFarm--;
                horsesOfComputer++;
            }

            countComputerHorse.setText(String.valueOf(horsesOfComputer));
            if (horsesOfComputer > 0) {
                horseToCowButton.setDisable(false);
                computerHorse.setOpacity(1.0);
            }

            countComputerCow.setText(String.valueOf(cowsOfComputer));
            if (cowsOfComputer == 0) {
                computerCow.setOpacity(0.4);
            }
            if (cowsOfComputer < 2) {
                cowToHorseButton.setDisable(true);
            } else if (cowsOfComputer >= 2) {
                cowToHorseButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
        win(rabbitsOfUser, sheepOfUser, pigsOfUser, cowsOfUser, horsesOfUser, rabbitsOfComputer,
                sheepOfComputer, pigsOfComputer, cowsOfComputer, horsesOfComputer);
    }

    public void exchangeHorseToCow() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (cowsOfFarm >= 2) {
                horsesOfUser--;
                horsesOfFarm++;

                for (int i = 0; i < 3; i++) {
                    if (cowsOfFarm > 0) {
                        cowsOfFarm--;
                        cowsOfUser++;
                    }
                }
            }

            countUserHorse.setText(String.valueOf(horsesOfUser));
            if (horsesOfUser == 0) {
                horseToCowButton.setDisable(true);
                userHorse.setOpacity(0.4);
            }

            countUserCow.setText(String.valueOf(cowsOfUser));
            if (cowsOfUser > 0) {
                userCow.setOpacity(1.0);
                cowToPigButton.setDisable(false);
            }
            if (cowsOfUser >= 2) {
                cowToHorseButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (cowsOfFarm >= 2) {
                horsesOfComputer--;
                horsesOfFarm++;

                for (int i = 0; i < 3; i++) {
                    if (cowsOfFarm > 0) {
                        cowsOfFarm--;
                        cowsOfComputer++;
                    }
                }
            }

            countComputerHorse.setText(String.valueOf(horsesOfComputer));
            if (horsesOfComputer == 0) {
                horseToCowButton.setDisable(true);
                computerHorse.setOpacity(0.4);
            }


            countComputerCow.setText(String.valueOf(cowsOfComputer));
            if (cowsOfComputer > 0) {
                computerCow.setOpacity(1.0);
                cowToPigButton.setDisable(false);
            }
            if (cowsOfComputer >= 2) {
                cowToHorseButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
        win(rabbitsOfUser, sheepOfUser, pigsOfUser, cowsOfUser, horsesOfUser, rabbitsOfComputer,
                sheepOfComputer, pigsOfComputer, cowsOfComputer, horsesOfComputer);
    }


    public void exchangeSheepToSmallDog() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (smallDogsOfFarm >= 1) {
                sheepOfUser--;
                sheepOfFarm++;
                smallDogsOfFarm--;
                smallDogsOfUser++;
            }

            countUserSmallDog.setText(String.valueOf(smallDogsOfUser));
            if (smallDogsOfUser > 0) {
                userSmallDog.setOpacity(1.0);
                smallDogtoSheepButton.setDisable(false);
            }

            countUserSheep.setText(String.valueOf(sheepOfUser));
            if (sheepOfUser == 0) {
                sheepToRabbitButton.setDisable(true);
                sheepToSmallDogButton.setDisable(true);
                userSheep.setOpacity(0.4);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (smallDogsOfFarm >= 1) {
                sheepOfComputer--;
                sheepOfFarm++;
                smallDogsOfFarm--;
                smallDogsOfComputer++;
            }

            countComputerSmallDog.setText(String.valueOf(smallDogsOfComputer));
            if (smallDogsOfComputer > 0) {
                computerSmallDog.setOpacity(1.0);
                smallDogtoSheepButton.setDisable(false);
            }

            countComputerSheep.setText(String.valueOf(sheepOfComputer));
            if (sheepOfComputer == 0) {
                sheepToRabbitButton.setDisable(true);
                sheepToSmallDogButton.setDisable(true);
                computerSheep.setOpacity(0.4);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
    }

    public void exchangeSmallDogToSheep() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (sheepOfFarm >= 1) {
                smallDogsOfUser--;
                smallDogsOfFarm++;
                sheepOfFarm--;
                sheepOfUser++;
            }

            countUserSheep.setText(String.valueOf(sheepOfUser));
            if (sheepOfUser > 0) {
                userSheep.setOpacity(1.0);
                sheepToSmallDogButton.setDisable(false);
                sheepToRabbitButton.setDisable(false);
            }
            if (sheepOfUser >= 2) {
                sheepToPigButton.setDisable(false);
            }

            countUserSmallDog.setText(String.valueOf(smallDogsOfUser));
            if (smallDogsOfUser == 0) {
                smallDogtoSheepButton.setDisable(true);
                userSmallDog.setOpacity(0.4);
            }
            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (sheepOfFarm >= 1) {
                smallDogsOfComputer--;
                smallDogsOfFarm++;
                sheepOfFarm--;
                sheepOfComputer++;
            }

            countComputerSheep.setText(String.valueOf(sheepOfComputer));
            if (sheepOfComputer > 0) {
                computerSheep.setOpacity(1.0);
                sheepToSmallDogButton.setDisable(false);
                sheepToRabbitButton.setDisable(false);
            }
            if (sheepOfComputer >= 2) {
                sheepToPigButton.setDisable(false);
            }

            countComputerSmallDog.setText(String.valueOf(smallDogsOfComputer));
            if (smallDogsOfComputer == 0) {
                smallDogtoSheepButton.setDisable(true);
                computerSmallDog.setOpacity(0.4);
            }
            setDisabledButtonInCaseShortageOfAnimals();
        }
        win(rabbitsOfUser, sheepOfUser, pigsOfUser, cowsOfUser, horsesOfUser, rabbitsOfComputer,
                sheepOfComputer, pigsOfComputer, cowsOfComputer, horsesOfComputer);
    }

    public void exchangeCowToBigDog() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (bigDogsOfFarm >= 1) {
                cowsOfUser--;
                cowsOfFarm++;
                bigDogsOfFarm--;
                bigDogsOfUser++;
            }

            countUserBigDog.setText(String.valueOf(bigDogsOfUser));
            if (bigDogsOfUser > 0) {
                userBigDog.setOpacity(1.0);
                bigDogToCowButton.setDisable(false);
            }

            countUserCow.setText(String.valueOf(cowsOfUser));
            if (cowsOfUser == 0) {
                cowToPigButton.setDisable(true);
                cowToBigDogButton.setDisable(true);
                userCow.setOpacity(0.4);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (bigDogsOfFarm >= 1) {
                cowsOfComputer--;
                cowsOfFarm++;
                bigDogsOfFarm--;
                bigDogsOfComputer++;
            }

            countComputerBigDog.setText(String.valueOf(bigDogsOfComputer));
            if (bigDogsOfComputer > 0) {
                computerBigDog.setOpacity(1.0);
                bigDogToCowButton.setDisable(false);
            }

            countComputerCow.setText(String.valueOf(cowsOfComputer));
            if (cowsOfComputer == 0) {
                cowToPigButton.setDisable(true);
                cowToBigDogButton.setDisable(true);
                computerCow.setOpacity(0.4);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
    }

    public void exchangeBigDogToCow() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (cowsOfFarm >= 1) {
                bigDogsOfUser--;
                bigDogsOfFarm++;
                cowsOfFarm--;
                cowsOfUser++;
            }

            countUserCow.setText(String.valueOf(cowsOfUser));
            if (cowsOfUser > 0) {
                userCow.setOpacity(1.0);
                cowToBigDogButton.setDisable(false);
                cowToPigButton.setDisable(false);
            }
            if (cowsOfUser >= 2) {
                cowToHorseButton.setDisable(false);
            }

            countUserBigDog.setText(String.valueOf(bigDogsOfUser));
            if (bigDogsOfUser == 0) {
                bigDogToCowButton.setDisable(true);
                userBigDog.setOpacity(0.4);
            }
            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (cowsOfFarm >= 1) {
                bigDogsOfComputer--;
                bigDogsOfFarm++;
                cowsOfFarm--;
                cowsOfComputer++;
            }

            countComputerCow.setText(String.valueOf(cowsOfComputer));
            if (cowsOfComputer > 0) {
                computerCow.setOpacity(1.0);
                cowToBigDogButton.setDisable(false);
                cowToPigButton.setDisable(false);
            }
            if (cowsOfComputer >= 2) {
                cowToHorseButton.setDisable(false);
            }

            countComputerBigDog.setText(String.valueOf(bigDogsOfComputer));
            if (bigDogsOfComputer == 0) {
                bigDogToCowButton.setDisable(true);
                computerBigDog.setOpacity(0.4);
            }
            setDisabledButtonInCaseShortageOfAnimals();
        }
        win(rabbitsOfUser, sheepOfUser, pigsOfUser, cowsOfUser, horsesOfUser, rabbitsOfComputer,
                sheepOfComputer, pigsOfComputer, cowsOfComputer, horsesOfComputer);
    }


    public void randomResult() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            int randomNumberRed = RedDig.randomNumber();
            int randomNumberBlue = BlueDig.randomNumber();

            userBlueDigResult.setImage(blueDig.assignNumberToPictures(randomNumberBlue));
            userRedDigResult.setImage(redDig.assignNumberToPictures(randomNumberRed));


            final Pair rabbitResult = rabbit.addToDequeOffRabbit(rabbitsOfUser, rabbitsOfFarm,
                    randomNumberBlue, randomNumberRed);
            rabbitsOfUser = (int) rabbitResult.getKey();
            rabbitsOfFarm = (int) rabbitResult.getValue();
            countUserRabbit.setText(String.valueOf(rabbitsOfUser));

            if (rabbitsOfUser > 0) {
                userRabbit.setOpacity(1.0);
            }
            if (rabbitsOfUser >= 6) {
                rabbitToSheepButton.setDisable(false);
            }

            final Pair rabbitResultafterFox = fox.removeRabbits(rabbitsOfUser, rabbitsOfFarm, smallDogsOfUser,
                    smallDogsOfFarm, randomNumberRed);
            rabbitsOfUser = (int) rabbitResultafterFox.getKey();
            rabbitsOfFarm = (int) rabbitResultafterFox.getValue();
            countUserRabbit.setText(String.valueOf(rabbitsOfUser));
            if (rabbitsOfUser == 0) {
                userRabbit.setOpacity(0.4);
                rabbitToSheepButton.setDisable(true);
            }

            final Pair smallDogsAfterFox = fox.removeSmallDog(rabbitsOfUser, rabbitsOfFarm, smallDogsOfUser,
                    smallDogsOfFarm, randomNumberRed);
            smallDogsOfUser = (int) smallDogsAfterFox.getKey();
            smallDogsOfFarm = (int) smallDogsAfterFox.getValue();
            countUserSmallDog.setText(String.valueOf(smallDogsOfUser));
            if (smallDogsOfUser == 0) {
                userSmallDog.setOpacity(0.4);
                smallDogtoSheepButton.setDisable(true);
            }

            final Pair sheepResult = sheep.addToDequeOffSheep(sheepOfUser, sheepOfFarm, randomNumberBlue, randomNumberRed);
            sheepOfUser = (int) sheepResult.getKey();
            sheepOfFarm = (int) sheepResult.getValue();
            countUserSheep.setText(String.valueOf(sheepOfUser));
            if (sheepOfUser > 0) {
                userSheep.setOpacity(1.0);
                sheepToSmallDogButton.setDisable(false);
                sheepToRabbitButton.setDisable(false);
            }
            if (sheepOfUser >= 2) {
                sheepToPigButton.setDisable(false);
            }

            final Pair pigResult = pig.addToDequeOffPig(pigsOfUser, pigsOfFarm, randomNumberBlue, randomNumberRed);
            pigsOfUser = (int) pigResult.getKey();
            pigsOfFarm = (int) pigResult.getValue();
            countUserPig.setText(String.valueOf(pigsOfUser));
            if (pigsOfUser > 0) {
                userPig.setOpacity(1.0);
                pigToSheepButton.setDisable(false);
            }
            if (pigsOfUser >= 3) {
                pigToCowButton.setDisable(false);
            }


            final Pair cowResult = cow.addToDequeOffCow(cowsOfUser, cowsOfFarm, randomNumberBlue);
            cowsOfUser = (int) cowResult.getKey();
            cowsOfFarm = (int) cowResult.getValue();
            countUserCow.setText(String.valueOf(cowsOfUser));
            if (cowsOfUser > 0) {
                cowToPigButton.setDisable(false);
                userCow.setOpacity(1.0);
            }
            if (cowsOfUser > 2) {
                cowToHorseButton.setDisable(false);
            }

            final Pair horseResult = horse.addToDequeOffHorse(horsesOfUser, horsesOfFarm, randomNumberRed);
            horsesOfUser = (int) horseResult.getKey();
            horsesOfFarm = (int) horseResult.getValue();
            countUserHorse.setText(String.valueOf(horsesOfUser));
            if (horsesOfUser > 0) {
                horseToCowButton.setDisable(false);
                userHorse.setOpacity(1.0);
            }


            final Pair rabbitsAfterWolf = wolf.removeRabbits(rabbitsOfUser, rabbitsOfFarm, bigDogsOfUser,
                    bigDogsOfFarm, randomNumberBlue);
            rabbitsOfUser = (int) rabbitsAfterWolf.getKey();
            rabbitsOfFarm = (int) rabbitsAfterWolf.getValue();
            countUserRabbit.setText(String.valueOf(rabbitsOfUser));
            final Pair sheepAfterWolf = wolf.removeSheep(sheepOfUser, sheepOfFarm, bigDogsOfUser,
                    bigDogsOfFarm, randomNumberBlue);
            sheepOfUser = (int) sheepAfterWolf.getKey();
            sheepOfFarm = (int) sheepAfterWolf.getValue();
            countUserSheep.setText(String.valueOf(sheepOfUser));
            final Pair pigsAfterWolf = wolf.removePigs(pigsOfUser, pigsOfFarm, bigDogsOfUser,
                    bigDogsOfFarm, randomNumberBlue);
            pigsOfUser = (int) pigsAfterWolf.getKey();
            pigsOfFarm = (int) pigsAfterWolf.getValue();
            countUserPig.setText(String.valueOf(pigsOfUser));
            final Pair cowsAfterWolf = wolf.removeCows(cowsOfUser, cowsOfFarm, bigDogsOfUser,
                    bigDogsOfFarm, randomNumberBlue);
            cowsOfUser = (int) cowsAfterWolf.getKey();
            cowsOfFarm = (int) cowsAfterWolf.getValue();
            countUserCow.setText(String.valueOf(cowsOfUser));
            final Pair bigDogsAfterWolf = wolf.removeBigDog(bigDogsOfUser, bigDogsOfFarm, randomNumberBlue);
            bigDogsOfUser = (int) bigDogsAfterWolf.getKey();
            bigDogsOfFarm = (int) bigDogsAfterWolf.getValue();
            countUserBigDog.setText(String.valueOf(bigDogsOfUser));

            if (rabbitsOfUser == 0) {
                userRabbit.setOpacity(0.4);
                rabbitToSheepButton.setDisable(true);
            }
            if (sheepOfUser == 0) {
                userSheep.setOpacity(0.4);
                sheepToSmallDogButton.setDisable(true);
                sheepToRabbitButton.setDisable(true);
                sheepToPigButton.setDisable(true);

            }
            if (pigsOfUser == 0) {
                userPig.setOpacity(0.4);
                pigToCowButton.setDisable(true);
                pigToSheepButton.setDisable(true);
            }
            if (cowsOfUser == 0) {
                userCow.setOpacity(0.4);
                cowToBigDogButton.setDisable(true);
                cowToHorseButton.setDisable(true);
                cowToPigButton.setDisable(true);
            }
            if (bigDogsOfUser == 0) {
                userBigDog.setOpacity(0.4);
                bigDogToCowButton.setDisable(true);
            }

            SetDisibility.setDisability(rabbitToSheepButton, sheepToRabbitButton,
                    sheepToSmallDogButton, smallDogtoSheepButton, sheepToPigButton, pigToSheepButton, pigToCowButton, cowToPigButton
                    , cowToHorseButton, horseToCowButton, cowToBigDogButton, bigDogToCowButton, rabbitsOfComputer, sheepOfComputer,
                    pigsOfComputer, cowsOfComputer, horsesOfComputer, bigDogsOfComputer, smallDogsOfComputer);

            win(rabbitsOfUser, sheepOfUser, pigsOfUser, cowsOfUser, horsesOfUser, rabbitsOfComputer,
                    sheepOfComputer, pigsOfComputer, cowsOfComputer, horsesOfComputer);

            turn.nextTurn(userResultLabel, computerResultLabel);
            setDisabledButtonInCaseShortageOfAnimals();
        }

//////////////////////// część drugiego użytkownika
        ////////////////////////////////////
        //////////////////////////////
        else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            int randomNumberRed = RedDig.randomNumber();
            int randomNumberBlue = BlueDig.randomNumber();


            computerBlueDigResult.setImage(blueDig.assignNumberToPictures(randomNumberBlue));
            computerRedDigResult.setImage(redDig.assignNumberToPictures(randomNumberRed));


            final Pair rabbitResult = rabbit.addToDequeOffRabbit(rabbitsOfComputer, rabbitsOfFarm,
                    randomNumberBlue, randomNumberRed);
            rabbitsOfComputer = (int) rabbitResult.getKey();
            rabbitsOfFarm = (int) rabbitResult.getValue();
            countComputerRabbit.setText(String.valueOf(rabbitsOfComputer));

            if (rabbitsOfComputer > 0) {
                computerRabbit.setOpacity(1.0);
            }
            if (rabbitsOfComputer >= 6) {
                rabbitToSheepButton.setDisable(false);
            }

            final Pair rabbitResultafterFox = fox.removeRabbits(rabbitsOfComputer, rabbitsOfFarm, smallDogsOfComputer,
                    smallDogsOfFarm, randomNumberRed);
            rabbitsOfComputer = (int) rabbitResultafterFox.getKey();
            rabbitsOfFarm = (int) rabbitResultafterFox.getValue();
            countComputerRabbit.setText(String.valueOf(rabbitsOfComputer));
            if (rabbitsOfComputer == 0) {
                computerRabbit.setOpacity(0.4);
                rabbitToSheepButton.setDisable(true);
            }

            final Pair smallDogsAfterFox = fox.removeSmallDog(rabbitsOfComputer, rabbitsOfFarm, smallDogsOfComputer,
                    smallDogsOfFarm, randomNumberRed);
            smallDogsOfComputer = (int) smallDogsAfterFox.getKey();
            smallDogsOfFarm = (int) smallDogsAfterFox.getValue();
            countComputerSmallDog.setText(String.valueOf(smallDogsOfComputer));
            if (smallDogsOfComputer == 0) {
                computerSmallDog.setOpacity(0.4);
                smallDogtoSheepButton.setDisable(true);
            }

            final Pair sheepResult = sheep.addToDequeOffSheep(sheepOfComputer, sheepOfFarm, randomNumberBlue, randomNumberRed);
            sheepOfComputer = (int) sheepResult.getKey();
            sheepOfFarm = (int) sheepResult.getValue();
            countComputerSheep.setText(String.valueOf(sheepOfComputer));
            if (sheepOfComputer > 0) {
                computerSheep.setOpacity(1.0);
                sheepToSmallDogButton.setDisable(false);
                sheepToRabbitButton.setDisable(false);
            }
            if (sheepOfComputer >= 2) {
                sheepToPigButton.setDisable(false);
            }

            final Pair pigResult = pig.addToDequeOffPig(pigsOfComputer, pigsOfFarm, randomNumberBlue, randomNumberRed);
            pigsOfComputer = (int) pigResult.getKey();
            pigsOfFarm = (int) pigResult.getValue();
            countComputerPig.setText(String.valueOf(pigsOfComputer));
            if (pigsOfComputer > 0) {
                computerPig.setOpacity(1.0);
                pigToSheepButton.setDisable(false);
            }
            if (pigsOfComputer >= 3) {
                pigToCowButton.setDisable(false);
            }

            final Pair cowResult = cow.addToDequeOffCow(cowsOfComputer, cowsOfFarm, randomNumberBlue);
            cowsOfComputer = (int) cowResult.getKey();
            cowsOfFarm = (int) cowResult.getValue();
            countComputerCow.setText(String.valueOf(cowsOfComputer));
            if (cowsOfComputer > 0) {
                cowToPigButton.setDisable(false);
                computerCow.setOpacity(1.0);
            }
            if (cowsOfComputer > 2) {
                cowToHorseButton.setDisable(false);
            }

            final Pair horseResult = horse.addToDequeOffHorse(horsesOfComputer, horsesOfFarm, randomNumberRed);
            horsesOfComputer = (int) horseResult.getKey();
            horsesOfFarm = (int) horseResult.getValue();
            countComputerHorse.setText(String.valueOf(horsesOfComputer));
            if (horsesOfComputer > 0) {
                horseToCowButton.setDisable(false);
                computerHorse.setOpacity(1.0);
            }

            final Pair rabbitsAfterWolf = wolf.removeRabbits(rabbitsOfComputer, rabbitsOfFarm, bigDogsOfComputer,
                    bigDogsOfFarm, randomNumberBlue);
            rabbitsOfComputer = (int) rabbitsAfterWolf.getKey();
            rabbitsOfFarm = (int) rabbitsAfterWolf.getValue();
            countComputerRabbit.setText(String.valueOf(rabbitsOfComputer));
            final Pair sheepAfterWolf = wolf.removeSheep(sheepOfComputer, sheepOfFarm, bigDogsOfComputer,
                    bigDogsOfFarm, randomNumberBlue);
            sheepOfComputer = (int) sheepAfterWolf.getKey();
            sheepOfFarm = (int) sheepAfterWolf.getValue();
            countComputerSheep.setText(String.valueOf(sheepOfComputer));
            final Pair pigsAfterWolf = wolf.removePigs(pigsOfComputer, pigsOfFarm, bigDogsOfComputer,
                    bigDogsOfFarm, randomNumberBlue);
            pigsOfComputer = (int) pigsAfterWolf.getKey();
            pigsOfFarm = (int) pigsAfterWolf.getValue();
            countComputerPig.setText(String.valueOf(pigsOfComputer));
            final Pair cowsAfterWolf = wolf.removeCows(cowsOfComputer, cowsOfFarm, bigDogsOfComputer,
                    bigDogsOfFarm, randomNumberBlue);
            cowsOfComputer = (int) cowsAfterWolf.getKey();
            cowsOfFarm = (int) cowsAfterWolf.getValue();
            countComputerCow.setText(String.valueOf(cowsOfComputer));
            final Pair bigDogsAfterWolf = wolf.removeBigDog(bigDogsOfComputer, bigDogsOfFarm, randomNumberBlue);
            bigDogsOfComputer = (int) bigDogsAfterWolf.getKey();
            bigDogsOfFarm = (int) bigDogsAfterWolf.getValue();
            countComputerBigDog.setText(String.valueOf(bigDogsOfComputer));


            if (rabbitsOfComputer == 0) {
                computerRabbit.setOpacity(0.4);
                rabbitToSheepButton.setDisable(true);
            }
            if (sheepOfComputer == 0) {
                computerSheep.setOpacity(0.4);
                sheepToSmallDogButton.setDisable(true);
                sheepToRabbitButton.setDisable(true);
                sheepToPigButton.setDisable(true);

            }
            if (pigsOfComputer == 0) {
                computerPig.setOpacity(0.4);
                pigToCowButton.setDisable(true);
                pigToSheepButton.setDisable(true);
            }
            if (cowsOfComputer == 0) {
                computerCow.setOpacity(0.4);
                cowToBigDogButton.setDisable(true);
                cowToHorseButton.setDisable(true);
                cowToPigButton.setDisable(true);
            }
            if (bigDogsOfComputer == 0) {
                computerBigDog.setOpacity(0.4);
                bigDogToCowButton.setDisable(true);
            }


            SetDisibility.setDisability(rabbitToSheepButton, sheepToRabbitButton, sheepToSmallDogButton,
                    smallDogtoSheepButton, sheepToPigButton, pigToSheepButton, pigToCowButton,
                    cowToPigButton, cowToHorseButton, horseToCowButton, cowToBigDogButton, bigDogToCowButton
                    , rabbitsOfUser, sheepOfUser, pigsOfUser, cowsOfUser, horsesOfUser, bigDogsOfUser, smallDogsOfUser);

            win(rabbitsOfUser, sheepOfUser, pigsOfUser, cowsOfUser, horsesOfUser, rabbitsOfComputer,
                    sheepOfComputer, pigsOfComputer, cowsOfComputer, horsesOfComputer);

            turn.nextTurn(userResultLabel, computerResultLabel);

            setDisabledButtonInCaseShortageOfAnimals();
        }
    }

    private MainScreen mainScreen;

    public void setMainScreen(MainScreen mainScreen) {
        this.mainScreen = mainScreen;
    }


    public void win(int rabbitsOfUser,
                    int sheepOfUser, int pigsOfUser, int cowsOfUser,
                    int horsesOfUser, int rabbitsOfComputer,
                    int sheepOfComputer, int pigsOfComputer, int cowsOfComputer,
                    int horsesOfComputer) {
        if ((rabbitsOfUser > 0 && sheepOfUser > 0 && pigsOfUser > 0 && cowsOfUser > 0 && horsesOfUser > 0)
                || (rabbitsOfComputer > 0 && sheepOfComputer > 0 && pigsOfComputer > 0 && cowsOfComputer > 0 && horsesOfComputer > 0)) {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/winWindow.fxml"));
            Pane pane = null;
            try {
                pane = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            WinController winController = loader.getController();
            winController.setMainScreen(mainScreen);
            winController.infoWhoWin(userResultLabel, computerResultLabel);
            mainScreen.setScreen(pane);

        }
    }
}
