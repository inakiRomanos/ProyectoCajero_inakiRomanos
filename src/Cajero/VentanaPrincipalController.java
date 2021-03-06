package Cajero;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author i_rom
 */
public class VentanaPrincipalController implements Initializable {

    static public int operacion = 0;
    static public String operacionBoton = "neutro";

    @FXML
    private Button botonRetirar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void pulsarRetirar(ActionEvent event) throws IOException {
        operacion = 1;
        if (Main.comprobar == false) {
            operacionBoton = "retirar";
            FXMLLoader fmxlLoader = new FXMLLoader(getClass().getResource("Credenciales.fxml"));
            Parent root = (Parent) fmxlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        }
        
        else if (Main.comprobar == true) {
            
            operacionBoton = "retirar";
            FXMLLoader fmxlLoader = new FXMLLoader(getClass().getResource("PanelOperacion.fxml"));
            Parent root = (Parent) fmxlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();         
        }

    }

    @FXML
    private void pulsarIngresar(ActionEvent event) throws IOException {
        operacion = 2;
        if (Main.comprobar == false) {
            operacionBoton = "ingresar";
            FXMLLoader fmxlLoader = new FXMLLoader(getClass().getResource("Credenciales.fxml"));
            Parent root = (Parent) fmxlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        }
        
        else if (Main.comprobar == true) {
            
            operacionBoton = "retirar";
            FXMLLoader fmxlLoader = new FXMLLoader(getClass().getResource("PanelOperacion.fxml"));
            Parent root = (Parent) fmxlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();         
        }
    }

    @FXML
    private void pulsarConsulta(ActionEvent event) throws IOException {
        operacion = 3;
if (Main.comprobar == false) {
            FXMLLoader fmxlLoader = new FXMLLoader(getClass().getResource("Credenciales.fxml"));
            Parent root = (Parent) fmxlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        }
        
        else if (Main.comprobar == true) {
            
            FXMLLoader fmxlLoader = new FXMLLoader(getClass().getResource("TablaConsultas.fxml"));
            Parent root = (Parent) fmxlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();         
        }
    }

    @FXML
    private void pulsarPin(ActionEvent event) throws IOException {
        operacion = 4;
        FXMLLoader fmxlLoader = new FXMLLoader(getClass().getResource("NuevoPin.fxml"));
        Parent root = (Parent) fmxlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
