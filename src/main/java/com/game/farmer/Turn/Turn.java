package com.game.farmer.Turn;
import javafx.scene.control.Label;
public class Turn {

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
}
