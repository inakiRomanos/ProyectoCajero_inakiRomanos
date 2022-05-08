/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Cajero;


import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author i_rom
 */
public class PanelOperacionController implements Initializable {

    @FXML
    private Button aceptarOperaciones;
    @FXML
    private Button cancelarOperaciones;
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
    private Button numeroSeis;
    @FXML
    private Button numeroSiete;
    @FXML
    private Button numeroOcho;
    @FXML
    private Button numeroNueve;
    @FXML
    private Button numeroCero;
    @FXML
    private Button diezE;
    @FXML
    private Button veinteE;
    @FXML
    private Button ciencuentaE;
    @FXML
    private Button cienE;
    @FXML
    private Button cientoCiencuentaE;
    @FXML
    private Button DoscientosE;
    @FXML
    private TextField cantidadIn;

    int nuevaCantidad = 0;
    String numero = "";
    static public int cantidaDeLaOperacion;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void pulsarAceptar(ActionEvent event) {
        cantidaDeLaOperacion = Integer.parseInt(cantidadIn.getText());
        if (VentanaPrincipalController.operacionBoton.equals("retirar")) {
           Operaciones.setOperacionFecha(LocalDate.now().toString());
           Operaciones.setOperacionOperacion("GASTO");
           Operaciones.setOperacionCantidad(cantidadIn.getText());
           Operaciones.resta();
        }
        else if (VentanaPrincipalController.operacionBoton.equals("ingresar")) {
           Operaciones.setOperacionFecha(LocalDate.now().toString());
           Operaciones.setOperacionOperacion("INGRESO");
           Operaciones.setOperacionCantidad(cantidadIn.getText());
           Operaciones.suma();
        }
           
        
        Main.l.add(new Movimientos(Operaciones.getOperacionFecha(), Operaciones.getOperacionCantidad(), 
                Operaciones.getOperacionOperacion(), Operaciones.getOperacionTotal()));

        
        JOptionPane.showMessageDialog(null, "Su operacion ha sido realizada");
        
         Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
        
        
    }

    @FXML
    private void pulsarCancelar(ActionEvent event) {
        
         Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void pulsarUno(ActionEvent event) {
        if (cantidadIn.isFocused()) {
            numero = numero + "1";
            cantidadIn.setText(numero);
        }
    }

    @FXML
    private void pulsarDos(ActionEvent event) {
        numero = numero + "2";
        cantidadIn.setText(numero);
    }

    @FXML
    private void pulsarTres(ActionEvent event) {
        numero = numero + "3";
        cantidadIn.setText(numero);
    }

    @FXML
    private void pulsarCuatro(ActionEvent event) {
        numero = numero + "4";
        cantidadIn.setText(numero);
    }

    @FXML
    private void pulsarCinco(ActionEvent event) {
        numero = numero + "5";
        cantidadIn.setText(numero);
    }

    @FXML
    private void pulsarSeis(ActionEvent event) {
        numero = numero + "6";
        cantidadIn.setText(numero);
    }

    @FXML
    private void PulsarSiete(ActionEvent event) {
        numero = numero + "7";
        cantidadIn.setText(numero);
    }

    @FXML
    private void PulsarOcho(ActionEvent event) {
        numero = numero + "8";
        cantidadIn.setText(numero);
    }

    @FXML
    private void PulsarNueve(ActionEvent event) {
        numero = numero + "9";
        cantidadIn.setText(numero);
    }

    @FXML
    private void PulsarCero(ActionEvent event) {
        numero = numero + "0";
        cantidadIn.setText(numero);
    }

    @FXML
    private void PulsarDiezE(ActionEvent event) {
        cantidadIn.setText("10");
    }

    @FXML
    private void PulsarVeinteE(ActionEvent event) {
        cantidadIn.setText("20");
    }

    @FXML
    private void PulsarCincuanteE(ActionEvent event) {
        cantidadIn.setText("50");
    }

    @FXML
    private void PulsarCienE(ActionEvent event) {
        cantidadIn.setText("100");
    }

    @FXML
    private void PulsarCientoCincuentaE(ActionEvent event) {
        cantidadIn.setText("150");
    }

    @FXML
    private void PulsarDoscientosE(ActionEvent event) {
        cantidadIn.setText("200");
    }

    private void Borrar(ActionEvent event) {
        cantidadIn.setText("");
    }

}
