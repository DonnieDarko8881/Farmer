package com.game.farmer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.scene.layout.StackPane;

import javafx.stage.Stage;

public class Farmer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loaderMenu = new FXMLLoader(this.getClass().getResource("/fxml/mainScreen.fxml"));
        StackPane mainScreen = loaderMenu.load();
        Scene sceneMenu = new Scene(mainScreen,1261,638);

        primaryStage.setScene(sceneMenu);
        primaryStage.setTitle("Farmer");
        primaryStage.show();


    }
}
