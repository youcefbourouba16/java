package com.example.cour7_send_data_between_scenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;
import java.util.Objects;

public class HelloController {
    public TextField user_name;
    public Button btn_login;
    private Parent root;
    private Scene scene;

    private Stage stage;
    public void login(ActionEvent event) throws IOException {
        String user_nam = user_name.getText();
        FXMLLoader Loader = new FXMLLoader(getClass().getResource("login.fxml"));


        boolean isDegiteonly=true;
        if (!user_nam.isEmpty()) {
            for (char c : user_nam.toCharArray()) {
                if (!Character.isDigit(c)) {
                    isDegiteonly = false;
                    break; // No need to continue checking if a non-digit character is found
                }
            }

            if (isDegiteonly) {
                Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
                informationAlert.setTitle("Error");
                informationAlert.setContentText("Enter a valid user name with non-digit characters");
                informationAlert.showAndWait(); // Show the alert
            } else {
                root = Loader.load();
                Login login = Loader.getController();
                login.wlcm(user_nam);
            }
        } else {
            Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
            informationAlert.setTitle("Error");
            informationAlert.setContentText("Enter a valid user name");
            informationAlert.showAndWait(); // Show the alert
        }


        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}