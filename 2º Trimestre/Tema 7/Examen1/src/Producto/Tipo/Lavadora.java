/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.Tipo;

import Producto.Producto;

/**
 *
 * @author ese_b
 */
public class Lavadora extends Producto {

    private int carga;
    private boolean secadora;

    public Lavadora() {
    }

    public Lavadora(int carga, boolean secadora) {
        super();
        this.carga = 0;
        this.secadora = false;
        super.clase_producto = "Lavadora";
    }

    public Lavadora(int carga, boolean secadora, double precio, String proveedor) {
        super(precio, proveedor, "Lavadora");
        this.carga = carga;
        this.secadora = secadora;
    }

    //getter y setter
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isSecadora() {
        return secadora;
    }

    public void setSecadora(boolean secadora) {
        this.secadora = secadora;
    }

}
