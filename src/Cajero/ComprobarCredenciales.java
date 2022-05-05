package Cajero;

import javax.swing.JOptionPane;

/**
 *
 * @author i_rom
 */
public class ComprobarCredenciales {

    static public String pin = "0000";

    public ComprobarCredenciales() {
    }

    static public void comprobacionPin() {

        if (CredencialesController.idSalida.equals("12345678")) {
            if (CredencialesController.pinSalida.equals(pin)) {
                Main.comprobar = true;
                System.out.println("PIN correcto");
            }
        }
    }
    
    static public void cambiarPin(){
        
        if (NuevoPinController.user.equals("12345678")) {
            if (NuevoPinController.oldPin.equals(pin)) {
                if (NuevoPinController.newPin.equals(NuevoPinController.rewPin)) {
                    pin = NuevoPinController.newPin;
                    System.out.println(pin);
                    JOptionPane.showMessageDialog(null, "Su PIN ha sido actualizado");
                }
            }
        }
        else{JOptionPane.showMessageDialog(null, "Alguno de los datos introducidos es incorrecto");}
    }
    
}
