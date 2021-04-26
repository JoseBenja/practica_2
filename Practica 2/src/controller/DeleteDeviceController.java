/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.ManageDeviceController.tblList;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import model.Device;
import model.Interaction;

/**
 * FXML Controller class
 *
 * @author joseb
 */
public class DeleteDeviceController implements Initializable {

    @FXML
    private Button btnDelete;
    @FXML
    private Button btnCancel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickDelete(ActionEvent event) {
        int id = tblList.getSelectionModel().getSelectedItem().getIdDevice();
        String type = tblList.getSelectionModel().getSelectedItem().getTypeDevice();
        String mail = tblList.getSelectionModel().getSelectedItem().getMail();
        String name = tblList.getSelectionModel().getSelectedItem().getNameDevice();
        boolean visible = tblList.getSelectionModel().getSelectedItem().isVisible();
        boolean status = tblList.getSelectionModel().getSelectedItem().isStatus();

        Interaction interaction = new Interaction(id, type, mail, name, visible, status);
        interaction.DeleteDevice();
    }

    @FXML
    private void clickCancel(ActionEvent event) {
    }
    
}
