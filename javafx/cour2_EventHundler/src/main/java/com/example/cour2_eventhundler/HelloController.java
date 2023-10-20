package com.example.cour2_eventhundler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Circle mycircle;
    private double Y, X;


    public void up(ActionEvent e) {
        System.out.println("up");
        mycircle.setCenterY(Y-=15);

    }
    public void right(ActionEvent e) {
        System.out.println("right");
        mycircle.setCenterX(X+=15);

    }
    public void left(ActionEvent e) {
        System.out.println("left");
        mycircle.setCenterX(X-=15);

    }
    public void bottom(ActionEvent e) {
        System.out.println("bottom");
        mycircle.setCenterY(Y+=15);

    }
}