package Cajero;


import Cajero.Main;
import Cajero.PanelOperacionController;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author i_rom
 */
public class Operaciones {
    static public String operacionFecha;
    static public String operacionCantidad;
    static public String operacionOperacion;
    static public int  operacionTotal;

    public Operaciones() {
    }

    public static String getOperacionFecha() {
        return operacionFecha;
    }

    public static void setOperacionFecha(String operacionFecha) {
        Operaciones.operacionFecha = operacionFecha;
    }

    public static String getOperacionCantidad() {
        return operacionCantidad;
    }

    public static void setOperacionCantidad(String operacionCantidad) {
        Operaciones.operacionCantidad = operacionCantidad;
    }

    public static String getOperacionOperacion() {
        return operacionOperacion;
    }

    public static void setOperacionOperacion(String operacionOperacion) {
        Operaciones.operacionOperacion = operacionOperacion;
    }

    public static int getOperacionTotal() {
        return operacionTotal;
    }

    public static void setOperacionTotal(int operacionTotal) {
        Operaciones.operacionTotal = operacionTotal;
    }
    
    public static void suma(){
        
        operacionTotal = Main.totaltotal + PanelOperacionController.cantidaDeLaOperacion;
        
    }
    
    public static void resta(){
        
        operacionTotal = Main.totaltotal + PanelOperacionController.cantidaDeLaOperacion;
        
    }
    
}
