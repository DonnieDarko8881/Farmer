package com.game.farmer.Turn;

import com.game.farmer.users.User;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class Turn {
    User user = new User("Donnie");



    public void firstTurn(Label userResultLabel){
     userResultLabel.setStyle("-fx-background-color: CADETBLUE;");

    }

    public void nextTurn(Label userResultLabel, Label computerResultLabel){
        if(userResultLabel.getStyle() =="-fx-background-color: CADETBLUE;"){
            userResultLabel.setStyle("-fx-background-color: WHITE;");
            computerResultLabel.setStyle("-fx-background-color: RED;");

        }else if(computerResultLabel.getStyle() =="-fx-background-color: RED;"){
            computerResultLabel.setStyle("-fx-background-color: WHITE;");
            userResultLabel.setStyle("-fx-background-color: CADETBLUE;");
        }

    }


}
