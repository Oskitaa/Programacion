/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aparato;

import Utils.Utils;

/**
 *
 * @author ese_b
 */
public abstract class Aparato {

    //Atributos
    protected double precio;
    protected int voltaje;

    //Constructores
    public Aparato() {
        this.precio = 0;
        this.voltaje = 0;
    }

    public Aparato(double precio, int voltaje) {
        this.precio = precio;
        this.voltaje = voltaje;
    }

    //Getters y setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    //Metodos
    public void setBoth(double precio, int voltaje) {
        this.precio = precio;
        this.voltaje = voltaje;
    }

    public void capturar() {

        Utils uts = new Utils();

        do {
            System.out.println("Introduce el precio del aparato: ");
            setPrecio(uts.getDouble());
        } while (getPrecio() < 0);

        System.out.println("Introduce el voltaje: ");
        setVoltaje(uts.getInt());

    }

    public void imprimir() {

        System.out.println("El aparato, tiene un precio de " + getPrecio() + ", un voltaje de " + getVoltaje() + ".");

    }

    public double cacularDescuento(double descuento) {
        return (descuento / 100) * getPrecio();
    }

}
