/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura;

import Aparato.Equipo;

/**
 *
 * @author ese_b
 */
public class FacturaEquipo extends Factura {

    //Atributos
    private Equipo articulo;

    //Constructores
    public FacturaEquipo() {
        super();
        this.articulo = new Equipo();
    }

    public FacturaEquipo(double pctDescuento, int cantidadCDs, double precio, int voltaje) {
        super(pctDescuento);
        this.articulo = new Equipo(cantidadCDs, precio, voltaje);
    }

    //Metodos
    @Override
    public void capturar() {
        articulo.capturar();
        super.capturar();

    }

    @Override
    public void imprimir() {
        super.imprimir();
        articulo.imprimir();
        System.out.println("El precio total del equipo es " + calcularTotal());
    }

    public double calcularTotal() {
        return articulo.getPrecio() - articulo.cacularDescuento(pctDescuento);
    }
}
