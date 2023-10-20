package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    private Label  lb1;
    private int  cpt = 0;
    public  void click(){
        cpt+=1;
        lb1.setText("you clicked "+cpt);
    }

}