/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen;

import Utils.Utils;

/**
 *
 * @author ese_b
 */
public class Productos {
    
    protected String categoria;
    protected double precio;
    protected int codigo;
    
    public Productos() {
        this.precio = 0;
        this.codigo = 0;
    }
    
    public Productos(String categoria, double precio) {
        this.categoria = categoria;
        this.precio = precio;
        this.codigo = 0;
    }

    //metodos
    public void pedirDato() {
        do {
            System.out.println("Introduce el precio del producto: ");
            setPrecio(Utils.getDouble());
        } while (getPrecio() <= 0);
        
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "categoria=" + categoria + ", precio=" + precio + ", codigo=" + codigo + '}';
    }
    
    
    
}
