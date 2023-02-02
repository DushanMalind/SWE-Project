package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UpdateMale {
    public AnchorPane mealPackagesId;
    public ComboBox cmbMealType;

    public void initialize(){
        cmbMealType.getItems().add("Indian");
        cmbMealType.getItems().add("Chinese");
        cmbMealType.getItems().add("Sri lankan");
    }

    public void btnUpdate(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Update Data").show();
    }

    public void btnBack(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) mealPackagesId.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/MealPackage.fxml"))));
    }
}
