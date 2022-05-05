/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Cajero;

import static Cajero.ComprobarCredenciales.comprobar;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

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
    
    static public String pinSalida;
    static public String idSalida;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pulsarAceptarCredenciales(ActionEvent event) throws IOException {
        pinSalida = pinIn.getText();
        idSalida = idIn.getText();
        ComprobarCredenciales.comprobacion();
        
        switch (VentanaPrincipalController.operacion) {
            case 1:
                if (ComprobarCredenciales.comprobar == true) {
                    FXMLLoader fmxlLoader = new FXMLLoader(getClass().getResource("Operacion.fxml"));
                    Parent root = (Parent) fmxlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.show();
                }
                else{JOptionPane.showMessageDialog(null, "El Usuario o el Pin introducidos son incorrectos");}
                
                case 2:
                if (ComprobarCredenciales.comprobar == true) {
                    FXMLLoader fmxlLoader = new FXMLLoader(getClass().getResource("Operacion.fxml"));
                    Parent root = (Parent) fmxlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.show();
                }
                else{JOptionPane.showMessageDialog(null, "El Usuario o el Pin introducidos son incorrectos");}
                
                case 3:
                if (ComprobarCredenciales.comprobar == true) {
                    FXMLLoader fmxlLoader = new FXMLLoader(getClass().getResource("NuevoPin.fxml"));
                    Parent root = (Parent) fmxlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.show();
                }
                else{JOptionPane.showMessageDialog(null, "El Usuario o el Pin introducidos son incorrectos");}
                
                case 4:
                if (ComprobarCredenciales.comprobar == true) {
                    FXMLLoader fmxlLoader = new FXMLLoader(getClass().getResource("TablaConsultas.fxml"));
                    Parent root = (Parent) fmxlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.show();
                }
                else{JOptionPane.showMessageDialog(null, "El Usuario o el Pin introducidos son incorrectos");}
        }
    }

    @FXML
    private void pulsarCancelarCredenciales(ActionEvent event) {
    }

    @FXML
    private void pulsarUno(ActionEvent event) {
        
        if (idIn.isFocused()){
            nuevoId = nuevoId+"1";
            idIn.setText(nuevoId);
        }
        else if(pinIn.isFocused()){
            nuevoPin = nuevoPin+"1";
            pinIn.setText(nuevoPin);
        }
    }

    @FXML
    private void pulsarDos(ActionEvent event) {
         if (idIn.isFocused()){
            nuevoId = nuevoId+"2";
            idIn.setText(nuevoId);
        }
        else if(pinIn.isFocused()){
            nuevoPin = nuevoPin+"2";
            pinIn.setText(nuevoPin);
        }
    }

    @FXML
    private void pulsarTres(ActionEvent event) {
        if (idIn.isFocused()){
            nuevoId = nuevoId+"3";
            idIn.setText(nuevoId);
        }
        else if(pinIn.isFocused()){
            nuevoPin = nuevoPin+"3";
            pinIn.setText(nuevoPin);
        }
    }

    @FXML
    private void pulsarCuatro(ActionEvent event) {
        if (idIn.isFocused()){
            nuevoId = nuevoId+"4";
            idIn.setText(nuevoId);
        }
        else if(pinIn.isFocused()){
            nuevoPin = nuevoPin+"4";
            pinIn.setText(nuevoPin);
        }
    }

    @FXML
    private void pulsarCinco(ActionEvent event) {
         if (idIn.isFocused()){
            nuevoId = nuevoId+"5";
            idIn.setText(nuevoId);
        }
        else if(pinIn.isFocused()){
            nuevoPin = nuevoPin+"5";
            pinIn.setText(nuevoPin);
        }
    }

    @FXML
    private void pulsarSeis(ActionEvent event) {
        if (idIn.isFocused()){
            nuevoId = nuevoId+"6";
            idIn.setText(nuevoId);
        }
        else if(pinIn.isFocused()){
            nuevoPin = nuevoPin+"6";
            pinIn.setText(nuevoPin);
        }
    }

    @FXML
    private void PulsarSiete(ActionEvent event) {
         if (idIn.isFocused()){
            nuevoId = nuevoId+"7";
            idIn.setText(nuevoId);
        }
        else if(pinIn.isFocused()){
            nuevoPin = nuevoPin+"7";
            pinIn.setText(nuevoPin);
        }
    }

    @FXML
    private void PulsarOcho(ActionEvent event) {
         if (idIn.isFocused()){
            nuevoId = nuevoId+"8";
            idIn.setText(nuevoId);
        }
        else if(pinIn.isFocused()){
            nuevoPin = nuevoPin+"8";
            pinIn.setText(nuevoPin);
        }
    }

    @FXML
    private void PulsarNueve(ActionEvent event) {
         if (idIn.isFocused()){
            nuevoId = nuevoId+"9";
            idIn.setText(nuevoId);
        }
        else if(pinIn.isFocused()){
            nuevoPin = nuevoPin+"9";
            pinIn.setText(nuevoPin);
        }
    }

    @FXML
    private void PulsarCero(ActionEvent event) {
        if (idIn.isFocused()){
            nuevoId = nuevoId+"0";
            idIn.setText(nuevoId);
        }
        else if(pinIn.isFocused()){
            nuevoPin = nuevoPin+"0";
            pinIn.setText(nuevoPin);
        }
    }
    
}
