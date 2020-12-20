package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LogIn {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField inputUser;

    @FXML
    private TextField inputPassword;

    @FXML
    private Button loginBtn;

    @FXML
    void initialize() {
        assert inputUser != null : "fx:id=\"inputUser\" was not injected: check your FXML file 'loginPage.fxml'.";
        assert inputPassword != null : "fx:id=\"inputPassword\" was not injected: check your FXML file 'loginPage.fxml'.";
        assert loginBtn != null : "fx:id=\"loginBtn\" was not injected: check your FXML file 'loginPage.fxml'.";

    }
}
