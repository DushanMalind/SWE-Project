package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteMale {
    public AnchorPane mealPackagesId;

    public void btnDelete(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Delete Data").show();
    }

    public void btnBack(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) mealPackagesId.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/MealPackage.fxml"))));
    }
}
