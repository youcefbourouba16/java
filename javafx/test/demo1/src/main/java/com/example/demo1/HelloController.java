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

public class HelloController implements Initializable {
    public ToggleGroup calc;
    public AnchorPane scene1;
    @FXML
    private Label result;
    @FXML
    private TextField x1;
    @FXML
    private TextField x2;
    @FXML
    private RadioButton plus;
    @FXML
    private RadioButton minus;
    @FXML
    private RadioButton multiply;
    @FXML
    private RadioButton divition;
    @FXML
    private RadioButton fact;
    @FXML
    private Button clear;


    @FXML
    public void onHelloButtonClick() {
        if (x1.getText().isEmpty() || x2.getText().isEmpty()) {
            result.setText("Please enter valid numbers in both fields.");
        } else {
            try {
                double num1 = Double.parseDouble(x1.getText());
                double num2 = Double.parseDouble(x2.getText());

                if (plus.isSelected()) {
                    double sum = num1 + num2;
                    result.setText(String.valueOf(sum));
                } else if (minus.isSelected()) {
                    double sum = num1 - num2;
                    result.setText(String.valueOf(sum));
                } else if (multiply.isSelected()) {
                    double sum = num1 * num2;
                    result.setText(String.valueOf(sum));
                } else if (divition.isSelected()) {
                    if (num2 != 0) {
                        double sum = num1 / num2;
                        result.setText(String.valueOf(sum));
                    } else {
                        result.setText("The second number must be different from 0");
                    }
                } else if (fact.isSelected()) {
                    if (num1 >= 0 && num1 == Math.floor(num1)) {
                        int x = (int) num1;
                        int fact = 1;
                        for (int i = 1; i <= x; i++) {
                            fact *= i;
                        }
                        result.setText(String.valueOf(fact));
                    } else {
                        result.setText("Please enter a valid non-negative integer for factorial calculation.");
                    }
                }
            } catch (NumberFormatException e) {
                result.setText("Please enter valid numeric values.");
            }
        }





    }
    public  void clear(){
        x1.setText("");
        x2.setText("");
        result.setText("");
    }
    public void remove_textfield(){
        if (fact.isSelected()) {
            x2.setVisible(false);
        }else x2.setVisible(true);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Set the first RadioButton to be selected when the application loads
        plus.setSelected(true);
    }
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switch_to_cpn(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("cnp.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}






