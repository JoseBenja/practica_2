/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author joseb
 */
public class ActionDeviceController implements Initializable {

    @FXML
    private MenuButton menubtnDispositivos;
    @FXML
    private MenuItem itemGestionarDipositivos;
    @FXML
    private MenuButton menuBtnAction;
    @FXML
    private MenuButton menuBtnReport;
    @FXML
    private MenuButton menuBtnUser;
    @FXML
    private TableColumn<?, ?> colIdentify;
    @FXML
    private TableColumn<?, ?> colType;
    @FXML
    private TableColumn<?, ?> colName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickManageDevice(ActionEvent event) {
    }
    
}
