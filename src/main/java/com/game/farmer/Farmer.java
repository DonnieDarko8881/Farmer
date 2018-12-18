package com.game.farmer;

import com.game.farmer.Turn.Turn;
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


        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/boardWindow.fxml"));


        StackPane stackPane = loader.load();
        Scene scene = new Scene(stackPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Farmer");
        primaryStage.show();


    }
}
