package com.game.fx.controller;

import com.game.farmer.animals.enemy.Fox;
import com.game.farmer.animals.user.Pig;
import com.game.farmer.animals.user.Rabbit;
import com.game.farmer.animals.user.Sheep;
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
    private ImageView userSmallDog;



    @FXML
    private Label countUserRabbit;

    @FXML
    private Label countUserSheep;

    @FXML
    private Label countUserPig;

    @FXML
    private Label countUserSmallDog;

    @FXML
    private Button rabbitToSheepButton;

    @FXML
    private Button sheepToRabbitButton;

    @FXML
    private Button sheepToSmallDogButton;

    @FXML
    private Button smallDogtoSheepButton;


    public MainController() {

    }

    public void initialize() {

    }

    Deque<String> rabbitsOfUser = new ArrayDeque<>();
    Deque<String> sheepOfUser = new ArrayDeque<>();
    Deque<String> pigsOfUser = new ArrayDeque<>();
    Deque<String> smallDogsOfUser =new ArrayDeque<>();

    BlueDig blueDig = new BlueDig();
    RedDig redDig = new RedDig();
    Rabbit rabbit = new Rabbit();
    Sheep sheep = new Sheep();
    Pig pig = new Pig();
    Fox fox = new Fox();

    public void exchangeRabbitToSheep() {
        for (int i = 0; i < 6; i++) {
            rabbitsOfUser.pop();
        }

        sheepOfUser.push("Sheep");

        countUserSheep.setText(String.valueOf(sheepOfUser.size()));
        if (sheepOfUser.size() > 0) {
            sheepToRabbitButton.setDisable(false);
            sheepToSmallDogButton.setDisable(false);
            userSheep.setOpacity(1.0);
        }

        countUserRabbit.setText(String.valueOf(rabbitsOfUser.size()));
        if (rabbitsOfUser.size() == 0) {
            userRabbit.setOpacity(0.4);
        }
        if (rabbitsOfUser.size() < 6) {
            rabbitToSheepButton.setDisable(true);
        }

    }

    public void exchangeSheepToRabbits() {
        sheepOfUser.pop();

        for (int i = 0; i < 6; i++) {
            rabbitsOfUser.push("Rabbit");
        }

        countUserSheep.setText(String.valueOf(sheepOfUser.size()));
        if (sheepOfUser.size() == 0) {
            sheepToRabbitButton.setDisable(true);
            sheepToSmallDogButton.setDisable(true);
            userSheep.setOpacity(0.4);
        }

        countUserRabbit.setText(String.valueOf(rabbitsOfUser.size()));
        if (rabbitsOfUser.size() > 0) {
            userRabbit.setOpacity(1.0);
        }
        if (rabbitsOfUser.size() > 6) {
            rabbitToSheepButton.setDisable(false);
        }
    }

    public void exchangeSheepToSmallDog() {
        sheepOfUser.pop();
        smallDogsOfUser.push("Small Dog");

        countUserSmallDog.setText(String.valueOf(smallDogsOfUser.size()));
        if(smallDogsOfUser.size()>0){
            userSmallDog.setOpacity(1.0);
            smallDogtoSheepButton.setDisable(false);
        }

        countUserSheep.setText(String.valueOf(sheepOfUser.size()));
        if (sheepOfUser.size() == 0) {
            sheepToRabbitButton.setDisable(true);
            sheepToSmallDogButton.setDisable(true);
            userSheep.setOpacity(0.4);
        }




    }

    // metoda po kliknieciu myszką na kość
    public void randomResult() {

        int randomNumberRed = RedDig.randomNumber();
        int randomNumberBlue = BlueDig.randomNumber();

        //rzuty kością dający rezultat
        userBlueDigResult.setImage(blueDig.assignNumberToPictures(randomNumberBlue));
        userRedDigResult.setImage(redDig.assignNumberToPictures(randomNumberRed));

        //ustawienie liczenia królików przezroczystosci królika i odblokowanie przycisku zmiany królika
        countUserRabbit.setText(String.valueOf(rabbit.addToDequeOffRabbit(rabbitsOfUser, randomNumberBlue, randomNumberRed).size()));
        if (rabbitsOfUser.size() > 0) {
            userRabbit.setOpacity(1.0);
        }
        if (rabbitsOfUser.size() >= 6) {
            rabbitToSheepButton.setDisable(false);
        }

        countUserRabbit.setText(String.valueOf(fox.removeRabbits(rabbitsOfUser, randomNumberRed).size()));
        if (rabbitsOfUser.size() == 0) {
            userRabbit.setOpacity(0.4);
        }


        countUserSheep.setText(String.valueOf(sheep.addToDequeOffSheep(sheepOfUser, randomNumberBlue, randomNumberRed).size()));
        if (sheepOfUser.size() > 0) {
            userSheep.setOpacity(1.0);
            sheepToSmallDogButton.setDisable(false);
            sheepToRabbitButton.setDisable(false);
        }

        countUserPig.setText(String.valueOf(pig.addToDequeOffPig(pigsOfUser, randomNumberBlue, randomNumberRed).size()));
        if (pigsOfUser.size() > 0) {
            userPig.setOpacity(1.0);
        }
    }
}
