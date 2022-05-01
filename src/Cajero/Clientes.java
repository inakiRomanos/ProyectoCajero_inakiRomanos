
package Cajero;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author i_rom
 */

   
@Entity //Anotación que indica que esta es una clase que debe almacenarse en la base de datos
public class Clientes {

    @Id //Anotación que indica que este atributo es la clave primaria 
    private int id;
    private int pin;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private Operaciones operacion;
    //Contructores
    public Clientes(int id, int pin) {
        this.id = id;
        this.operacion = null;
        this.pin = pin;
    }

    //métodos básicos para asignar y obtener valores de atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Operaciones getOperacion() {
        return operacion;
    }

    public void setOperacion(Operaciones operacion) {
        this.operacion = operacion;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    //comportamiento del método toString heredado de la superclase Objet
    //Devuelve los atributos de un objeto Ponente
    public String toString() {
        return this.id + " " + this.pin + " " + this.operacion;
    }
}
    

