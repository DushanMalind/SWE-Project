package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AnualiyReport {
    public AnchorPane mealPackagesId;

    public void btnAddData(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Add Data").show();
    }

    public void btnPrint(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Print Report").show();
    }

    public void btnBack(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) mealPackagesId.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/IncomeReport.fxml"))));
    }
}
