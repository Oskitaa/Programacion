/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlmacenEnum;

/**
 *
 * @author ese_b
 */
public enum enumAC {

    FUJITSU("FUJITSU", 2923, 479.20),
    LG("LG", 3010, 583.20),
    DELONGHI("DELONGHI", 2150, 479.20),
    DAIKIN("DAIKIN", 4385, 1349);

    private String nombre;
    private int potencia;
    private double precio;

    private enumAC(String nombre, int potencia, double precio) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    
    

    public int getPotencia() {
        return potencia;
    }

    public double getPrecio() {
        return precio;
    }

}
