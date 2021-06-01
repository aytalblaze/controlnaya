package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;


public class Controller {
    @FXML
    private Label labelForStatus;
    @FXML
    private Label labelOne;
    @FXML
    private Label labelTwo;
    @FXML
    private TextField TFforLogin;
    @FXML
    private TextField TFforPassword;
    @FXML
    private Button buttonForLogin;

    String user = "aytal";
    String pw = "password1337";
    String checkUser, checkPw;

    @FXML
    private void clickButtonForLogin(ActionEvent eventOne){
            checkUser = TFforLogin.getText().toString();
            checkPw = TFforPassword.getText().toString();
            if(checkUser.equals(user) && checkPw.equals(pw)){
                labelForStatus.setText("Hello Admin!");
            }
            else{
                labelForStatus.setText("Ошибка авторизации!");
            }
            TFforLogin.setText("");
            TFforPassword.setText("");
        }
    };



