package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ///Stage stage1 = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root,600,600,Color.CYAN);//// back ground color

        stage.setTitle("WELCOME!");
        stage.setScene(scene);


        Image icon = new Image("icons8-image-48.png");
        stage.getIcons().add(icon);
        /////  stage.setWidth(420);
        ////// stage.setHeight(420);
        stage.setResizable(false);
        stage.setX(600);
        stage.setY(50);
        stage.setFullScreenExitHint("YOU CANT ESCAPE UNTILL YOU PRESS Q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("Q"));
        stage.setFullScreen(false);//// remove/add full Screen option

        Text text = new Text();
        text.setText("wowo");
        text.setX(30);
        text.setY(50);
        root.getChildren().add(text); ////let the text apear
        text.setFont(Font.font("Verdana",50)); /////font family and collor
        text.setFill(Color.GREENYELLOW); ///font color

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        root.getChildren().add(line); /// nessaisar
        line.setStrokeWidth(6);
        line.setStroke(Color.BROWN); ////Strock mean color i gauss
        line.setOpacity(0.8);
        line.setRotate(90);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}