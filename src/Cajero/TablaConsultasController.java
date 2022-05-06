/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Cajero;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author i_rom
 */
public class TablaConsultasController implements Initializable {

    @FXML
    private TableView<Movimientos> tablaMovimientos;
    @FXML
    private TableColumn tbFecha;
    @FXML
    private TableColumn tbCantidad;
    @FXML
    private TableColumn tbOperacion;
    @FXML
    private TableColumn tbTotal;
    
    private ObservableList<Movimientos> movimiento;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.tbFecha.setCellFactory(new PropertyValueFactory("fecha"));
        this.tbCantidad.setCellFactory(new PropertyValueFactory("Cantidad"));
        this.tbOperacion.setCellFactory(new PropertyValueFactory("operacion"));
        this.tbTotal.setCellFactory(new PropertyValueFactory("total"));
    }    
    
}
