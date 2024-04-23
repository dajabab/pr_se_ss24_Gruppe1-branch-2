package com.example.smarthomeappv2;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.Image;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.text.Text;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class HOMEPAGEController implements Initializable {

    @FXML
    private Text temperatureCity;

    @FXML
    private ImageView add_room_btn;

    @FXML
    private ImageView room_btn;

    @FXML
    private ImageView livingroom_btn;

    @FXML
    private ImageView kitchen_btn;

    @FXML
    private ImageView entrance_btn;

    @FXML
    private ImageView weatherDisplayImage;

    @FXML
    private Text cityLabel;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        String location = "Madrid, ESP";
        try {
            updateTemperature(location);
            weatherInfo(location);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        addListeners();
        cityLabel.setText(location);
    }


    private void updateTemperature(String location) throws IOException {
        TemperatureCity temp = new TemperatureCity();
        int temperature=temp.getTemperature(location);
        temperatureCity.setText(temperature+"°C");
    }

    private void weatherInfo(String location) throws IOException {
        TemperatureCity temp = new TemperatureCity();
        String weatherInfoRN = temp.getWeatherInfo(location);
        if(weatherInfoRN.contains("Clouds") ||weatherInfoRN.contains("clouds")){
            Image image = new Image(getClass().getResourceAsStream("/com/example/weatherIcons/clouds.png"));
            weatherDisplayImage.setImage(image);
        }else if(weatherInfoRN.contains("Rain") || weatherInfoRN.contains("rain")){
            Image image = new Image(getClass().getResourceAsStream("/com/example/weatherIcons/rains.png"));
            weatherDisplayImage.setImage(image);
        }else if(weatherInfoRN.contains("Snow") || weatherInfoRN.contains("snow")){
            Image image = new Image(getClass().getResourceAsStream("/com/example/weatherIcons/snowy.png"));
            weatherDisplayImage.setImage(image);
        }else if(weatherInfoRN.contains("Clear") || weatherInfoRN.contains("sun")){
            Image image = new Image(getClass().getResourceAsStream("/com/example/weatherIcons/sun.png"));
            weatherDisplayImage.setImage(image);
        }
    }

    private void addListeners() {
        livingroom_btn.setOnMouseClicked(Event -> onLivingRoom());
        kitchen_btn.setOnMouseClicked(Event -> onKitchen());
        entrance_btn.setOnMouseClicked(Event -> onEntrance());
    }
    @FXML
    private void onAddRoom(MouseEvent event) {
        try {
            // Load the HOMEPAGE.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Add_ROOM.fxml"));
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
    private void onRoom(MouseEvent event) {
        try {
            // Load the HOMEPAGE.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ROOM_OVERVIEW.fxml"));
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
    private void onLivingRoom() {

    }
    private void onKitchen() {

    }
    private void onEntrance() {

    }

    public void handleImageClick(MouseEvent mouseEvent) {
        try {
            // Load the HOMEPAGE.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Add_ROOM.fxml"));
            Parent root = loader.load();

            // Create a new scene with the loaded root node
            Scene scene = new Scene(root);

            // Get the reference to the current stage
            Stage stage = (Stage) add_room_btn.getScene().getWindow(); // Replace 'yourCancelButton' with the reference to your cancel button

            // Set the scene to the stage
            stage.setScene(scene);

            // Show the stage
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }



}
