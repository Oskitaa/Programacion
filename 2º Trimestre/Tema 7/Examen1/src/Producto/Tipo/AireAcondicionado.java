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
public class AireAcondicionado extends Producto {

    private int potencia;

    public AireAcondicionado() {
        super();
        this.potencia = 0;
        super.clase_producto = "Aire Acondicionado";
    }

    public AireAcondicionado(int potencia, double precio, String proveedor) {
        super(precio, proveedor,"Aire Acondicionado");
        this.potencia = potencia;
    }

    //getter y setter
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
