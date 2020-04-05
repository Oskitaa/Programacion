/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomestico.Tipos;

import Electrodomestico.Electrodomestico;

/**
 *
 * @author ese_b
 */
public class Television extends Electrodomestico {
//Constante
    
    
     //Atributos
    
    private double resolucion;
    private boolean tdt;

    
    //Constructores
    
     /**
      * Constructor por defecto
      */
    public Television() {
        super();
        this.resolucion = 20;
        this.tdt = false;
    }

    /**
     * Constructor con dos parametros
     * @param precio
     * @param peso 
     */
    public Television(double precio, double peso) {
        super(precio, peso);
        this.resolucion = 20;
        this.tdt = false;
    }

    /**
     * Constructor con todos los parametros
     * @param resolucion
     * @param tdt
     * @param precio_base
     * @param color
     * @param consumoEneretico
     * @param peso 
     */
    public Television(double resolucion, boolean tdt, double precio_base, String color, char consumoEneretico, double peso) {
        super(precio_base, color, consumoEneretico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    /**
     * Metodo para sumar al precio final el precio si hay TDT o si las pulgadas son mayor que el max que hemos puesto.
     * @return 
     */
    @Override
    public double precioFinal() {
         
        final int PRECIOAN = 50;
        final double PORCENTAGE = 1.3;
        double precio = super.precioFinal();
        
        if (tdt) precio += PRECIOAN;
        
        
        if (resolucion > 40) precio *= PORCENTAGE;
        
        
        return precio;
    }
    
    

    public double getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    
    
}
