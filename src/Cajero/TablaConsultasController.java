/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Cajero;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
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
    public TableColumn tbTotal;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {


        tbFecha.setCellValueFactory(new PropertyValueFactory("fecha"));
        tbCantidad.setCellValueFactory(new PropertyValueFactory("cantidad"));
        tbOperacion.setCellValueFactory(new PropertyValueFactory("operacion"));
        tbTotal.setCellValueFactory(new PropertyValueFactory("total"));

        tablaMovimientos.setItems(Main.l);

    }


}
