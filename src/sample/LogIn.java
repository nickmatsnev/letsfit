package sample;

import java.sql.*;  // Using 'Connection', 'Statement' and 'ResultSet' classes in java.sql package
import java.io.Console;
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
        loginBtn.setOnAction(event -> {
            try{
                Connection con= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC","matsnnik","Torvald01");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from player");
                while(rs.next())
                {
                    if(rs.getString("username").equals(inputUser.getText())
                            && rs.getString("password").equals(inputPassword.getText())) {
                        inputUser.setText("successful check");
                    }
                }
                con.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        });
        assert inputUser != null : "fx:id=\"inputUser\" was not injected: check your FXML file 'loginPage.fxml'.";
        assert inputPassword != null : "fx:id=\"inputPassword\" was not injected: check your FXML file 'loginPage.fxml'.";
        assert loginBtn != null : "fx:id=\"loginBtn\" was not injected: check your FXML file 'loginPage.fxml'.";

    }
}
