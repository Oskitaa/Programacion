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
public class iPod extends Aparato {

    //Atributos
    private int capacidad;

    //Constructores
    public iPod() {
        super();
        this.capacidad = 32;
    }

    public iPod(int capacidad, double precio, int voltaje) {
        super(precio, voltaje);
        this.capacidad = capacidad;
    }

    //Getters y setters
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    //Metodos
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Con una capacidad de " + getCapacidad() + ".");

    }

    @Override
    public void capturar() {
        super.capturar();
        do {
            System.out.println("Introduce la capacidad del iPod: ");
            setCapacidad(Utils.getInt());
        } while (getCapacidad() < 0);
    }

}
