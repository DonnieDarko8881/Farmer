package com.game.fx.controller;

import com.game.farmer.Turn.SetDisibility;
import com.game.farmer.Turn.Turn;
import com.game.farmer.animals.*;
import com.game.farmer.animals.enemy.Fox;
import com.game.farmer.animals.enemy.Wolf;
import com.game.farmer.digs.BlueDig;
import com.game.farmer.digs.RedDig;
import com.game.farmer.users.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

import java.util.ArrayDeque;
import java.util.Deque;

public class MainController {

    @FXML
    private StackPane stackPaneMain;

    @FXML
    private ImageView userBlueDigResult;

    @FXML
    private ImageView userRedDigResult;

    @FXML
    private ImageView computerBlueDigResult;

    @FXML
    private ImageView computerRedDigResult;

    @FXML
    private ImageView digs;

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

    public void initialize() {
        rabbit.setNumberRabbitsOfFarm(rabbitsOfFarm);
        sheep.setNumberSheepOfFarm(sheepOfFarm);
        pig.setNumberPigOfFarm(pigsOfFarm);
        cow.setNumberCowsOfFarm(cowsOfFarm);
        horse.setNumberHorsesOfFarm(horsesOfFarm);
        smallDog.setNumberSmallDogsOfFarm(smallDogsOfFarm);
        bigDog.setNumberBigDogsOfFarm(bigDogsOfFarm);

        turn.firstTurn(userResultLabel);

    }

    BlueDig blueDig = new BlueDig();
    RedDig redDig = new RedDig();
    Rabbit rabbit = new Rabbit();
    Sheep sheep = new Sheep();
    Pig pig = new Pig();
    Cow cow = new Cow();
    Horse horse = new Horse();
    SmallDog smallDog = new SmallDog();
    BigDog bigDog = new BigDog();
    Wolf wolf = new Wolf();
    Fox fox = new Fox();
    Turn turn = new Turn();
    User user = new User("user");
    User computer = new User("computer");

    Deque<String> rabbitsOfFarm = new ArrayDeque<>();
    Deque<String> sheepOfFarm = new ArrayDeque<>();
    Deque<String> pigsOfFarm = new ArrayDeque<>();
    Deque<String> cowsOfFarm = new ArrayDeque<>();
    Deque<String> horsesOfFarm = new ArrayDeque<>();
    Deque<String> smallDogsOfFarm = new ArrayDeque<>();
    Deque<String> bigDogsOfFarm = new ArrayDeque<>();


    Deque<String> rabbitsOfUser = new ArrayDeque<>();
    Deque<String> sheepOfUser = new ArrayDeque<>();
    Deque<String> pigsOfUser = new ArrayDeque<>();
    Deque<String> cowsOfUser = new ArrayDeque<>();
    Deque<String> horsesOfUser = new ArrayDeque<>();
    Deque<String> smallDogsOfUser = new ArrayDeque<>();
    Deque<String> bigDogsOfUser = new ArrayDeque<>();

    Deque<String> rabbitsOfComputer = new ArrayDeque<>();
    Deque<String> sheepOfComputer = new ArrayDeque<>();
    Deque<String> pigsOfComputer = new ArrayDeque<>();
    Deque<String> cowsOfComputer = new ArrayDeque<>();
    Deque<String> horsesOfComputer = new ArrayDeque<>();
    Deque<String> smallDogsOfComputer = new ArrayDeque<>();
    Deque<String> bigDogsOfComputer = new ArrayDeque<>();

    public void setDisabledButtonInCaseShortageOfAnimals() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {


            if (rabbitsOfFarm.size() < 6) {
                sheepToRabbitButton.setDisable(true);
            } else if (rabbitsOfUser.size() >= 6) {
                rabbitToSheepButton.setDisable(false);
            }

            if (sheepOfFarm.size() < 1) {
                rabbitToSheepButton.setDisable(true);
                smallDogtoSheepButton.setDisable(true);
            }

            if (sheepOfFarm.size() < 2) {
                pigToSheepButton.setDisable(true);
            } else if (sheepOfFarm.size() >= 2 && pigsOfUser.size() >= 1) {
                pigToSheepButton.setDisable(false);
            }

            if (pigsOfFarm.size() < 1) {
                sheepToPigButton.setDisable(true);
            } else if (pigsOfFarm.size() >= 1 && sheepOfUser.size() >= 2) {
                sheepToPigButton.setDisable(false);
            }

            if (pigsOfFarm.size() < 3) {
                cowToPigButton.setDisable(true);
            } else if (pigsOfFarm.size() >= 3 && cowsOfUser.size() >= 1) {
                cowToPigButton.setDisable(false);
            }

            if (cowsOfFarm.size() < 1) {
                pigToCowButton.setDisable(true);
                bigDogToCowButton.setDisable(true);
            } else if (cowsOfFarm.size() >= 1 && pigsOfUser.size() >= 3) {
                pigToCowButton.setDisable(false);
            }

            if (cowsOfFarm.size() < 2) {
                horseToCowButton.setDisable(true);
            } else if (cowsOfFarm.size() >= 2 && horsesOfUser.size() >= 1) {
                horseToCowButton.setDisable(false);
            }


            if (horsesOfFarm.size() < 1) {
                cowToHorseButton.setDisable(true);
            } else if (horsesOfFarm.size() >= 1 && cowsOfUser.size() >= 2) {
                cowToHorseButton.setDisable(false);
            }

            if (smallDogsOfFarm.size() < 1) {
                sheepToSmallDogButton.setDisable(true);
            } else if (smallDogsOfFarm.size() >= 1 && sheepOfUser.size() >= 1) {
                sheepToSmallDogButton.setDisable(false);
            }
            if (sheepOfFarm.size() >= 1 && smallDogsOfUser.size() >= 1) {
                smallDogtoSheepButton.setDisable(false);
            }

            if(bigDogsOfFarm.size()<1){
                cowToBigDogButton.setDisable(true);
            }else if(bigDogsOfFarm.size()>=1 && cowsOfUser.size()>=1 ){
                cowToBigDogButton.setDisable(false);
            }

        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (rabbitsOfFarm.size() < 6) {
                sheepToRabbitButton.setDisable(true);
            } else if (rabbitsOfComputer.size() >= 6) {
                rabbitToSheepButton.setDisable(false);
            }

            if (sheepOfFarm.size() < 1) {
                rabbitToSheepButton.setDisable(true);
                smallDogtoSheepButton.setDisable(true);
            }

            if (sheepOfFarm.size() < 2) {
                pigToSheepButton.setDisable(true);
            } else if (sheepOfFarm.size() >= 2 && pigsOfComputer.size() >= 1) {
                pigToSheepButton.setDisable(false);
            }

            if (pigsOfFarm.size() < 1) {
                sheepToPigButton.setDisable(true);
            } else if (pigsOfFarm.size() >= 1 && sheepOfComputer.size() >= 2) {
                sheepToPigButton.setDisable(false);
            }

            if (pigsOfFarm.size() < 3) {
                cowToPigButton.setDisable(true);
            } else if (pigsOfFarm.size() >= 3 && cowsOfComputer.size() >= 1) {
                cowToPigButton.setDisable(false);
            }

            if (cowsOfFarm.size() < 1) {
                pigToCowButton.setDisable(true);
                bigDogToCowButton.setDisable(true);
            } else if (cowsOfFarm.size() >= 1 && pigsOfComputer.size() >= 3) {
                pigToCowButton.setDisable(false);
            }

            if (cowsOfFarm.size() < 2) {
                horseToCowButton.setDisable(true);
            } else if (cowsOfFarm.size() >= 2 && horsesOfComputer.size() >= 1) {
                horseToCowButton.setDisable(false);
            }


            if (horsesOfFarm.size() < 1) {
                cowToHorseButton.setDisable(true);
            } else if (horsesOfFarm.size() >= 1 && cowsOfComputer.size() >= 2) {
                cowToHorseButton.setDisable(false);
            }

            if (smallDogsOfFarm.size() < 1) {
                sheepToSmallDogButton.setDisable(true);
            } else if (smallDogsOfFarm.size() >= 1 && sheepOfComputer.size() >= 1) {
                sheepToSmallDogButton.setDisable(false);
            }
            if (sheepOfFarm.size() >= 1 && smallDogsOfComputer.size() >= 1) {
                smallDogtoSheepButton.setDisable(false);
            }

            if(bigDogsOfFarm.size()<1){
                cowToBigDogButton.setDisable(true);
            }else if(bigDogsOfFarm.size()>=1 && cowsOfComputer.size()>=1 ){
                cowToBigDogButton.setDisable(false);
            }
        }

    }


    public void exchangeRabbitToSheep() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (sheepOfFarm.size() > 0) {
                for (int i = 0; i < 6; i++) {
                    if(rabbitsOfUser.size()>0) {
                        rabbitsOfUser.pop();
                        rabbitsOfFarm.push("rabbit");
                    }
                }
                sheepOfFarm.pop();
                sheepOfUser.push("Sheep");
            }
            //potem do usunięcia !!!!!!!!!!
            howManyAnimalsOfFarm();

            countUserSheep.setText(String.valueOf(sheepOfUser.size()));
            if (sheepOfUser.size() > 0) {
                sheepToRabbitButton.setDisable(false);
                sheepToSmallDogButton.setDisable(false);
                userSheep.setOpacity(1.0);
            }
            if (sheepOfUser.size() >= 2) {
                sheepToPigButton.setDisable(false);
            }

            countUserRabbit.setText(String.valueOf(rabbitsOfUser.size()));
            if (rabbitsOfUser.size() == 0) {
                userRabbit.setOpacity(0.4);
            }
            if (rabbitsOfUser.size() < 6) {
                rabbitToSheepButton.setDisable(true);
            }

            setDisabledButtonInCaseShortageOfAnimals();
            ///////////////////////
            ///////////////
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (sheepOfFarm.size() > 0) {
                for (int i = 0; i < 6; i++) {
                    rabbitsOfComputer.pop();
                    rabbitsOfFarm.push("rabbit");
                }
                sheepOfFarm.pop();
                sheepOfComputer.push("Sheep");
            }
            //potem do usunięcia !!!!!!!!!!
            howManyAnimalsOfFarm();

            countComputerSheep.setText(String.valueOf(sheepOfComputer.size()));
            if (sheepOfComputer.size() > 0) {
                sheepToRabbitButton.setDisable(false);
                sheepToSmallDogButton.setDisable(false);
                computerSheep.setOpacity(1.0);
            }
            if (sheepOfComputer.size() >= 2) {
                sheepToPigButton.setDisable(false);
            }

            countComputerRabbit.setText(String.valueOf(rabbitsOfComputer.size()));
            if (rabbitsOfComputer.size() == 0) {
                computerRabbit.setOpacity(0.4);
            }
            if (rabbitsOfComputer.size() < 6) {
                rabbitToSheepButton.setDisable(true);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
    }

    public void exchangeSheepToRabbits() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (rabbitsOfFarm.size() >= 6) {
                sheepOfUser.pop();
                sheepOfFarm.push("sheep");
            }
            for (int i = 0; i < 6; i++) {
                if (rabbitsOfFarm.size() > 0) {
                    rabbitsOfFarm.pop();
                    rabbitsOfUser.push("Rabbit");
                }
            }

            //potem do usuniecia
            howManyAnimalsOfFarm();

            countUserSheep.setText(String.valueOf(sheepOfUser.size()));
            if (sheepOfUser.size() == 0) {
                sheepToRabbitButton.setDisable(true);
                sheepToSmallDogButton.setDisable(true);
                userSheep.setOpacity(0.4);
            }
            if (sheepOfUser.size() < 2) {
                sheepToPigButton.setDisable(true);
            }

            countUserRabbit.setText(String.valueOf(rabbitsOfUser.size()));
            if (rabbitsOfUser.size() > 0) {
                userRabbit.setOpacity(1.0);
            }
            if (rabbitsOfUser.size() > 6) {
                rabbitToSheepButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (rabbitsOfFarm.size() >= 6) {
                sheepOfComputer.pop();
                sheepOfFarm.push("sheep");
            }
            for (int i = 0; i < 6; i++) {
                if (rabbitsOfFarm.size() > 0) {
                    rabbitsOfFarm.pop();
                    rabbitsOfComputer.push("Rabbit");
                }
            }

            //potem do usuniecia
            howManyAnimalsOfFarm();

            countComputerSheep.setText(String.valueOf(sheepOfComputer.size()));
            if (sheepOfComputer.size() == 0) {
                sheepToRabbitButton.setDisable(true);
                sheepToSmallDogButton.setDisable(true);
                computerSheep.setOpacity(0.4);
            }
            if (sheepOfComputer.size() < 2) {
                sheepToPigButton.setDisable(true);
            }

            countComputerRabbit.setText(String.valueOf(rabbitsOfComputer.size()));
            if (rabbitsOfComputer.size() > 0) {
                computerRabbit.setOpacity(1.0);
            }
            if (rabbitsOfComputer.size() > 6) {
                rabbitToSheepButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
    }

    public void exchangeSheepToPig() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (pigsOfFarm.size() > 0) {
                for (int i = 0; i < 2; i++) {
                    sheepOfUser.pop();
                    sheepOfFarm.push("Sheep");
                }
                pigsOfFarm.pop();
                pigsOfUser.push("Pigs");
            }


            //potem do usunięcia
            howManyAnimalsOfFarm();
//
            countUserPig.setText(String.valueOf(pigsOfUser.size()));
            if (pigsOfUser.size() > 0) {
                pigToSheepButton.setDisable(false);
                userPig.setOpacity(1.0);
            }
            if (pigsOfUser.size() >= 3) {
                pigToCowButton.setDisable(false);
            }


            countUserSheep.setText(String.valueOf(sheepOfUser.size()));
            if (sheepOfUser.size() == 0) {
                userSheep.setOpacity(0.4);
            }
            if (sheepOfUser.size() < 2) {
                sheepToPigButton.setDisable(true);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (pigsOfFarm.size() > 0) {
                for (int i = 0; i < 2; i++) {
                    sheepOfComputer.pop();
                    sheepOfFarm.push("Sheep");
                }
                pigsOfFarm.pop();
                pigsOfComputer.push("Pigs");
            }


            //potem do usunięcia
            howManyAnimalsOfFarm();
//
            countComputerPig.setText(String.valueOf(pigsOfComputer.size()));
            if (pigsOfComputer.size() > 0) {
                pigToSheepButton.setDisable(false);
                computerPig.setOpacity(1.0);
            }
            if (pigsOfComputer.size() >= 3) {
                pigToCowButton.setDisable(false);
            }


            countComputerSheep.setText(String.valueOf(sheepOfComputer.size()));
            if (sheepOfComputer.size() == 0) {
                computerSheep.setOpacity(0.4);
            }
            if (sheepOfComputer.size() < 2) {
                sheepToPigButton.setDisable(true);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }

    }

    public void exchangePigToSheep() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (sheepOfFarm.size() >= 2) {
                pigsOfUser.pop();
                pigsOfFarm.push("Pig");

                for (int i = 0; i < 2; i++) {
                    if (sheepOfFarm.size() > 0) {
                        sheepOfFarm.pop();
                        sheepOfUser.push("Rabbit");
                    }
                }
            }

            //potem do usuniecia
            howManyAnimalsOfFarm();

            countUserPig.setText(String.valueOf(pigsOfUser.size()));
            if (pigsOfUser.size() == 0) {
                pigToSheepButton.setDisable(true);
                userPig.setOpacity(0.4);
            }
            if (pigsOfUser.size() < 3) {
                pigToCowButton.setDisable(true);
            }


            countUserSheep.setText(String.valueOf(sheepOfUser.size()));
            if (sheepOfUser.size() > 0) {
                userSheep.setOpacity(1.0);
                sheepToRabbitButton.setDisable(false);
                sheepToSmallDogButton.setDisable(false);
            }
            if (sheepOfUser.size() >= 2) {
                sheepToPigButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (sheepOfFarm.size() >= 2) {
                if(pigsOfComputer.size()>0) {
                    pigsOfComputer.pop();
                    pigsOfFarm.push("Pig");
                }
                for (int i = 0; i < 2; i++) {
                    if (sheepOfFarm.size() > 0) {
                        sheepOfFarm.pop();
                        sheepOfComputer.push("Rabbit");
                    }
                }
            }

            //potem do usuniecia
            howManyAnimalsOfFarm();

            countComputerPig.setText(String.valueOf(pigsOfComputer.size()));
            if (pigsOfComputer.size() == 0) {
                pigToSheepButton.setDisable(true);
                computerPig.setOpacity(0.4);
            }
            if (pigsOfComputer.size() < 3) {
                pigToCowButton.setDisable(true);
            }


            countComputerSheep.setText(String.valueOf(sheepOfComputer.size()));
            if (sheepOfComputer.size() > 0) {
                computerSheep.setOpacity(1.0);
                sheepToRabbitButton.setDisable(false);
                sheepToSmallDogButton.setDisable(false);
            }
            if (sheepOfComputer.size() >= 2) {
                sheepToPigButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
    }

    public void exchangePigToCow() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (cowsOfFarm.size() > 0) {
                for (int i = 0; i < 3; i++) {
                    pigsOfUser.pop();
                    pigsOfFarm.push("Pig");
                }
                cowsOfFarm.pop();
                cowsOfUser.push("Pig");
            }

            //potem do usunięcia
            howManyAnimalsOfFarm();
//
            countUserCow.setText(String.valueOf(cowsOfUser.size()));
            if (cowsOfUser.size() > 0) {
                cowToPigButton.setDisable(false);
                cowToBigDogButton.setDisable(false);
                userCow.setOpacity(1.0);
            }
            if (cowsOfUser.size() >= 2) {
                cowToHorseButton.setDisable(false);
            }

            countUserPig.setText(String.valueOf(pigsOfUser.size()));
            if (pigsOfUser.size() == 0) {
                userPig.setOpacity(0.4);
            }
            if (pigsOfUser.size() < 3) {
                pigToCowButton.setDisable(true);
            } else if (pigsOfUser.size() >= 3) {
                pigToCowButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (cowsOfFarm.size() > 0) {
                for (int i = 0; i < 3; i++) {
                    pigsOfComputer.pop();
                    pigsOfFarm.push("Pig");
                }
                cowsOfFarm.pop();
                cowsOfComputer.push("Pig");
            }

            //potem do usunięcia
            howManyAnimalsOfFarm();
//
            countComputerCow.setText(String.valueOf(cowsOfComputer.size()));
            if (cowsOfComputer.size() > 0) {
                cowToPigButton.setDisable(false);
                cowToBigDogButton.setDisable(false);
                computerCow.setOpacity(1.0);
            }
            if (cowsOfComputer.size() >= 2) {
                cowToHorseButton.setDisable(false);
            }

            countComputerPig.setText(String.valueOf(pigsOfComputer.size()));
            if (pigsOfComputer.size() == 0) {
                computerPig.setOpacity(0.4);
            }
            if (pigsOfComputer.size() < 3) {
                pigToCowButton.setDisable(true);
            } else if (pigsOfComputer.size() >= 3) {
                pigToCowButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
    }

    public void exchangeCowToPig() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (pigsOfFarm.size() >= 3) {
                cowsOfUser.pop();
                cowsOfFarm.push("Cow");

                for (int i = 0; i < 3; i++) {
                    if (pigsOfFarm.size() > 0) {
                        pigsOfFarm.pop();
                        pigsOfUser.push("Pig");
                    }
                }
            }

            //potem do usuniecia
            howManyAnimalsOfFarm();

            countUserCow.setText(String.valueOf(cowsOfUser.size()));
            if (cowsOfUser.size() == 0) {
                cowToPigButton.setDisable(true);
                cowToBigDogButton.setDisable(true);
                userCow.setOpacity(0.4);
            }
            if (cowsOfUser.size() < 2) {
                cowToHorseButton.setDisable(true);
            }


            countUserPig.setText(String.valueOf(pigsOfUser.size()));
            if (pigsOfUser.size() > 0) {
                userPig.setOpacity(1.0);
                pigToSheepButton.setDisable(false);
            }
            if (pigsOfUser.size() >= 3) {
                pigToCowButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (pigsOfFarm.size() >= 3) {
                cowsOfComputer.pop();
                cowsOfFarm.push("Cow");

                for (int i = 0; i < 3; i++) {
                    if (pigsOfFarm.size() > 0) {
                        pigsOfFarm.pop();
                        pigsOfComputer.push("Pig");
                    }
                }
            }

            //potem do usuniecia
            howManyAnimalsOfFarm();

            countComputerCow.setText(String.valueOf(cowsOfComputer.size()));
            if (cowsOfComputer.size() == 0) {
                cowToPigButton.setDisable(true);
                cowToBigDogButton.setDisable(true);
                computerCow.setOpacity(0.4);
            }
            if (cowsOfComputer.size() < 2) {
                cowToHorseButton.setDisable(true);
            }


            countComputerPig.setText(String.valueOf(pigsOfComputer.size()));
            if (pigsOfComputer.size() > 0) {
                computerPig.setOpacity(1.0);
                pigToSheepButton.setDisable(false);
            }
            if (pigsOfComputer.size() >= 3) {
                pigToCowButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
    }

    public void exchangeCowToHorse() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (horsesOfFarm.size() > 0) {
                for (int i = 0; i < 2; i++) {
                    cowsOfUser.pop();
                    cowsOfFarm.push("Cow");
                }
                horsesOfFarm.pop();
                horsesOfUser.push("Horse");
            }

            //potem do usunięcia
            howManyAnimalsOfFarm();
//
            countUserHorse.setText(String.valueOf(horsesOfUser.size()));
            if (horsesOfUser.size() > 0) {
                horseToCowButton.setDisable(false);
                userHorse.setOpacity(1.0);
            }

            countUserCow.setText(String.valueOf(cowsOfUser.size()));
            if (cowsOfUser.size() == 0) {
                userCow.setOpacity(0.4);
            }
            if (cowsOfUser.size() < 2) {
                cowToHorseButton.setDisable(true);
            } else if (cowsOfUser.size() >= 2) {
                cowToHorseButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (horsesOfFarm.size() > 0) {
                for (int i = 0; i < 2; i++) {
                    cowsOfComputer.pop();
                    cowsOfFarm.push("Cow");
                }
                horsesOfFarm.pop();
                horsesOfComputer.push("Horse");
            }

            //potem do usunięcia
            howManyAnimalsOfFarm();
//
            countComputerHorse.setText(String.valueOf(horsesOfComputer.size()));
            if (horsesOfComputer.size() > 0) {
                horseToCowButton.setDisable(false);
                computerHorse.setOpacity(1.0);
            }

            countComputerCow.setText(String.valueOf(cowsOfComputer.size()));
            if (cowsOfComputer.size() == 0) {
                computerCow.setOpacity(0.4);
            }
            if (cowsOfComputer.size() < 2) {
                cowToHorseButton.setDisable(true);
            } else if (cowsOfComputer.size() >= 2) {
                cowToHorseButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
    }

    public void exchangeHorseToCow() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (cowsOfFarm.size() >= 2) {
                horsesOfUser.pop();
                horsesOfFarm.push("Horse");

                for (int i = 0; i < 3; i++) {
                    if (cowsOfFarm.size() > 0) {
                        cowsOfFarm.pop();
                        cowsOfUser.push("Cow");
                    }
                }
            }
            //potem do usuniecia
            howManyAnimalsOfFarm();

            countUserHorse.setText(String.valueOf(horsesOfUser.size()));
            if (horsesOfUser.size() == 0) {
                horseToCowButton.setDisable(true);
                userHorse.setOpacity(0.4);
            }


            countUserCow.setText(String.valueOf(cowsOfUser.size()));
            if (cowsOfUser.size() > 0) {
                userCow.setOpacity(1.0);
                cowToPigButton.setDisable(false);
            }
            if (cowsOfUser.size() >= 2) {
                cowToHorseButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (cowsOfFarm.size() >= 2) {
                horsesOfComputer.pop();
                horsesOfFarm.push("Horse");

                for (int i = 0; i < 3; i++) {
                    if (cowsOfFarm.size() > 0) {
                        cowsOfFarm.pop();
                        cowsOfComputer.push("Cow");
                    }
                }
            }
            //potem do usuniecia
            howManyAnimalsOfFarm();

            countComputerHorse.setText(String.valueOf(horsesOfComputer.size()));
            if (horsesOfComputer.size() == 0) {
                horseToCowButton.setDisable(true);
                computerHorse.setOpacity(0.4);
            }


            countComputerCow.setText(String.valueOf(cowsOfComputer.size()));
            if (cowsOfComputer.size() > 0) {
                computerCow.setOpacity(1.0);
                cowToPigButton.setDisable(false);
            }
            if (cowsOfComputer.size() >= 2) {
                cowToHorseButton.setDisable(false);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
    }


    public void exchangeSheepToSmallDog() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (smallDogsOfFarm.size() >= 1) {
                sheepOfUser.pop();
                sheepOfFarm.push("Sheep");
                smallDogsOfFarm.pop();
                smallDogsOfUser.push("Small Dog");
            }
            howManyAnimalsOfFarm();

            countUserSmallDog.setText(String.valueOf(smallDogsOfUser.size()));
            if (smallDogsOfUser.size() > 0) {
                userSmallDog.setOpacity(1.0);
                smallDogtoSheepButton.setDisable(false);
            }

            countUserSheep.setText(String.valueOf(sheepOfUser.size()));
            if (sheepOfUser.size() == 0) {
                sheepToRabbitButton.setDisable(true);
                sheepToSmallDogButton.setDisable(true);
                userSheep.setOpacity(0.4);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (smallDogsOfFarm.size() >= 1) {
                sheepOfComputer.pop();
                sheepOfFarm.push("Sheep");
                smallDogsOfFarm.pop();
                smallDogsOfComputer.push("Small Dog");
            }
            howManyAnimalsOfFarm();

            countComputerSmallDog.setText(String.valueOf(smallDogsOfComputer.size()));
            if (smallDogsOfComputer.size() > 0) {
                computerSmallDog.setOpacity(1.0);
                smallDogtoSheepButton.setDisable(false);
            }

            countComputerSheep.setText(String.valueOf(sheepOfComputer.size()));
            if (sheepOfComputer.size() == 0) {
                sheepToRabbitButton.setDisable(true);
                sheepToSmallDogButton.setDisable(true);
                computerSheep.setOpacity(0.4);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
    }

    public void exchangeSmallDogToSheep() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (sheepOfFarm.size() >= 1) {
                smallDogsOfUser.pop();
                smallDogsOfFarm.push("Small Dog");
                sheepOfFarm.pop();
                sheepOfUser.push("Sheep");
            }
            howManyAnimalsOfFarm();

            countUserSheep.setText(String.valueOf(sheepOfUser.size()));
            if (sheepOfUser.size() > 0) {
                userSheep.setOpacity(1.0);
                sheepToSmallDogButton.setDisable(false);
                sheepToRabbitButton.setDisable(false);
            }
            if (sheepOfUser.size() >= 2) {
                sheepToPigButton.setDisable(false);
            }

            countUserSmallDog.setText(String.valueOf(smallDogsOfUser.size()));
            if (smallDogsOfUser.size() == 0) {
                smallDogtoSheepButton.setDisable(true);
                userSmallDog.setOpacity(0.4);
            }
            setDisabledButtonInCaseShortageOfAnimals();
        } else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (sheepOfFarm.size() >= 1) {
                smallDogsOfComputer.pop();
                smallDogsOfFarm.push("Small Dog");
                sheepOfFarm.pop();
                sheepOfComputer.push("Sheep");
            }
            howManyAnimalsOfFarm();

            countComputerSheep.setText(String.valueOf(sheepOfComputer.size()));
            if (sheepOfComputer.size() > 0) {
                computerSheep.setOpacity(1.0);
                sheepToSmallDogButton.setDisable(false);
                sheepToRabbitButton.setDisable(false);
            }
            if (sheepOfComputer.size() >= 2) {
                sheepToPigButton.setDisable(false);
            }

            countComputerSmallDog.setText(String.valueOf(smallDogsOfComputer.size()));
            if (smallDogsOfComputer.size() == 0) {
                smallDogtoSheepButton.setDisable(true);
                computerSmallDog.setOpacity(0.4);
            }
            setDisabledButtonInCaseShortageOfAnimals();
        }
    }

    public void exchangeCowToBigDog() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (bigDogsOfFarm.size() >= 1) {
                cowsOfUser.pop();
                cowsOfFarm.push("Cow");
                bigDogsOfFarm.pop();
                bigDogsOfUser.push("Big Dog");
            }
            howManyAnimalsOfFarm();

            countUserBigDog.setText(String.valueOf(bigDogsOfUser.size()));
            if (bigDogsOfUser.size() > 0) {
                userBigDog.setOpacity(1.0);
                bigDogToCowButton.setDisable(false);
            }

            countUserCow.setText(String.valueOf(cowsOfUser.size()));
            if (cowsOfUser.size() == 0) {
                cowToPigButton.setDisable(true);
                cowToBigDogButton.setDisable(true);
                userCow.setOpacity(0.4);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (bigDogsOfFarm.size() >= 1) {
                cowsOfComputer.pop();
                cowsOfFarm.push("Cow");
                bigDogsOfFarm.pop();
                bigDogsOfComputer.push("Big Dog");
            }
            howManyAnimalsOfFarm();

            countComputerBigDog.setText(String.valueOf(bigDogsOfComputer.size()));
            if (bigDogsOfComputer.size() > 0) {
                computerBigDog.setOpacity(1.0);
                bigDogToCowButton.setDisable(false);
            }

            countComputerCow.setText(String.valueOf(cowsOfComputer.size()));
            if (cowsOfComputer.size() == 0) {
                cowToPigButton.setDisable(true);
                cowToBigDogButton.setDisable(true);
                computerCow.setOpacity(0.4);
            }

            setDisabledButtonInCaseShortageOfAnimals();
        }
    }

    public void exchangeBigDogToCow() {
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            if (cowsOfFarm.size() >= 1) {
                bigDogsOfUser.pop();
                bigDogsOfFarm.push("Big Dog");
                cowsOfFarm.pop();
                cowsOfUser.push("Cow");
            }
            howManyAnimalsOfFarm();

            countUserCow.setText(String.valueOf(cowsOfUser.size()));
            if (cowsOfUser.size() > 0) {
                userCow.setOpacity(1.0);
                cowToBigDogButton.setDisable(false);
                cowToPigButton.setDisable(false);
            }
            if (cowsOfUser.size() >= 2) {
                cowToHorseButton.setDisable(false);
            }

            countUserBigDog.setText(String.valueOf(bigDogsOfUser.size()));
            if (bigDogsOfUser.size() == 0) {
                bigDogToCowButton.setDisable(true);
                userBigDog.setOpacity(0.4);
            }
            setDisabledButtonInCaseShortageOfAnimals();
        }else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            if (cowsOfFarm.size() >= 1) {
                bigDogsOfComputer.pop();
                bigDogsOfFarm.push("Big Dog");
                cowsOfFarm.pop();
                cowsOfComputer.push("Cow");
            }
            howManyAnimalsOfFarm();

            countComputerCow.setText(String.valueOf(cowsOfComputer.size()));
            if (cowsOfComputer.size() > 0) {
                computerCow.setOpacity(1.0);
                cowToBigDogButton.setDisable(false);
                cowToPigButton.setDisable(false);
            }
            if (cowsOfComputer.size() >= 2) {
                cowToHorseButton.setDisable(false);
            }

            countComputerBigDog.setText(String.valueOf(bigDogsOfComputer.size()));
            if (bigDogsOfComputer.size() == 0) {
                bigDogToCowButton.setDisable(true);
                computerBigDog.setOpacity(0.4);
            }
            setDisabledButtonInCaseShortageOfAnimals();
        }
    }


    // metoda po kliknieciu myszką na kość
    public void randomResult() {


        howManyAnimalsOfFarm();
        if (userResultLabel.getStyle() == "-fx-background-color: CADETBLUE;") {
            int randomNumberRed = RedDig.randomNumber();
            int randomNumberBlue = BlueDig.randomNumber();


            //rzuty kością dający rezultat

            userBlueDigResult.setImage(blueDig.assignNumberToPictures(randomNumberBlue));
            userRedDigResult.setImage(redDig.assignNumberToPictures(randomNumberRed));


            countUserRabbit.setText(String.valueOf(rabbit.addToDequeOffRabbit(rabbitsOfUser, rabbitsOfFarm, randomNumberBlue, randomNumberRed).size()));
            if (rabbitsOfUser.size() > 0) {
                userRabbit.setOpacity(1.0);
            }
            if (rabbitsOfUser.size() >= 6) {
                rabbitToSheepButton.setDisable(false);
            }


            countUserRabbit.setText(String.valueOf(fox.removeRabbits(rabbitsOfUser, rabbitsOfFarm, smallDogsOfUser, smallDogsOfFarm, randomNumberRed).size()));
            if (rabbitsOfUser.size() == 0) {
                userRabbit.setOpacity(0.4);
                rabbitToSheepButton.setDisable(true);
            }
            countUserSmallDog.setText(String.valueOf(smallDogsOfUser.size()));
            if (smallDogsOfUser.size() == 0) {
                userSmallDog.setOpacity(0.4);
                smallDogtoSheepButton.setDisable(true);
            }


            countUserSheep.setText(String.valueOf(sheep.addToDequeOffSheep(sheepOfUser, sheepOfFarm, randomNumberBlue, randomNumberRed).size()));
            if (sheepOfUser.size() > 0) {
                userSheep.setOpacity(1.0);
                sheepToSmallDogButton.setDisable(false);
                sheepToRabbitButton.setDisable(false);
            }
            if (sheepOfUser.size() >= 2) {
                sheepToPigButton.setDisable(false);
            }

            countUserPig.setText(String.valueOf(pig.addToDequeOffPig(pigsOfUser, pigsOfFarm, randomNumberBlue, randomNumberRed).size()));
            if (pigsOfUser.size() > 0) {
                pigToSheepButton.setDisable(false);
                userPig.setOpacity(1.0);
            }
            if (pigsOfUser.size() >= 3) {
                pigToCowButton.setDisable(false);
            }

            countUserCow.setText(String.valueOf(cow.addToDequeOffCow(cowsOfUser, cowsOfFarm, randomNumberBlue).size()));
            if (cowsOfUser.size() > 0) {
                cowToPigButton.setDisable(false);
                userCow.setOpacity(1.0);
            }
            if (cowsOfUser.size() > 2) {
                cowToHorseButton.setDisable(false);
            }

            countUserHorse.setText(String.valueOf(horse.addToDequeOffHorse(horsesOfUser, horsesOfFarm, randomNumberRed).size()));
            if (horsesOfUser.size() > 0) {
                horseToCowButton.setDisable(false);
                userHorse.setOpacity(1.0);
            }

            countUserRabbit.setText(String.valueOf(wolf.removeRabbits(rabbitsOfUser, rabbitsOfFarm, bigDogsOfUser, bigDogsOfFarm, randomNumberBlue).size()));
            countUserSheep.setText(String.valueOf(wolf.removeSheep(sheepOfUser, sheepOfFarm, bigDogsOfUser, bigDogsOfFarm, randomNumberBlue).size()));
            countUserPig.setText(String.valueOf(wolf.removePigs(pigsOfUser, pigsOfFarm, bigDogsOfUser, bigDogsOfFarm, randomNumberBlue).size()));
            countUserCow.setText(String.valueOf(wolf.removeCows(cowsOfUser, cowsOfFarm, bigDogsOfUser, bigDogsOfFarm, randomNumberBlue).size()));
            countUserBigDog.setText(String.valueOf(wolf.removeBigDog(bigDogsOfUser, bigDogsOfFarm, randomNumberBlue).size()));

            if (rabbitsOfUser.size() == 0) {
                userRabbit.setOpacity(0.4);
                rabbitToSheepButton.setDisable(true);
            }
            if (sheepOfUser.size() == 0) {
                userSheep.setOpacity(0.4);
                sheepToSmallDogButton.setDisable(true);
                sheepToRabbitButton.setDisable(true);
                sheepToPigButton.setDisable(true);

            }
            if (pigsOfUser.size() == 0) {
                userPig.setOpacity(0.4);
                pigToCowButton.setDisable(true);
                pigToSheepButton.setDisable(true);
            }
            if (cowsOfUser.size() == 0) {
                userCow.setOpacity(0.4);
                cowToBigDogButton.setDisable(true);
                cowToHorseButton.setDisable(true);
                cowToPigButton.setDisable(true);
            }
            if (bigDogsOfUser.size() == 0) {
                userBigDog.setOpacity(0.4);
                bigDogToCowButton.setDisable(true);
            }


            //setDisabledButtonInCaseShortageOfAnimals();
            SetDisibility.setDisabilityComputer(rabbitToSheepButton, sheepToRabbitButton,
                    sheepToSmallDogButton, smallDogtoSheepButton,sheepToPigButton,pigToSheepButton,pigToCowButton,cowToPigButton
                    ,cowToHorseButton,horseToCowButton,cowToBigDogButton,bigDogToCowButton,rabbitsOfComputer, sheepOfComputer,
                    pigsOfComputer,cowsOfComputer,horsesOfComputer,bigDogsOfComputer,smallDogsOfComputer);

            turn.nextTurn(userResultLabel, computerResultLabel);
            setDisabledButtonInCaseShortageOfAnimals();
        }

//////////////////////// część komputera
        ////////////////////////////////////
        //////////////////////////////
        else if (computerResultLabel.getStyle() == "-fx-background-color: RED;") {
            int randomNumberRed = RedDig.randomNumber();
            int randomNumberBlue = BlueDig.randomNumber();


            //rzuty kością dający rezultat

            computerBlueDigResult.setImage(blueDig.assignNumberToPictures(randomNumberBlue));
            computerRedDigResult.setImage(redDig.assignNumberToPictures(randomNumberRed));


            countComputerRabbit.setText(String.valueOf(rabbit.addToDequeOffRabbit(rabbitsOfComputer, rabbitsOfFarm, randomNumberBlue, randomNumberRed).size()));
            if (rabbitsOfComputer.size() > 0) {
                computerRabbit.setOpacity(1.0);
            }
            if (rabbitsOfComputer.size() >= 6) {
                rabbitToSheepButton.setDisable(false);
            }


            countComputerRabbit.setText(String.valueOf(fox.removeRabbits(rabbitsOfComputer, rabbitsOfFarm, smallDogsOfComputer, smallDogsOfFarm, randomNumberRed).size()));
            if (rabbitsOfComputer.size() == 0) {
                computerRabbit.setOpacity(0.4);
                rabbitToSheepButton.setDisable(true);
            }
            countComputerSmallDog.setText(String.valueOf(smallDogsOfComputer.size()));
            if (smallDogsOfComputer.size() == 0) {
                computerSmallDog.setOpacity(0.4);
                smallDogtoSheepButton.setDisable(true);
            }


            countComputerSheep.setText(String.valueOf(sheep.addToDequeOffSheep(sheepOfComputer, sheepOfFarm, randomNumberBlue, randomNumberRed).size()));
            if (sheepOfComputer.size() > 0) {
                computerSheep.setOpacity(1.0);
                sheepToSmallDogButton.setDisable(false);
                sheepToRabbitButton.setDisable(false);
            }
            if (sheepOfComputer.size() >= 2) {
                sheepToPigButton.setDisable(false);
            }

            countComputerPig.setText(String.valueOf(pig.addToDequeOffPig(pigsOfComputer, pigsOfFarm, randomNumberBlue, randomNumberRed).size()));
            if (pigsOfComputer.size() > 0) {
                pigToSheepButton.setDisable(false);
                computerPig.setOpacity(1.0);
            }
            if (pigsOfComputer.size() >= 3) {
                pigToCowButton.setDisable(false);
            }

            countComputerCow.setText(String.valueOf(cow.addToDequeOffCow(cowsOfComputer, cowsOfFarm, randomNumberBlue).size()));
            if (cowsOfComputer.size() > 0) {
                cowToPigButton.setDisable(false);
                computerCow.setOpacity(1.0);
            }
            if (cowsOfComputer.size() > 2) {
                cowToHorseButton.setDisable(false);
            }

            countComputerHorse.setText(String.valueOf(horse.addToDequeOffHorse(horsesOfComputer, horsesOfFarm, randomNumberRed).size()));
            if (horsesOfComputer.size() > 0) {
                horseToCowButton.setDisable(false);
                computerHorse.setOpacity(1.0);
            }

            countComputerRabbit.setText(String.valueOf(wolf.removeRabbits(rabbitsOfComputer, rabbitsOfFarm, bigDogsOfComputer, bigDogsOfFarm, randomNumberBlue).size()));
            countComputerSheep.setText(String.valueOf(wolf.removeSheep(sheepOfComputer, sheepOfFarm, bigDogsOfComputer, bigDogsOfFarm, randomNumberBlue).size()));
            countComputerPig.setText(String.valueOf(wolf.removePigs(pigsOfComputer, pigsOfFarm, bigDogsOfComputer, bigDogsOfFarm, randomNumberBlue).size()));
            countComputerCow.setText(String.valueOf(wolf.removeCows(cowsOfComputer, cowsOfFarm, bigDogsOfComputer, bigDogsOfFarm, randomNumberBlue).size()));
            countComputerBigDog.setText(String.valueOf(wolf.removeBigDog(bigDogsOfComputer, bigDogsOfFarm, randomNumberBlue).size()));

            if (rabbitsOfComputer.size() == 0) {
                computerRabbit.setOpacity(0.4);
                rabbitToSheepButton.setDisable(true);
            }
            if (sheepOfComputer.size() == 0) {
                computerSheep.setOpacity(0.4);
                sheepToSmallDogButton.setDisable(true);
                sheepToRabbitButton.setDisable(true);
                sheepToPigButton.setDisable(true);

            }
            if (pigsOfComputer.size() == 0) {
                computerPig.setOpacity(0.4);
                pigToCowButton.setDisable(true);
                pigToSheepButton.setDisable(true);
            }
            if (cowsOfComputer.size() == 0) {
                computerCow.setOpacity(0.4);
                cowToBigDogButton.setDisable(true);
                cowToHorseButton.setDisable(true);
                cowToPigButton.setDisable(true);
            }
            if (bigDogsOfComputer.size() == 0) {
                computerBigDog.setOpacity(0.4);
                bigDogToCowButton.setDisable(true);
            }



            SetDisibility.setDisabilityUser(rabbitToSheepButton,sheepToRabbitButton,sheepToSmallDogButton,
                    smallDogtoSheepButton,sheepToPigButton,pigToSheepButton,pigToCowButton,
                    cowToPigButton,cowToHorseButton,horseToCowButton,cowToBigDogButton,bigDogToCowButton
                    ,rabbitsOfUser,sheepOfUser,pigsOfUser,cowsOfUser,horsesOfUser,bigDogsOfUser,smallDogsOfUser);
            turn.nextTurn(userResultLabel, computerResultLabel);

            setDisabledButtonInCaseShortageOfAnimals();


        }
    }

    public void howManyAnimalsOfFarm() {
        System.out.println("króliki w farmie : " + rabbitsOfFarm.size());
        System.out.println("owce w farmie: " + sheepOfFarm.size());
        System.out.println("świrnie w farmie " + pigsOfFarm.size());
        System.out.println("krów na farmie :" + cowsOfFarm.size());
        System.out.println("Koni na farmie :" + horsesOfFarm.size());
        System.out.println("Małych psów na farmie : " + smallDogsOfFarm.size());
        System.out.println("Dużych psów na farmie : " + bigDogsOfFarm.size());
    }
}

