package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class cnpControlller implements Initializable {

    public Label result;
    public TextField n;
    public TextField r;
    public AnchorPane scene1;
    public TextField results;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switch_to_cpn(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public int fact(int x){
        int fact=1;
        for (int i = 1; i <=x ; i++) {
            fact*=i;

        }
        return fact;
    }
    public void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    public void calc(){
        try{

            int n1 = Integer.parseInt(n.getText());
            int r1 = Integer.parseInt(r.getText());
            if (n1>r1){
                double c=((double) fact(n1) /fact(n1-r1)*fact(r1));
                results.setText(String.valueOf(c));
            }else showAlert(Alert.AlertType.INFORMATION,"Error","N must be supperior at R");


        }
        catch (NumberFormatException e){
            showAlert(Alert.AlertType.INFORMATION,"Error","plz enter a valid numbers");

        }

    }
    public  void clear(){
        n.setText("");
        r.setText("");
        results.setText("");

    }
}






