package Cajero;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author i_rom
 */

   
@Entity //Anotación que indica que esta es una clase que debe almacenarse en la base de datos
public class Operaciones {

    @Id //Anotación que indica que este atributo es la clave primaria 
    private Date fecha;
    private int cantidad;
    private String tipo;

    public Operaciones (Date fecha, int cantidad, String tipo) {
        this.fecha= fecha;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    //métodos básicos para asignar y obtener valores de atributos
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    //comportamiento del método toString heredado de la superclase Objet
    //Devuelve los atributos de un objeto Ponente
    public String toString() {
        return this.fecha + " " + this.cantidad + " " + this.tipo;
    }
}