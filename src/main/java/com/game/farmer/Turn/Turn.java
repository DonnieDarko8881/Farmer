package com.game.farmer.Turn;

import com.game.farmer.users.User;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.util.Deque;

public class Turn {
     User user = new User("User");
     User computer = new User("computer");



    public void firstTurn(Label userResultLabel){
     userResultLabel.setStyle("-fx-background-color: CADETBLUE;");

    }
    
    public void nextTurn(Label userResultLabel, Label computerResultLabel){

        if(userResultLabel.getStyle().equals("-fx-background-color: CADETBLUE;")){
            userResultLabel.setStyle("-fx-background-color: WHITE;");
            computerResultLabel.setStyle("-fx-background-color: RED;");

        }else if(computerResultLabel.getStyle().equals("-fx-background-color: RED;")){
            computerResultLabel.setStyle("-fx-background-color: WHITE;");
            userResultLabel.setStyle("-fx-background-color: CADETBLUE;");
        }

    }
    public String infoWhoWin(Label userResultLabel, Label computerResultLabel){
        if(userResultLabel.getStyle().equals("-fx-background-color: CADETBLUE;")){
            return"Congrats " +user.getName()+ "! You Win ";
        }
        else if(computerResultLabel.getStyle().equals("-fx-background-color: RED;")) {
            return "Congrats " + computer.getName() + "! You Win ";
        }
        return "";
    }

}
