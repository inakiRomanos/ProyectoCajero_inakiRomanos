/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;

import java.util.Date;

/**
 *
 * @author i_rom
 */
public class Movimientos {
    
    private String fecha;
    private String Cantidad;
    private String operacion;
    private int total;

    public Movimientos(String fecha, String Cantidad, String operacion, int total) {
        this.fecha = fecha;
        this.Cantidad = Cantidad;
        this.operacion = operacion;
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
}
