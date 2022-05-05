package Cajero;

/**
 *
 * @author i_rom
 */
public class ComprobarCredenciales {


    public ComprobarCredenciales() {
    }

    static public void comprobacionPin() {

        if (CredencialesController.idSalida.equals("12345678")) {
            if (CredencialesController.pinSalida.equals("0000")) {
                Main.comprobar = true;
                System.out.println("PIN correcto");
            }
        }
        
        
    }
    
}
