/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Cajero;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author i_rom
 */
public class CredencialesController implements Initializable {

    @FXML
    private TextField pinIn;
    @FXML
    private Button aceptarCredenciales;
    @FXML
    private Button cancelarCredenciales;
    @FXML
    private TextField idIn;
    @FXML
    private Button numeroUno;
    @FXML
    private Button numeroDos;
    @FXML
    private Button numeroTres;
    @FXML
    private Button numeroCuatro;
    @FXML
    private Button NumeroCinco;
    @FXML
    private Button numeroSeis;
    @FXML
    private Button numeroSiete;
    @FXML
    private Button numeroOcho;
    @FXML
    private Button numeroNueve;
    @FXML
    private Button numeroCero;
    
    String nuevoPin = "";
    String nuevoId = "";

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pulsarAceptarCredenciales(ActionEvent event) {
        int identificacion = Integer.parseInt(idIn.toString());
    }

    @FXML
    private void pulsarCancelarCredenciales(ActionEvent event) {
    }

    @FXML
    private void pulsarUno(ActionEvent event) {
        
        if (idIn.isFocused()){
            nuevoId = nuevoId + "1";
            idIn.setText(nuevoId);
        }
        else if(pinIn.isFocused()){
            nuevoPin = nuevoPin + "1";
            pinIn.setText(nuevoPin);
        }
    }

    @FXML
    private void pulsarDos(ActionEvent event) {
    }

    @FXML
    private void pulsarTres(ActionEvent event) {
    }

    @FXML
    private void pulsarCuatro(ActionEvent event) {
    }

    @FXML
    private void pulsarCinco(ActionEvent event) {
    }

    @FXML
    private void pulsarSeis(ActionEvent event) {
    }

    @FXML
    private void PulsarSiete(ActionEvent event) {
    }

    @FXML
    private void PulsarOcho(ActionEvent event) {
    }

    @FXML
    private void PulsarNueve(ActionEvent event) {
    }

    @FXML
    private void PulsarCero(ActionEvent event) {
    }
    
}
