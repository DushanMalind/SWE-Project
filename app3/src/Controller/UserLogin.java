package Controller;

import Entity.User;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UserLogin   {


    public AnchorPane mainFromCon;

    public void btnAdminOnClick(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) mainFromCon.getScene().getWindow();
        stage.setTitle("Login Farge");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/MainFroms.fxml"))));
       /* Parent root=FXMLLoader.load(getClass().getResource("../View/MainFroms.fxml"));

        Scene scene=new Scene(root);
        Stage primaryStage=new Stage();
        primaryStage.setScene(scene);
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        primaryStage.show();
      primaryStage.setOnCloseRequest(event -> Platform.exit());*/
    }

    public void btnReciptionOnClick(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) mainFromCon.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/RecptionLogin.fxml"))));
    }



}
