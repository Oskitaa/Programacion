/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

import java.util.stream.Stream;

/**
 *
 * @author ese_b
 */
public enum Tamanio {

    PEQUEÑO(19, 10),
    MEDIANO(49, 50),
    GRANDE(79, 80),
    EXTRA(80, 100);

    public double peso;
    public double precio;

    private Tamanio(double peso, double precio) {
        this.peso = peso;
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecio() {
        return precio;
    }

    public static Stream<Tamanio> stream() {
        return Stream.of(Tamanio.values());
    }

}
