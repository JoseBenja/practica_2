/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.Login;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;

/**
 * FXML Controller class
 *
 * @author joseb
 */
public class LoginController implements Initializable {

    @FXML
    private Button btnIngresar;
    @FXML
    private TextField txtUser;
    @FXML
    private PasswordField txtPassword;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void click(ActionEvent event) {       
        Login log = new Login(this.txtUser.getText(), this.txtPassword.getText());

        boolean validation = log.ValidationLogin();

        if (validation) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MenuView.fxml"));

                Parent root = loader.load();
                
                MenuController controller = loader.getController();                

                Scene scene = new Scene(root);
                Stage stage = new Stage();                
                stage.setScene(scene);
                stage.show();               
                
                Stage myStage = (Stage) this.btnIngresar.getScene().getWindow();
                myStage.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {            
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/LoginErrorView.fxml"));

                Parent root = loader.load();
                
                LoginErrorController controller = loader.getController();

                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();    
                
                Stage myStage = (Stage) this.btnIngresar.getScene().getWindow();
                myStage.close();
                
            } catch (IOException ex) {
                Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void eventKey(KeyEvent event) {
    }

}
