/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author robso
 */
public class FXMLController implements Initializable {

    @FXML 
    private Label lblmensagem;
    private Button btnclick;
    
    @FXML
    private void clicoubotao(ActionEvent event) {
        lblmensagem.setText("Ola Mundo");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private static class button {

        public button() {
        }
    }
    
}
