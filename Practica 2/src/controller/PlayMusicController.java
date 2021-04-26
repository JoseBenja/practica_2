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
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author joseb
 */
public class PlayMusicController implements Initializable {

    @FXML
    private TextField txtNameSong;
    @FXML
    private RadioButton chooseBtnHeadPhone;
    @FXML
    private RadioButton chooseBtnSpeaker;
    @FXML
    private Button btnPlay;
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
    private void clickHeadPhone(ActionEvent event) {
    }

    @FXML
    private void clickSpeaker(ActionEvent event) {
    }

    @FXML
    private void clickPlay(ActionEvent event) {
    }

    @FXML
    private void clickCancel(ActionEvent event) {
    }
    
}
