package com.game.fx.controller;

import com.game.farmer.Farmer;
import com.game.farmer.users.User;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class WinController {
    @FXML
    private Pane winnerPlane;

    @FXML
    private Button Menu;

    @FXML
    private Label informationOfWinner;

    @FXML
    private Button Exit;

    private MainScreen mainScreen;
    MainController mainController;
    User user = new User("User");
    User computer = new User("computer");


    @FXML
    public void initialize() {


    }

    public void infoWhoWin(Label userResultLabel, Label computerResultLabel ) {
        if(userResultLabel.getStyle().equals("-fx-background-color: CADETBLUE;")){
            informationOfWinner.setText("Congrats! "+user.getName() +", You are Winner!");
        } else if(computerResultLabel.getStyle().equals("-fx-background-color: RED;")){
            informationOfWinner.setText("Congrats! "+computer.getName()+", You are Winner!");
        }
    }

    @FXML
    void openMenu()  {

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/menu.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MenuController menuController = loader.getController();
        menuController.setMainScreen(mainScreen);
        mainScreen.setScreen(pane);

    }

    @FXML
    void openExitWin() {
        Platform.exit();
    }

    public void setMainScreen(MainScreen mainScreen) {
        this.mainScreen = mainScreen;
    }
}
