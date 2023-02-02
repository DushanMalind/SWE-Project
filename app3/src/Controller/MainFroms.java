package Controller;

import Entity.User;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainFroms implements Initializable {

    public TextField txtUserName;
    public PasswordField txtPassword;
    public AnchorPane backWindwoCon;


    public void loginButtonAction() throws IOException {
        User user=new User(txtUserName.getText(),txtPassword.getText());
        String userName=txtUserName.getText();
        String password=txtPassword.getText();
        try {
            if (userName.contains("user") && password.contains("123")){
                txtUserName.setText("");
                txtPassword.setText("");
                new Alert(Alert.AlertType.INFORMATION,"Your login").show();
            }else {
                new Alert(Alert.AlertType.WARNING,"Try Again!").show();
            }

        }catch (NullPointerException e){

        }
        Stage stage=(Stage) backWindwoCon.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/SelectLogin.fxml"))));

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void BackWindowButtonAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) backWindwoCon.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/UserLogin.fxml"))));

        /*Parent root= FXMLLoader.load(getClass().getResource("../View/UserLogin.fxml"));

        Scene scene=new Scene(root);
        Stage primaryStage=new Stage();
        primaryStage.setScene(scene);
        primaryStage.initModality(Modality.WINDOW_MODAL);
        primaryStage.show();*/


    }
}
