package com.example.cour7_send_data_between_scenes;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Login {

        public Label lb_wlcm;
    public Button btn_logOut;
    public AnchorPane scene_login;
    Stage stage;


    public void wlcm(String user){

            lb_wlcm.setText(" Hello : "+user);
        }


    public void logOut(ActionEvent event) {


        Alert Info_alert = new Alert(Alert.AlertType.CONFIRMATION);
        Info_alert.setTitle("LOGout and Exit");
        Info_alert.setContentText(null);
        Info_alert.setHeaderText("Are you sure you wanna logOUt and exit");
        if (Info_alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scene_login.getScene().getWindow();
            stage.close();

        }

    }
}
