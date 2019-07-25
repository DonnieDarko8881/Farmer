package com.game.fx.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuController {
    
    private MainScreen mainScreen;

    @FXML
    public void openStart() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/boardWindow.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MainController mainController = loader.getController();
        mainController.setMainScreen(mainScreen);
        mainScreen.setScreen(pane);
    }

    @FXML
    public void openInstruction() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/instruction.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InstructionController instructionController = loader.getController();
        instructionController.setMainScreen(mainScreen);
        mainScreen.setScreen(pane);

    }

    @FXML
    void openExit() {
        Platform.exit();
    }

    public void setMainScreen(MainScreen mainScreen) {
        this.mainScreen = mainScreen;
    }
}
