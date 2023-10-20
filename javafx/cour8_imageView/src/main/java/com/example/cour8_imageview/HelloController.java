package com.example.cour8_imageview;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class HelloController {
    public ImageView imageView;
    public Button next;
    public Button previous;
    @FXML
    private Label welcomeText;
    int i=0;


    public void nextt(){
        if(i<3){
            next.setVisible(true);
            previous.setVisible(true);
            i++;
            Image image = new Image(getClass().getResourceAsStream("img"+i+".png"));
            imageView.setImage(image);
        } else next.setVisible(false);
    }
    public void previos(){
        if(i>0){
            next.setVisible(true);
            i--;
            Image image = new Image(getClass().getResourceAsStream("img"+i+".png"));
            imageView.setImage(image);
        }else previous.setVisible(false);

    }


}