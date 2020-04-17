/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;
import Excepcion.*;
/**
 *
 * @author ese_b
 */
/**
 * CLASE QUE REPRESESENTA UN ARTÍCULO QUE SE VENDE EN UNA TIENDA
 *
 */
public class Articulo {

    /**
     * Constructor al que se le pasan los datos del artículo
     */
    public Articulo(String nombre, int cantidad, double precioUnidad) {
    }

    public Articulo(){
        
    }
    /**
     * Devuelve el nombre del artículo
     */
    public String nombre() {
        return "";
    }

    /**
     * Devuelve el número de unidades disponibles
     */
    public int cantidad() {
        return 0;
    }

    /**
     * Devuelve el precio de una unidad
     */
    public double precioUnidad() {
        return 0;
    }

    /**
     * Vende un número de artículos (restándolos de la cantidad disponible), si
     * los hay. En caso contrario, no modifica la cantidad y lanza
     * NoDisponibleException
     */
    public void vende(int num) throws NoDisponibleException {
    }
}
