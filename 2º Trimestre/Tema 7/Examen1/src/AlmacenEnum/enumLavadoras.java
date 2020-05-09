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
public enum enumLavadoras {

    LG("LG", 8, 459),
    BOSH("BOSH", 9, 699),
    SAIVOD("SAIVOD", 5, 229),
    CANDY("CANDY", 9, 539),
    INSEDIT("INSEDIT", 7, 369);

    private String nombre;
    private int carga;
    private double precio;

    private enumLavadoras(String nombre, int carga, double precio) {
        this.nombre = nombre;
        this.carga = carga;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCarga() {
        return carga;
    }

    public double getPrecio() {
        return precio;
    }

}
