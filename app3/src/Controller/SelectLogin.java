package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectLogin {
    public AnchorPane mealPackagesId;

    public void btnAddRoom(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) mealPackagesId.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/RoomDeatils.fxml"))));
    }

    public void btnAddMeal(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) mealPackagesId.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/MealPackage.fxml"))));
    }

    public void btnInCome(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) mealPackagesId.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/IncomeReport.fxml"))));
    }

    public void btnBack(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) mealPackagesId.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/MainFroms.fxml"))));
    }
}
