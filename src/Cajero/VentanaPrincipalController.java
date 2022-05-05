
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
         FXMLLoader fmxlLoader = new FXMLLoader(getClass().getResource("Credenciales.fxml"));
         Parent root = (Parent) fmxlLoader.load();
         Stage stage = new Stage();
         stage.setScene(new Scene(root));
         stage.show();
    }

    @FXML
    private void pulsarIngresar(ActionEvent event) throws IOException {
        operacion = 2;
        FXMLLoader fmxlLoader = new FXMLLoader(getClass().getResource("Credenciales.fxml"));
         Parent root = (Parent) fmxlLoader.load();
         Stage stage = new Stage();
         stage.setScene(new Scene(root));
         stage.show();
    }

    @FXML
    private void pulsarConsulta(ActionEvent event) throws IOException {
        operacion = 3;
        FXMLLoader fmxlLoader = new FXMLLoader(getClass().getResource("Credenciales.fxml"));
         Parent root = (Parent) fmxlLoader.load();
         Stage stage = new Stage();
         stage.setScene(new Scene(root));
         stage.show();
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
