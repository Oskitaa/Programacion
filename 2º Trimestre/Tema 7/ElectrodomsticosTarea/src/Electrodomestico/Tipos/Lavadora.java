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
public class Lavadora extends Electrodomestico {

    //Constante
    final static int CARGAD = 5;
    
    //Atributos
    private int carga;

    
    //Constructores
    
     /**
      * Constructor por defecto
      */
    public Lavadora() {
        super();
        carga = CARGAD;
    }

    /**
     * Constructor con dos parametros
     * @param precio
     * @param peso 
     */
    public Lavadora(double precio, double peso) {
        super(precio, peso);
        this.carga = CARGAD;
    }

    /**
     * Constructor con todos los parametros
     * @param carga
     * @param precio_base
     * @param color
     * @param consumoEneretico
     * @param peso 
     */
    public Lavadora(int carga, double precio_base, String color, char consumoEneretico, double peso) {
        super(precio_base, color, consumoEneretico, peso);
        this.carga = carga;
    }

    /**
     * Metoo pra sumar el precio final, si la carga introducida es mmayor que la carga max se incrementar el precio.
     * @return 
     */
    @Override
    public double precioFinal() {
        final double precio_fijo = 50;
        final double pesoMax = 30;
        double precio = super.precioFinal();

        if (carga > pesoMax) {
            precio += precio_fijo;
        }

        return precio;
    }

    //Getter
    public int getCarga() {
        return carga;
    }

}
