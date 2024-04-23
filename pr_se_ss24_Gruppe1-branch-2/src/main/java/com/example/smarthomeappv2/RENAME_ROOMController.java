package com.example.smarthomeappv2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RENAME_ROOMController implements Initializable {

    @FXML
    private Button cancel_btn;

    @FXML
    private Button confirm_btn;

    public void initialize(URL url, ResourceBundle rb) {
        addListeners();
    }

    private void addListeners(){
        cancel_btn.setOnAction(Event -> onRenameRoomCancel());
        confirm_btn.setOnAction(Event -> onRenameRoomConfirm());
    }


    @FXML
    void onRenameRoomCancel() {
        try {
            // Load the HOMEPAGE.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HOMEPAGE.fxml"));
            Parent root = loader.load();

            // Create a new scene with the loaded root node
            Scene scene = new Scene(root);

            // Get the reference to the current stage
            Stage stage = (Stage) cancel_btn.getScene().getWindow();

            // Set the scene to the stage
            stage.setScene(scene);

            // Show the stage
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    void onRenameRoomConfirm() {

    }

}
