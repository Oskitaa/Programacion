/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura;

import Aparato.iPod;

/**
 *
 * @author ese_b
 */
public class FacturaiPod extends Factura {

    //Atributos
    private iPod articulo;

    //Constructores
    public FacturaiPod() {
        super();
        this.articulo = new iPod();
    }

    public FacturaiPod(double pctDescuento, int capacidad, double precio, int voltaje) {
        super(pctDescuento);
        this.articulo = new iPod(capacidad, precio, voltaje);
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
