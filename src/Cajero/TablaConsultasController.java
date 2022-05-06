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
    private TableColumn tbTotal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        ObservableList<Movimientos> m1;
 

        m1 = FXCollections.observableArrayList();       


        tbFecha.setCellValueFactory(new PropertyValueFactory("fecha"));
        tbCantidad.setCellValueFactory(new PropertyValueFactory("cantidad"));
        tbOperacion.setCellValueFactory(new PropertyValueFactory("operacion"));
        tbTotal.setCellValueFactory(new PropertyValueFactory("total"));

        m1.add(new Movimientos("01/01/22", "130", "INGRESO", 1650));
        m1.add(new Movimientos("02/01/22", "100", "GASTO", 1550));
        m1.add(new Movimientos("03/01/22", "50", "INGRESO", 1700));
        m1.add(new Movimientos("04/01/22", "20", "INGRESO", 1720));
        
        tablaMovimientos.setItems(m1);

    }

}
