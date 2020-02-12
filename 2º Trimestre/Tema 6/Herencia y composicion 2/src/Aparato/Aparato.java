/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aparato;

import Factura.Factura;
import Utils.Utils;

/**
 *
 * @author ese_b
 */
public abstract class Aparato extends Factura {

    protected int voltaje;
    protected double precio;

    public Aparato() {
        this.voltaje = 0;
        this.precio = 0;
    }

    public Aparato(int voltaje, double precio) {
        this.voltaje = voltaje;
        this.precio = precio;
    }

    public void Aparato(int voltaje, double precio) {
        this.voltaje = voltaje;
        this.precio = precio;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void capturarAparato() {

        Utils uts = new Utils();

    }

    public double calcularDescuento(double descuento) {
        return ((descuento / 100) + 1) * getPrecio();
    }

    @Override
    public String toString() {
        return "Aparato{" + "voltaje=" + voltaje + ", precio=" + precio + '}';
    }

}
