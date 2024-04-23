package com.example.smarthomeappv2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ROOM_OVERVIEWController {
    @FXML
    private CheckBox OnOffDeviceBtn;

    @FXML
    private ImageView delete_device_btn;

    @FXML
    private ImageView delete_room_btn;

    @FXML
    private AnchorPane edit_device_btn;

    @FXML
    private ImageView edit_room_btn;

    @FXML
    private ImageView home_btn;

    @FXML
    private ImageView info_room_btn;

    @FXML
    private ImageView save_room_btn;

    @FXML
    void OnOffDevice(ActionEvent event) {

    }

    @FXML
    void editRoomOverview(MouseEvent event) {

    }

    @FXML
    void handleImageClick(MouseEvent event) {

    }

    @FXML
    void onDeleteBtn(MouseEvent event) {
        try {
            // Load the HOMEPAGE.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DELETE_ROOM.fxml"));
            Parent root = loader.load();

            // Create a new scene with the loaded root node
            Scene scene = new Scene(root);

            // Get the reference to the current stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            // Set the scene to the stage
            stage.setScene(scene);

            // Show the stage
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    void onDeleteDeviceBtn(MouseEvent event) {

    }

    @FXML
    void onEditBtn(MouseEvent event) {
        try {
            // Load the HOMEPAGE.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EDIT_ROOM.fxml"));
            Parent root = loader.load();

            // Create a new scene with the loaded root node
            Scene scene = new Scene(root);

            // Get the reference to the current stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            // Set the scene to the stage
            stage.setScene(scene);

            // Show the stage
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    void onEditDeviceBtn(MouseEvent event) {

    }

    @FXML
    void onHomeBtn(MouseEvent event) {
        try {
            // Load the HOMEPAGE.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HOMEPAGE.fxml"));
            Parent root = loader.load();

            // Create a new scene with the loaded root node
            Scene scene = new Scene(root);

            // Get the reference to the current stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            // Set the scene to the stage
            stage.setScene(scene);

            // Show the stage
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    void onInfoBtn(MouseEvent event) {

    }

    @FXML
    void onSaveBtn(MouseEvent event) {
        try {
            // Load the HOMEPAGE.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SAVE_ROOM.fxml"));
            Parent root = loader.load();

            // Create a new scene with the loaded root node
            Scene scene = new Scene(root);

            // Get the reference to the current stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            // Set the scene to the stage
            stage.setScene(scene);

            // Show the stage
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    void turnOnOffDevice(MouseEvent event) {

    }
}
