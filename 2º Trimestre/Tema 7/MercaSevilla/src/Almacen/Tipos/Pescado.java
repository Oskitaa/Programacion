/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Tipos;

import Almacen.Productos;

/**
 *
 * @author ese_b
 */
public class Pescado extends Productos {

    public static int contadorPescado = 0;
    private boolean piscifactoria;

    public Pescado() {
        super();
        this.piscifactoria = false;
        contador();
    }

    public Pescado(boolean piscifactoria, String categoria, double precio) {
        super(categoria, precio);
        this.piscifactoria = piscifactoria;
    }
    
    

    private int contador() {
        return codigo = ++contadorPescado;
    }

}
