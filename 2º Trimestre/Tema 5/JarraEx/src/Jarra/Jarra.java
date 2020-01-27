/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jarra;

/**
 *
 * @author ese_b
 */
public class Jarra {

    private int capacidad,
            cantidad;

    public Jarra() {
        this.capacidad = 0;
        this.cantidad = 0;
    }

    public Jarra(int capacidad, int cantidad) {
        this.capacidad = capacidad;
        this.cantidad = cantidad;
    }

    public Jarra(Jarra j) {
        this.capacidad = j.capacidad;
        this.cantidad = j.cantidad;
    }

    public void llena() {

        if (cantidad <= capacidad) {

            cantidad += capacidad - cantidad;

            System.out.println("Jarra llena!!!");

        } else {
            System.out.println("Esta llena, no se puede llenar.");
        }

    }

    public void vacia() {
        if (cantidad > 0) {

            cantidad -= cantidad;

            System.out.println("Jarra vacia!!!");

        } else {
            System.out.println("Esta vacia, no se puede vaciar.");
        }

    }

    public void llenaDesde(Jarra j) {

        if (j.cantidad >= 0 || cantidad < capacidad) {

            cantidad += (capacidad - cantidad) - j.cantidad;
            j.cantidad-= (capacidad - cantidad) - j.cantidad;
            System.out.println("Capacidad jarra a"+j.cantidad+" capacidad b"+cantidad);
            System.out.println("Se ha llenado la jarra desde otra jarra");
        } else {
            System.out.println("no se puede llenar");
        }

    }

    @Override
    public String toString() {
        return "Jarra{" + "capacidad=" + capacidad + ", cantidad=" + cantidad + '}';
    }

}
