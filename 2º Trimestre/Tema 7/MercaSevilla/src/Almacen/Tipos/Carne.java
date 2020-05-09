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
public class Carne extends Productos {

    public static int contadorCarne = 0;
    private boolean pienso;

    public Carne() {
        super();
        this.pienso = false;
        contador();
    }

    public Carne(boolean pienso, String categoria, double precio) {
        super(categoria, precio);
        this.pienso = pienso;
    }

    private int contador() {
        return codigo = ++contadorCarne;
    }

    public boolean isPienso() {
        return pienso;
    }

    public void setPienso(boolean pienso) {
        this.pienso = pienso;
    }

}
