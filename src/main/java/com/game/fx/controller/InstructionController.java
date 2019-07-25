package com.game.fx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class InstructionController {

    private MainScreen mainScreen;

    @FXML
    void backMenuFromInstruction() {
        mainScreen.loadMenuScreen();
    }

    public void setMainScreen(MainScreen mainScreen) {
        this.mainScreen = mainScreen;
    }
}
