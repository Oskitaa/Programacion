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
 * CLASE QUE CONTIENE UNA LISTA CON LOS ARTICULOS EN VENTA EN UNA TIENDA
 *
 */
public class Tienda {

    /**
     * Constructor al que se le pasa el nombre de la tienda y que deja la lista
     * vacía
     */
    public Tienda(String nombre) {
    }

    /**
     * Añade un artículo a la lista
     */
    public void inserta(Articulo a) {
    }

    /**
     * Busca y devuelve el artículo cuyo nombre se indica. Lanza
     * NoExisteException si no se encuentra.
     */
    public Articulo busca(String nombre) throws NoExisteException {
        return new Articulo();
    }

    /**
     * Vende un número de unidades del artículo del nombre indicado. Para ello
     * busca el articulo en la lista y usa su método vende. Si no encuentra el
     * artículo lanza NoExisteException. Si la cantidad queda a cero o no hay
     * cantidades suficientes, o si se ha lanzado NoDisponibleException, elimina
     * el artículo de la lista. Devuelve el valor total de las unidades
     * vendidas.
     */
    public double vende(String nombre, int num) throws NoExisteException {
        return 0;
    }
    /**
     * Muestra por pantalla aquellos articulos de la lista de los que queden
     * menos del minimo de unidades que se indica. Se escribe uno por línea, y
     * cada uno con sus tres datos. / public void escribePedido(int min)
     */ 
     }
