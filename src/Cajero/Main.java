
package Cajero;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author i_rom
 */
public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Banco Central");
        stage.setScene(scene);
        stage.show();
    }
    
}
