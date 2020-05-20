/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author ese_b
 */
public abstract class Producto implements Serializable{

    public static int num = 0;
    private static final long serialVersionUID = 7183125816190573817L;
    

    protected double precio;
    protected String proveedor;
    protected LocalDate fecha;
    protected String codigo,
            clase_producto;

    public Producto() {
        this.precio = 0;
        this.proveedor = "";
        this.fecha = LocalDate.now();
        this.clase_producto = "";
        this.codigo = generaCodigo();
    }

    public Producto(double precio, String proveedor, String clase_producto) {
        this.precio = precio;
        this.proveedor = proveedor;
        this.fecha = LocalDate.now();
        this.clase_producto = clase_producto;
        this.codigo = generaCodigo();
    }

    private String generaCodigo() {
        String letra = "AC";
        if (clase_producto.equalsIgnoreCase("Lavadora")) {
            letra = "L";
        }

        return ++num + "-" + letra + "-" + getFecha();
    }

    //getter y setter
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getClase_producto() {
        return clase_producto;
    }

    public void setClase_producto(String clase_producto) {
        this.clase_producto = clase_producto;
    }

}
