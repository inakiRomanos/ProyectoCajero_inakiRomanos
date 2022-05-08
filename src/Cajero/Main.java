
package Cajero;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author i_rom
 */
public class Main extends Application {

    static public boolean comprobar = false;
    static public int totaltotal = 1720;
    static public ObservableList<Movimientos> l;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        l = FXCollections.observableArrayList();
        
        l.add(new Movimientos("01/01/22", "130", "INGRESO", 1650));
        l.add(new Movimientos("02/01/22", "100", "GASTO", 1550));
        l.add(new Movimientos("03/01/22", "50", "INGRESO", 1700));
        l.add(new Movimientos("04/01/22", "20", "INGRESO", 1720));
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Banco Central");
        stage.setScene(scene);
        stage.show();
    }
    
}
