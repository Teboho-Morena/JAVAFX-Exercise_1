package com.example.increasedecrease;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class IncreaseDecreaseController {
    @FXML
    private Label myLabel;

    private int count = 0;

    public void Increase(ActionEvent event) {
        count++;
        myLabel.setText("Number: " + count);
    }

    public void Decrease(ActionEvent event) {
        count--;
        myLabel.setText("Number: " + count);
    }
}