package com.game.fx.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainScreen {
    @FXML
    private StackPane mainScreenStackPane;

    @FXML
    public void initialize() {
        loadMenuScreen();

    }

    public void loadMenuScreen() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/menu.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MenuController menuController =loader.getController();
        menuController.setMainScreen(this);
        setScreen(pane);
    }

    public void setScreen(Pane pane) {
        mainScreenStackPane.getChildren().clear();
        mainScreenStackPane.getChildren().add(pane);
    }

    public void clearScreen(){
        mainScreenStackPane.getChildren().clear();
    }
}
