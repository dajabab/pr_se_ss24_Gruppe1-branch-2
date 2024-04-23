package com.example.smarthomeappv2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DELETE_ROOMController {

    @FXML
    private Button cancel_btn;

    @FXML
    private Button delete_btn;

    @FXML
    void cancel_deletion(ActionEvent event) {
        try {
            // Load the HOMEPAGE.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ROOM_OVERVIEW.fxml"));
            Parent root = loader.load();

            // Create a new scene with the loaded root node
            Scene scene = new Scene(root);

            // Get the reference to the current stage
            Stage stage = (Stage) cancel_btn.getScene().getWindow(); // Replace 'yourCancelButton' with the reference to your cancel button

            // Set the scene to the stage
            stage.setScene(scene);

            // Show the stage
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void deleteRoom(ActionEvent event) {
        try {
            // Load the HOMEPAGE.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HOMEPAGE.fxml"));
            Parent root = loader.load();

            // Create a new scene with the loaded root node
            Scene scene = new Scene(root);

            // Get the reference to the current stage
            Stage stage = (Stage) delete_btn.getScene().getWindow(); // Replace 'yourCancelButton' with the reference to your cancel button

            // Set the scene to the stage
            stage.setScene(scene);

            // Show the stage
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
