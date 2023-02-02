package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MonthlyReport {
    public AnchorPane mealPackagesId;

    public void btnSave(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Save Data").show();
    }

    public void btnBack(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) mealPackagesId.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/IncomeReport.fxml"))));
    }
}
