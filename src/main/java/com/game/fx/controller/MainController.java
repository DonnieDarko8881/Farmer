package com.game.fx.controller;

import com.game.farmer.animals.*;
import com.game.farmer.animals.enemy.Fox;
import com.game.farmer.animals.enemy.Wolf;
import com.game.farmer.digs.BlueDig;
import com.game.farmer.digs.RedDig;
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
    private ImageView digs;

    @FXML
    private ImageView userRabbit;

    @FXML
    private ImageView userSheep;

    @FXML
    private ImageView userPig;

    @FXML
    private ImageView userCow;

    @FXML
    private ImageView userHorse;

    @FXML
    private ImageView userSmallDog;

    @FXML
    private ImageView userBigDog;


    @FXML
    private Label countUserRabbit;

    @FXML
    private Label countUserSheep;

    @FXML
    private Label countUserPig;

    @FXML
    private Label countUserCow;

    @FXML
    private Label countUserHorse;

    @FXML
    private Label countUserSmallDog;

    @FXML
    private Label countUserBigDog;

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

    public void setDisabledButtonInCaseShortageOfAnimals() {

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


    }


    public void exchangeRabbitToSheep() {
        if (sheepOfFarm.size() > 0) {
            for (int i = 0; i < 6; i++) {
                rabbitsOfUser.pop();
                rabbitsOfFarm.push("rabbit");
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

    }

    public void exchangeSheepToRabbits() {

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
    }

    public void exchangeSheepToPig() {

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

    }

    public void exchangePigToSheep() {
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
    }

    public void exchangePigToCow() {

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
    }

    public void exchangeCowToPig() {
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
    }

    public void exchangeCowToHorse() {

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
    }

    public void exchangeHorseToCow() {

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
    }


    public void exchangeSheepToSmallDog() {
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
    }

    public void exchangeSmallDogToSheep() {
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
    }

    public void exchangeCowToBigDog() {
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
    }

    public void exchangeBigDogToCow() {
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
    }


    // metoda po kliknieciu myszką na kość
    public void randomResult() {

        howManyAnimalsOfFarm();

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
        countUserBigDog.setText(String.valueOf(wolf.removeBigDog(bigDogsOfUser,bigDogsOfFarm,randomNumberBlue).size()));

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


        setDisabledButtonInCaseShortageOfAnimals();
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
