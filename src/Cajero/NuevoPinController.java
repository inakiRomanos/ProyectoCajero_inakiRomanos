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
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author i_rom
 */
public class NuevoPinController implements Initializable {

    @FXML
    private TextField usuarioIn;
    @FXML
    private TextField pinNuevo;
    @FXML
    private Button numeroUno;
    @FXML
    private Button numeroDos;
    @FXML
    private Button numeroTres;
    @FXML
    private Button numeroCuatro;
    @FXML
    private Button numeroCinco;
    @FXML
    private Button nuemroSeis;
    @FXML
    private Button nuemroSiete;
    @FXML
    private Button numeroOcho;
    @FXML
    private Button numeroNueve;
    @FXML
    private Button numeroCero;
    @FXML
    private TextField pinAntiguo;
    @FXML
    private TextField repetirPin;
    @FXML
    private Button aceptar;
    @FXML
    private Button cancelar;

    String viejoPin = "";
    String nuevoPin = "";
    String rePin = "";
    String id = "";

    static public String user;
    static public String oldPin;
    static public String newPin;
    static public String rewPin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void preUno(ActionEvent event) {
        if (usuarioIn.isFocused()) {
            id = id + "1";
            usuarioIn.setText(id);
        } else if (pinNuevo.isFocused()) {
            nuevoPin = nuevoPin + "1";
            pinNuevo.setText(nuevoPin);
        } else if (pinAntiguo.isFocused()) {
            viejoPin = viejoPin + "1";
            pinAntiguo.setText(viejoPin);
        } else if (repetirPin.isFocused()) {
            rePin = rePin + "1";
            repetirPin.setText(rePin);
        }
    }

    @FXML
    private void preDos(ActionEvent event) {
        if (usuarioIn.isFocused()) {
            id = id + "2";
            usuarioIn.setText(id);
        } else if (pinNuevo.isFocused()) {
            nuevoPin = nuevoPin + "2";
            pinNuevo.setText(nuevoPin);
        } else if (pinAntiguo.isFocused()) {
            viejoPin = viejoPin + "2";
            pinAntiguo.setText(viejoPin);
        } else if (repetirPin.isFocused()) {
            rePin = rePin + "2";
            repetirPin.setText(rePin);
        }
    }

    @FXML
    private void preTres(ActionEvent event) {
        if (usuarioIn.isFocused()) {
            id = id + "3";
            usuarioIn.setText(id);
        } else if (pinNuevo.isFocused()) {
            nuevoPin = nuevoPin + "3";
            pinNuevo.setText(nuevoPin);
        } else if (pinAntiguo.isFocused()) {
            viejoPin = viejoPin + "3";
            pinAntiguo.setText(viejoPin);
        } else if (repetirPin.isFocused()) {
            rePin = rePin + "3";
            repetirPin.setText(rePin);
        }
    }

    @FXML
    private void preCuatro(ActionEvent event) {
        if (usuarioIn.isFocused()) {
            id = id + "4";
            usuarioIn.setText(id);
        } else if (pinNuevo.isFocused()) {
            nuevoPin = nuevoPin + "4";
            pinNuevo.setText(nuevoPin);
        } else if (pinAntiguo.isFocused()) {
            viejoPin = viejoPin + "4";
            pinAntiguo.setText(viejoPin);
        } else if (repetirPin.isFocused()) {
            rePin = rePin + "4";
            repetirPin.setText(rePin);
        }
    }

    @FXML
    private void preCienco(ActionEvent event) {
        if (usuarioIn.isFocused()) {
            id = id + "5";
            usuarioIn.setText(id);
        } else if (pinNuevo.isFocused()) {
            nuevoPin = nuevoPin + "5";
            pinNuevo.setText(nuevoPin);
        } else if (pinAntiguo.isFocused()) {
            viejoPin = viejoPin + "5";
            pinAntiguo.setText(viejoPin);
        } else if (repetirPin.isFocused()) {
            rePin = rePin + "5";
            repetirPin.setText(rePin);
        }
    }

    @FXML
    private void preSeis(ActionEvent event) {
        if (usuarioIn.isFocused()) {
            id = id + "6";
            usuarioIn.setText(id);
        } else if (pinNuevo.isFocused()) {
            nuevoPin = nuevoPin + "6";
            pinNuevo.setText(nuevoPin);
        } else if (pinAntiguo.isFocused()) {
            viejoPin = viejoPin + "6";
            pinAntiguo.setText(viejoPin);
        } else if (repetirPin.isFocused()) {
            rePin = rePin + "6";
            repetirPin.setText(rePin);
        }
    }

    @FXML
    private void preSiete(ActionEvent event) {
        if (usuarioIn.isFocused()) {
            id = id + "7";
            usuarioIn.setText(id);
        } else if (pinNuevo.isFocused()) {
            nuevoPin = nuevoPin + "7";
            pinNuevo.setText(nuevoPin);
        } else if (pinAntiguo.isFocused()) {
            viejoPin = viejoPin + "7";
            pinAntiguo.setText(viejoPin);
        } else if (repetirPin.isFocused()) {
            rePin = rePin + "7";
            repetirPin.setText(rePin);
        }
    }

    @FXML
    private void preOcho(ActionEvent event) {
        if (usuarioIn.isFocused()) {
            id = id + "8";
            usuarioIn.setText(id);
        } else if (pinNuevo.isFocused()) {
            nuevoPin = nuevoPin + "8";
            pinNuevo.setText(nuevoPin);
        } else if (pinAntiguo.isFocused()) {
            viejoPin = viejoPin + "8";
            pinAntiguo.setText(viejoPin);
        } else if (repetirPin.isFocused()) {
            rePin = rePin + "8";
            repetirPin.setText(rePin);
        }
    }

    @FXML
    private void preNueve(ActionEvent event) {
        if (usuarioIn.isFocused()) {
            id = id + "9";
            usuarioIn.setText(id);
        } else if (pinNuevo.isFocused()) {
            nuevoPin = nuevoPin + "9";
            pinNuevo.setText(nuevoPin);
        } else if (pinAntiguo.isFocused()) {
            viejoPin = viejoPin + "9";
            pinAntiguo.setText(viejoPin);
        } else if (repetirPin.isFocused()) {
            rePin = rePin + "9";
            repetirPin.setText(rePin);
        }
    }

    @FXML
    private void preCero(ActionEvent event) {
        if (usuarioIn.isFocused()) {
            id = id + "0";
            usuarioIn.setText(id);
        } else if (pinNuevo.isFocused()) {
            nuevoPin = nuevoPin + "0";
            pinNuevo.setText(nuevoPin);
        } else if (pinAntiguo.isFocused()) {
            viejoPin = viejoPin + "0";
            pinAntiguo.setText(viejoPin);
        } else if (repetirPin.isFocused()) {
            rePin = rePin + "0";
            repetirPin.setText(rePin);
        }
    }

    @FXML
    private void preAceptar(ActionEvent event) {
        user = usuarioIn.getText();
        newPin = pinNuevo.getText();
        oldPin = pinAntiguo.getText();
        rewPin = repetirPin.getText();

        ComprobarCredenciales.cambiarPin();

        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void preCancelar(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

}
