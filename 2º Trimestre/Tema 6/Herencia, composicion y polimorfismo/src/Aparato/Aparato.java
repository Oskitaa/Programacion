/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aparato;

/**
 *
 * @author ese_b
 */
public abstract class Aparato {

    protected double precio;
    protected int voltaje;

    public Aparato() {
        this.precio = 0;
        this.voltaje = 0;
    }

    public Aparato(double precio, int voltaje) {
        this.precio = precio;
        this.voltaje = voltaje;
    }

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
    
    public void capturar(){
        
    }
    
    public void imprimir(){
        
        System.out.println("El aparato, tiene un precio de "+getPrecio()+", un voltaje de "+getVoltaje()+".");
        
    }
    
    public double cacularDescuento(double descuento){
        return (descuento / 100 ) * getPrecio();        
    }

}
