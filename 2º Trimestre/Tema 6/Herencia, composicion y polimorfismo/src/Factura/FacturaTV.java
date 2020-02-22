/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura;

import Aparato.TV;

/**
 *
 * @author ese_b
 */
public class FacturaTV extends Factura {

    //Atributos
    private TV articulo;

    //Constructores
    public FacturaTV() {
        super();
        this.articulo = new TV();
    }

    public FacturaTV(double pctDescuento, double tamanio, double precio, int voltaje) {
        super(pctDescuento);
        this.articulo = new TV(tamanio, precio, voltaje);
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
