/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomestico;

import Enums.*;
import java.util.Comparator;

/**
 *
 * @author ese_b
 */
public class Electrodomestico {

    //Constantes por defecto
    protected final static String COLORD = "BLANCO";
    protected final static double PRECIOD = 100;
    protected final static char CONSUMOD = 'F';
    protected final static double PESOD = 5;

    //Atributos
    protected double precio_base;
    protected String color;
    protected char consumoEneretico;
    protected double peso;

    //Constructores
    
    /**
     * Constructor por defecto
     */
    public Electrodomestico() {
        this.precio_base = PRECIOD;
        this.color = comprobarColor(COLORD);
        this.consumoEneretico = comprobarConsumoEnergetico(CONSUMOD);
        this.peso = PESOD;
    }

    /**
     * Constuctor con dos paramteros
     * @param precio
     * @param peso 
     */
    public Electrodomestico(double precio, double peso) {
        this.precio_base = precio;
        this.color = comprobarColor(COLORD);
        this.consumoEneretico = comprobarConsumoEnergetico(CONSUMOD);
        this.peso = peso;
    }

    /**
     * Constructor con todos los parametros
     * @param precio_base
     * @param color
     * @param consumoEneretico
     * @param peso 
     */
    public Electrodomestico(double precio_base, String color, char consumoEneretico, double peso) {
        this.precio_base = precio_base;
        this.color = comprobarColor(color);
        this.consumoEneretico = comprobarConsumoEnergetico(consumoEneretico);
        this.peso = peso;
    }

    /**
     * Metodo privado que comprueba si la letra es correcta, si no pone la por defecto
     * @param cons
     * @return 
     */
    private char comprobarConsumoEnergetico(char cons) {
        //poenmos el cahr diractemnete en mayuscula para evitar posibles errores
        char consumo = Character.toUpperCase(cons);
        boolean cierto;

        //Devuelve true si alguno de los elementos coincide, si no devuleve falso.
        cierto = Consumo.stream()
                .anyMatch(c -> c.getConsumo() == consumo);

        return ((cierto) ? consumo : CONSUMOD);
    }

    private String comprobarColor(String color) {

        boolean cierto;
        //Lo mismo que en comprobar pero en color
        cierto = Color.stream()
                .anyMatch(c -> c.getColor().equalsIgnoreCase(color));

        return ((cierto) ? color : COLORD);
    }

    public double precioFinal() {
        //Lo primero que hace es filtrar la letra del consumo, coge la que es igual, luego le suma el precio de ese consumo y se lo suma al precio base, para ello usamos el metodo sum(),
        //para que devuelva la secuendia a dobule.
        precio_base += Consumo.stream().
                filter(p -> p.getConsumo() == getConsumoEneretico())
                .mapToDouble(p -> p.getPrecioConsumo() + getPrecio_base())
                .sum();

        //Coge el atributo peso del enum tamaño, y compara el max peso con el peso introducido por nosotos
        if (Tamanio.stream().max(Comparator.comparing(Tamanio::getPeso)).get().getPeso() < this.getPeso()) {
            //Si el peso introducido es mayor que el que tenemos como max en el enum, le suma ese ultimo
            precio_base += Tamanio.stream().max(Comparator.comparing(Tamanio::getPeso)).get().getPrecio();
        } else {
            //Si no coge el precio del primer peso que sea mayor que el que hemos introducido
            precio_base += Tamanio.stream().filter(p -> p.getPeso() > this.getPeso()).findFirst().get().getPrecio();
        }

        return precio_base;

    }

    public double getPrecio_base() {
        return precio_base;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEneretico() {
        return consumoEneretico;
    }

    public double getPeso() {
        return peso;
    }

    public void setConsumoEneretico(char consumoEneretico) {
        this.consumoEneretico = consumoEneretico;
    }

}
