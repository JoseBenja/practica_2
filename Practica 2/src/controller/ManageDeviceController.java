/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Interaction;

/**
 * FXML Controller class
 *
 * @author joseb
 */
public class ManageDeviceController implements Initializable {

    @FXML
    private MenuButton menubtnDispositivos;
    @FXML
    private MenuItem itemGestionarDipositivos;
    @FXML
    private Button btnDeleteDevice;
    @FXML
    private Button btnNewDevice;
    @FXML
    private TableColumn colIdentify;
    @FXML
    private TableColumn colType;
    @FXML
    private TableColumn colName;
    @FXML
    private TableColumn colEmail;
    @FXML
    private TableColumn colStatus;
    @FXML
    private TableView<Interaction> tblListDevice;

    @FXML
    private TableColumn colVisible;

    static ObservableList<Interaction> listInteraction = FXCollections.observableArrayList();;
    
    @FXML
    private Button btnModify;
    
    static TableView<Interaction> tblList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Interaction interaction;

        ArrayList<String> list = new ArrayList<>();

        interaction = new Interaction(0, null, null, null, false, false);
        list = interaction.SearchForTable();

        int id = 1;
        for (int i = 1; i < list.size(); i++) {
            String copy = list.get(i);
            String[] tmp = copy.split(",");

            this.colIdentify.setCellValueFactory(new PropertyValueFactory("idDevice"));
            this.colType.setCellValueFactory(new PropertyValueFactory("typeDevice"));
            this.colEmail.setCellValueFactory(new PropertyValueFactory("mail"));
            this.colName.setCellValueFactory(new PropertyValueFactory("nameDevice"));
            this.colVisible.setCellValueFactory(new PropertyValueFactory("visible"));
            this.colStatus.setCellValueFactory(new PropertyValueFactory("status"));

            interaction = new Interaction(id, tmp[0], tmp[3], tmp[4], Boolean.parseBoolean(tmp[5]), Boolean.parseBoolean(tmp[6]));

            listInteraction.add(interaction);
            this.tblListDevice.setItems(listInteraction);
            id++;
        }
    }

    @FXML
    private void clickManageDevice(ActionEvent event) {
    }

    @FXML
    private void clickNewDevice(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/NewDeviceView.fxml"));

            Parent root = loader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();

        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void clickDeleteDevice(ActionEvent event) {
        tblList.setItems(listInteraction);
        
        
        //tblListDevice.getItems().removeAll(tblListDevice.getSelectionModel().getSelectedItem());
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/DeleteDeviceView.fxml"));

            Parent root = loader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();

        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void clickModify(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ModifyDeviceView.fxml"));

            Parent root = loader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();

        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
