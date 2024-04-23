package com.example.smarthomeappv2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class ADD_DEVICEController {

    @FXML
    private Button add_device_btn;

    @FXML
    private ImageView back_btn;

    @FXML
    private Button cancel_device_btn;

    @FXML
    private Button confirm_btn;

    @FXML
    private ComboBox<String> deviceList;

    @FXML
    private TextField deviceNameTextField;

    @FXML
    void addDevice(ActionEvent event) {

    }

    @FXML
    void cancelDevice(ActionEvent event) {
        try{
            // Load the HOMEPAGE.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ROOM_OVERVIEW.fxml"));
            Parent root = loader.load();

            // Create a new scene with the loaded root node
            Scene scene = new Scene(root);

            // Get the reference to the current stage
            Stage stage = (Stage) confirm_btn.getScene().getWindow(); // Replace 'yourCancelButton' with the reference to your cancel button

            // Set the scene to the stage
            stage.setScene(scene);

            // Show the stage
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    void confirmAdding(ActionEvent event) {
        try{
            // Load the HOMEPAGE.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ROOM_OVERVIEW.fxml"));
            Parent root = loader.load();

            // Create a new scene with the loaded root node
            Scene scene = new Scene(root);

            // Get the reference to the current stage
            Stage stage = (Stage) confirm_btn.getScene().getWindow(); // Replace 'yourCancelButton' with the reference to your cancel button

            // Set the scene to the stage
            stage.setScene(scene);

            // Show the stage
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    public void initialize(){
        deviceList.getItems().addAll("Door","Lamp","Fan","Window");
        deviceList.getSelectionModel().selectFirst();
    }

}
