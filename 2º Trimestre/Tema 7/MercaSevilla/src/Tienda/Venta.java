/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import Enum.enumPuesto;

/**
 *
 * @author ese_b
 */
public class Venta {

    private enumPuesto puestos;
    private Cliente clientes;

    public Venta() {
        this.puestos = enumPuesto.A;
        this.clientes = new Cliente();

    }

    public Venta(enumPuesto puestos, Cliente clientes) {
        this.puestos = puestos;
        this.clientes = clientes;
    }

    public enumPuesto getPuestos() {
        return puestos;
    }

    public void setPuestos(enumPuesto puestos) {
        this.puestos = puestos;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Venta realizada en el puesto: " + puestos + "\nCliente:" + clientes;
    }

}
