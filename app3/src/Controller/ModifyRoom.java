package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ModifyRoom {
    public AnchorPane mealPackagesId;
    public ComboBox cmbRoomType;

    public void initialize(){
        cmbRoomType.getItems().add("Single room");
        cmbRoomType.getItems().add("Double room");
        cmbRoomType.getItems().add("Deluxe");
    }

    public void btnUpdate(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Update Room").show();
    }

    public void btnBack(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) mealPackagesId.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/RoomDeatils.fxml"))));
    }
}
