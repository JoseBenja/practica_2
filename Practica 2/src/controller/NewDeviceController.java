/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import model.Computer;
import model.Interaction;
import model.SmartPhone;
import model.Headphone;

/**
 * FXML Controller class
 *
 * @author joseb
 */
public class NewDeviceController implements Initializable {

    @FXML
    private ChoiceBox<String> menuBtnNewDevice;
    @FXML
    private CheckBox checkBtnVisible;
    @FXML
    private CheckBox checkBtnStatus;
    @FXML
    private Button btnSaveDevice;
    @FXML
    private Button btnCancelDevice;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtNameDevice;
    @FXML
    private TextField txtPhoneNumber;

    private ObservableList<Computer> computer;
    private ObservableList list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LocalData();

    }

    public void LocalData() {
        String device1 = "Computadora Portatil";
        String device2 = "Tablet";
        String device3 = "SmartWatch";
        String device4 = "SmartPhone";
        String device5 = "Auriculares Inalambricos";

        this.list.addAll(device1, device2, device3, device4, device5);

        this.menuBtnNewDevice.getItems().addAll(list);
    }

    @FXML
    private void clickVisible(ActionEvent event) {
    }

    @FXML
    private void clickStatus(ActionEvent event) {
    }

    @FXML
    private void clickSave(ActionEvent event) {
        if (!this.menuBtnNewDevice.getValue().equals("SmartPhone") && !this.menuBtnNewDevice.getValue().equals("Auriculares Inalambricos") && this.menuBtnNewDevice.getValue() != null) {
            Interaction interaction = new Interaction(0, this.menuBtnNewDevice.getValue(), this.txtEmail.getText(), this.txtNameDevice.getText(), this.checkBtnVisible.isSelected(), this.checkBtnStatus.isSelected());
            interaction.NewDevice();
        } else if (this.menuBtnNewDevice.getValue().equals("SmartPhone")) {
            SmartPhone smartPhone = new SmartPhone(0, this.menuBtnNewDevice.getValue(), this.txtEmail.getText(), this.txtNameDevice.getText(), this.checkBtnVisible.isSelected(), this.txtPhoneNumber.getText(), this.checkBtnStatus.isSelected());
            smartPhone.NewSmartphone();
        } /*lse if (this.menuBtnNewDevice.getValue().equals("Auriculares Inalambricos")) {
            Headphone headPhone = new Headphone();
        }
        System.out.println("No se pudo crear el dispositivo");*/
    }

    @FXML
    private void clickCancel(ActionEvent event) {
    }
}
